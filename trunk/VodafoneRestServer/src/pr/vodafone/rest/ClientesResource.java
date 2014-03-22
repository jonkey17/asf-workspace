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

import pr.vodafone.rest.data.Cliente;
import pr.vodafone.rest.utils.Utils;

@Path("/clientes")
public class ClientesResource {

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Cliente> getClientes() {
		try {
			return Utils.clientesDAOaData(Utils.getBD().obtenerClientes());
		} catch (Exception ex) {
			throw new WebApplicationException(Response.serverError()
					.entity(ex.getMessage()).build());
		}
	}

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response newCliente(@Context UriInfo uriInfo, Cliente cliente) {
		Response res;
		try {
			if (Utils.getBD().obtenerCliente(cliente.getDni()) != null) {
				res = Response
						.status(409)
						.entity("Post: El cliente con dni " + cliente.getDni()
								+ " ya existe").build();
			} else {
				URI uri = uriInfo.getAbsolutePathBuilder()
						.path(cliente.getDni()).build();
				res = Response.created(uri).entity(cliente).build(); // Code 201
				Utils.getBD().insertarCliente(Utils.clienteDataADAO(cliente));
			}
		} catch (SQLException ex) {
			res = Response.serverError().entity(ex.getMessage()).build();
		}
		return res;
	}

	@Path("{cliente}")
	public ClienteResource getCliente(@PathParam("cliente") String dni) {
		return new ClienteResource(dni);
	}

}
