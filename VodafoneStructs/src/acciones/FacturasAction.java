package acciones;

import java.util.List;

import pr.vodafone.entity.Facturas;
import pr.vodafone.entity.Lineas;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class FacturasAction extends ActionSupport implements Preparable {

	private List<Facturas> listaFacturas = null;
	private Lineas linea=null;
	
	private String numeroTel="666111001";
	
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

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	@Override
	public void prepare() throws Exception {
		
		this.listaFacturas = new java.util.ArrayList<Facturas>();
		listaFacturas.add(new Facturas(1, "12-12-12", "sdf", 12, "6100001"));
		listaFacturas.add(new Facturas(2, "12-1-1", "saa", 12, "6666666"));
		//listaFacturas=VodafoneDAO.getFacturasByLinea(numeroTel);
		
		//linea= VodafoneDAO.getLinea(numeroTel);
		linea=new Lineas("6100001", "asd", true, "12", "123", "asd", "234123");
	}

}
