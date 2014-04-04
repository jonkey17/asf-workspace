package pr.vodafone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facturas {
	@Id
	private int idFactura;
	private String fecha;
	private String periodo;
	private float importe;
	private String telefono;
	
	public Facturas(){
		super();
	}
	public Facturas(String fecha, String periodo, float importe,
			String telefono) {
		super();
		this.fecha = fecha;
		this.periodo = periodo;
		this.importe = importe;
		this.telefono = telefono;
	}
	public Facturas(int idFactura, String fecha, String periodo, float importe,
			String telefono) {
		super();
		this.idFactura = idFactura;
		this.fecha = fecha;
		this.periodo = periodo;
		this.importe = importe;
		this.telefono = telefono;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
