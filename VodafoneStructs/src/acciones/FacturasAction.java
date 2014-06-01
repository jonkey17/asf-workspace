package acciones;

import java.util.List;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Facturas;
import pr.vodafone.entity.Lineas;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class FacturasAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 8056869090519733296L;
	private List<Facturas> listaFacturas = null;
	private Lineas linea=null;
	
	private String telefono;
	private String dni;
	
	public List<Facturas> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(List<Facturas> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public Lineas getLinea() {
		return linea;
	}

	public void setLinea(Lineas linea) {
		this.linea = linea;
	}

	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}
	
	@Override
	public void prepare() throws Exception {
		this.listaFacturas = new java.util.ArrayList<Facturas>();
		listaFacturas=VodafoneDAO.getFacturasByLinea(telefono);
		linea= VodafoneDAO.getLinea(telefono);
	}

}
