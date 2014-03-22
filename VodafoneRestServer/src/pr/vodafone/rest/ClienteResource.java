package pr.vodafone.rest;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pr.vodafone.rest.data.Cliente;
import pr.vodafone.rest.utils.Utils;

public class ClienteResource {

	private String dni;

	public ClienteResource(String dni) {
		this.dni = dni;
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Cliente> getCliente() {
		try {
			Vector<pr.vodafone.dao.dto.Cliente> clientes = Utils.getBD()
					.obtenerClientes();
			for (int i = 0; i < clientes.size(); i++) {
				if (!clientes.get(i).getDni().contains(dni)) {
					clientes.remove(i);
					i--;
				}
			}
			return Utils.clientesDAOaData(clientes);
		} catch (SQLException ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response editCliente(Cliente cliente) {
		Response res;
		try {
			if (!dni.equals(cliente.getDni())) {
				res = Response
						.status(409)
						.entity("Put: Cliente con dni " + cliente.getDni()
								+ " no coincide con cliente actual").build();
			} else if (Utils.getBD().obtenerCliente(cliente.getDni()) != null) {
				res = Response.ok().entity(cliente).build();
				Utils.getBD().actualizarCliente(cliente.getDni(),
						Utils.clienteDataADAO(cliente));
			} else {
				res = Response
						.status(404)
						.entity("Post: El cliente con dni " + cliente.getDni()
								+ " no existe").build();
			}
		} catch (SQLException ex) {
			res = Response.serverError().entity(ex.getMessage()).build();
		}
		return res;
	}

	@Path("lineas")
	public LineasResource getLinea() {
		return new LineasResource(dni);
	}

}
