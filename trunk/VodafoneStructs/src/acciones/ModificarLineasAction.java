package acciones;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Lineas;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ModificarLineasAction extends ActionSupport implements Preparable {

	private Lineas linea;
	
	@Override
	public void prepare() throws Exception {
		linea= VodafoneDAO.getLinea("666111000");
		//linea=new Lineas("6100000", "asd", true, "12", "123", "asd", "234123");
	}
	
	public String execute() throws Exception {
        if (linea.getTelefono() == null || linea.getDni()== null) {
			addActionError("Compulsory to specify both telephone and client!");
			return INPUT;
		}
		/*if(!getUsername().equals("Admin") || !getPassword().equals("Admin")){
            addActionError(getText("invalid_login_details"));
            return ERROR;
		}*/else{
			return SUCCESS;
		}
	}


	public Lineas getLinea() {
		return linea;
	}


	public void setLinea(Lineas linea) {
		this.linea = linea;
	}

}
