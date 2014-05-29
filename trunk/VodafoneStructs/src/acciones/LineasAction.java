package acciones;

import java.util.List;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Clientes;
import pr.vodafone.entity.Lineas;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LineasAction extends ActionSupport implements Preparable{

	private List<Lineas> lineas = null;
	private String dni = null;
	private Clientes cliente = null;
	
	@Override
	public void prepare() throws Exception {
		System.out.println("Prepare lineas");
		cliente = VodafoneDAO.getCliente(dni);
		lineas = VodafoneDAO.getLineasByCliente(dni);
		System.out.println("Lineas: " + lineas.size());
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public List<Lineas> getLineas() {
		return lineas;
	}
	
	public void setLineas(List<Lineas> lineas) {
		this.lineas = lineas;
	}
	
	public Clientes getCliente() {
		return cliente;
	}
	
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
}
