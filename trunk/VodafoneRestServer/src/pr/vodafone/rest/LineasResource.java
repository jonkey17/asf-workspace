package pr.vodafone.rest;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import pr.vodafone.rest.data.Linea;
import pr.vodafone.rest.utils.Utils;

@Path("/lineas")
public class LineasResource {

	@Context
	UriInfo uriInfo;

	private String dni = null;

	public LineasResource() {
	}

	public LineasResource(String dni) {
		this.dni = dni;
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Linea> getLineas() {
		try {
			if (dni == null) {
				return Utils.lineasDAOaData(Utils.getBD().obtenerLineas());
			} else {
				return Utils.lineasDAOaData(Utils.getBD().obtenerLineasCliente(
						dni));
			}
		} catch (SQLException ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response newLinea(Linea linea) {
		Response res;
		if (dni == null) {
			res = Response.status(405).build();
		} else {
			try {
				if (!dni.equals(linea.getDni())) {
					res = Response
							.status(409)
							.entity("Put: Linea con dni " + linea.getDni()
									+ " no coincide con usuario actual").build();
				} else if (Utils.getBD().obtenerLinea(linea.getTelefono()) != null) {
					res = Response
							.status(409)
							.entity("Post: La linea con numero "
									+ linea.getTelefono() + " ya existe")
							.build();
				} else {
					URI uri = uriInfo.getAbsolutePathBuilder()
							.path(linea.getTelefono()).build();
					res = Response.created(uri).entity(linea).build();
					Utils.getBD().insertarLinea(Utils.lineaDataADAO(linea));
				}
			} catch (SQLException ex) {
				res = Response.serverError().entity(ex.getMessage()).build();
			}
		}
		return res;
	}

	@Path("{numero}")
	public LineaResource getLinea(@PathParam("numero") String numero) {
		return new LineaResource(numero);
	}

}
