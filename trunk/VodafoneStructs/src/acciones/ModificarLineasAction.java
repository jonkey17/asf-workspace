package acciones;

import java.util.List;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Clientes;
import pr.vodafone.entity.Lineas;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ModificarLineasAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = -1782503946953346037L;
	private Lineas linea;
	private List<Clientes> clientes;
	private String telefono;
	private String dni;
	
	@Override
	public void prepare() throws Exception {
		linea= VodafoneDAO.getLinea(telefono);
		//linea=new Lineas("6100000", "asd", true, "12", "123", "asd", "234123");
		clientes= VodafoneDAO.getClientes();
	}
	
	
	public String execute() throws Exception {
        if (linea.getTelefono() == null || linea.getDni() == null) {
			addActionError("Compulsory to specify both telephone and client!");
			return INPUT;
		}
		if(VodafoneDAO.getLinea(linea.getTelefono()) == null){
            addActionError("No existe ninguna linea con este telefono");
            return ERROR;
		}else{
			System.out.println(linea.toString());
			VodafoneDAO.updateLinea(linea.getTelefono(), linea.getAntiguedad(), linea.isActiva(), linea.getPromocion(), linea.getTarifaDatos(), linea.getTarifaVoz(), linea.getDni());
			return SUCCESS;
		}
	}


	public Lineas getLinea() {
		return linea;
	}


	public void setLinea(Lineas linea) {
		this.linea = linea;
	}
	
	public List<Clientes> getClientes() {
		return clientes;
	}


	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

}
