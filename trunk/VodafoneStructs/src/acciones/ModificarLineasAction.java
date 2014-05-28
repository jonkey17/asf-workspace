package acciones;

import java.util.List;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Clientes;
import pr.vodafone.entity.Lineas;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ModificarLineasAction extends ActionSupport implements Preparable {

	private Lineas linea;
	private List<Clientes> clientes;
	
	@Override
	public void prepare() throws Exception {
		linea= VodafoneDAO.getLinea("666111000");
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

}
