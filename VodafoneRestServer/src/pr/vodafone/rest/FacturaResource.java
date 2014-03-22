package pr.vodafone.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pr.vodafone.rest.data.Factura;
import pr.vodafone.rest.utils.Utils;

public class FacturaResource {

	private int id;

	public FacturaResource(int id) {
		this.id = id;
		try {
			if (Utils.getBD().obtenerFactura(id) == null) {
				throw new WebApplicationException(Response
						.status(404)
						.entity("No se ha encontrado ninguna factura con id "
								+ id).build());
			}
		} catch (SQLException ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Factura getFactura() {
		try {
			return Utils.facturaDAOaData(Utils.getBD().obtenerFactura(id));
		} catch (SQLException ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response editFactura(Factura factura) {
		Response res;
		try {
			if (id != factura.getIdFactura()) {
				res = Response
						.status(409)
						.entity("Put: Factura con id " + factura.getIdFactura()
								+ " no coincide con id actual").build();
			} else {
				res = Response.ok().entity(factura).build();
				Utils.getBD().actualizarFactura(factura.getIdFactura(),
						Utils.facturaDataADAO(factura));
			}
		} catch (SQLException ex) {
			res = Response.serverError().entity(ex.getMessage()).build();
		}
		return res;
	}

	@DELETE
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response deleteFactura() {
		Response res;
		try {
			Utils.getBD().borrarFactura(id);
			res = Response.ok().build();
			return res;
		} catch (SQLException ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

}
