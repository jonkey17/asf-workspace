package acciones;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Clientes;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ModificarClienteAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 580983934707398274L;
	private Clientes cliente;
	private String dni;
	private String nombre;
	private String direccion;
	private String email;

	@Override
	public void prepare() throws Exception {
		cliente = VodafoneDAO.getCliente(dni);
	}

	public String execute() throws Exception {
		System.out.println(cliente.toString());
		VodafoneDAO.updateCliente(cliente.getDni(), getNombre(),
				getDireccion(), getEmail());
		return SUCCESS;
	}
	
	public String doShow() throws Exception{
		return SUCCESS;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
