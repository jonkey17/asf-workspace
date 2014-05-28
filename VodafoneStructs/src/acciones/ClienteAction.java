package acciones;

import java.util.List;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Clientes;
import pr.vodafone.entity.Lineas;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ClienteAction extends ActionSupport implements Preparable{

	private static final long serialVersionUID = 6413373658425977437L;
	
	private List<Lineas> lineas = null;
	private Clientes cliente = null;
	private String dni = "111";
	

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		cliente = VodafoneDAO.getCliente(dni);
		lineas = VodafoneDAO.getLineasByCliente(dni);
	}
	
	@Override
	public String execute() throws Exception {
		if(getDNI() == null){
			addActionError("Obligatorio introducir DNI");
			return INPUT; 
		}
		if(cliente == null){
			addActionError("El usuario no existe");
            return ERROR;
		}else{
			return SUCCESS;
		}
	}
	
	public String getDNI(){
		return dni;
	}

	
}
