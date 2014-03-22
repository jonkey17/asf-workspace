package pr.vodafone.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pr.vodafone.rest.data.Linea;
import pr.vodafone.rest.utils.Utils;

public class LineaResource {

	private String num;

	public LineaResource(String num) {
		this.num = num;
		try {
			if (Utils.getBD().obtenerLinea(num) == null) {
				throw new WebApplicationException(Response
						.status(404)
						.entity("Post: La linea con numero " + num
								+ " no existe").build());
			}
		} catch (SQLException ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Linea getLinea() {
		try {
			return Utils.lineaDAOaData(Utils.getBD().obtenerLinea(num));
		} catch (SQLException ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response editLinea(Linea linea) {
		Response res;
		try {
			if (!num.equals(linea.getTelefono())) {
				res = Response
						.status(409)
						.entity("Put: Linea con numero " + linea.getTelefono()
								+ " no coincide con linea actual").build();
			} else {
				res = Response.ok().entity(linea).build();
				Utils.getBD().actualizarLinea(linea.getTelefono(),
						Utils.lineaDataADAO(linea));
			}
		} catch (SQLException ex) {
			res = Response.serverError().entity(ex.getMessage()).build();
		}
		return res;
	}

	@Path("facturas")
	public FacturasResource getFacturas() {
		return new FacturasResource(num);
	}

}
