package acciones;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Clientes;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ModificarClienteAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 580983934707398274L;
	private Clientes cliente;

	@Override
	public void prepare() throws Exception {
		cliente = VodafoneDAO.getCliente("111");
	}

	public String execute() throws Exception {
		System.out.println(cliente.toString());
		VodafoneDAO.updateCliente(cliente.getDni(), cliente.getNombre(),
				cliente.getDireccion(), cliente.getEmail());
		return SUCCESS;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
}
