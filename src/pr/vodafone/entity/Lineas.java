package pr.vodafone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lineas {
	@Id
	private String telefono;
	private String antiguedad;
	private boolean activa;
	private String tarifaVoz;
	private String tarifaDatos;
	private String promocion;
	private String dni;

	public Lineas(){
		super();
	}
	public Lineas(String telefono, String antiguedad, boolean activa,
			String tarifaVoz, String tarifaDatos, String promocion, String dni) {
		super();
		this.telefono = telefono;
		this.antiguedad = antiguedad;
		this.activa = activa;
		this.tarifaVoz = tarifaVoz;
		this.tarifaDatos = tarifaDatos;
		this.promocion = promocion;
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}
	public boolean isActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	public String getTarifaVoz() {
		return tarifaVoz;
	}
	public void setTarifaVoz(String tarifaVoz) {
		this.tarifaVoz = tarifaVoz;
	}
	public String getTarifaDatos() {
		return tarifaDatos;
	}
	public void setTarifaDatos(String tarifaDatos) {
		this.tarifaDatos = tarifaDatos;
	}
	public String getPromocion() {
		return promocion;
	}
	public void setPromocion(String promocion) {
		this.promocion = promocion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Lineas [telefono=" + telefono + ", antiguedad=" + antiguedad
				+ ", activa=" + activa + ", tarifaVoz=" + tarifaVoz
				+ ", tarifaDatos=" + tarifaDatos + ", promocion=" + promocion
				+ ", dni=" + dni + "]";
	}
	
	
}
