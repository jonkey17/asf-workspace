package acciones;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Clientes;

import com.opensymphony.xwork2.ActionSupport;

public class ClienteAction extends ActionSupport{

	private static final long serialVersionUID = 6413373658425977437L;
	
	private Clientes cliente = null;
	private String dni = null;

	@Override
	public String execute() throws Exception {
		System.out.println("Execute: " + getDni());
		if(getDni() != null && !getDni().isEmpty()){
			cliente = VodafoneDAO.getCliente(dni);
		}else{
			addFieldError("dni", "El dni no puede quedar en blanco");
			return INPUT;
		}
		if(cliente == null){
			addActionError("El usuario no existe");
            return ERROR;
		}else{
			System.out.println(cliente.toString());
			return SUCCESS;
		}
	}
	
	public String doShow() throws Exception{
		return SUCCESS;
	}
	
	public String getDni(){
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
