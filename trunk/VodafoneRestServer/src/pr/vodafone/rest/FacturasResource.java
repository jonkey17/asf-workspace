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

import pr.vodafone.rest.data.Factura;
import pr.vodafone.rest.utils.Utils;

@Path("/facturas")
public class FacturasResource {

	private String num = null;

	public FacturasResource() {
	}

	public FacturasResource(String num) {
		this.num = num;
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Factura> getFacturas() {
		try {
			if (num == null) {
				return Utils.facturasDAOaData(Utils.getBD().obtenerFacturas());
			} else {
				return Utils.facturasDAOaData(Utils.getBD()
						.obtenerFacturasLinea(num));
			}
		} catch (SQLException ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response newFactura(@Context UriInfo uriInfo, Factura factura) {
		Response res;
		if (num == null) {
			res = Response.status(405).build();
		} else {
			try {
				if (!num.equals(factura.getTelefono())) {
					res = Response
							.status(409)
							.entity("Put: Factura con numero "
									+ factura.getTelefono()
									+ " no coincide con linea actual").build();
				} else {
					int id = Utils.getBD().insertarFactura(
							Utils.facturaDataADAO(factura));
					URI uri = uriInfo.getAbsolutePathBuilder()
							.path(id + "").build();
					res = Response.created(uri).entity(factura).build();
				}
			} catch (SQLException ex) {
				res = Response.serverError().entity(ex.getMessage()).build();
			}
		}
		return res;
	}

	@Path("{factura}")
	public FacturaResource getLinea(@PathParam("factura") int id) {
		return new FacturaResource(id);
	}

}
