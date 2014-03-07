package pr.vodafone.data;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Terminal {

	private int id;
	private String marca;
	private String modelo;
	private float precio;
	private float oro;
	private float plata;
	private float bronce;
	
	public Terminal() {
	}
	
	public Terminal(int id, String marca, String modelo, float precio,
			float oro, float plata, float bronce) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.oro = oro;
		this.plata = plata;
		this.bronce = bronce;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getOro() {
		return oro;
	}
	public void setOro(float oro) {
		this.oro = oro;
	}
	public float getPlata() {
		return plata;
	}
	public void setPlata(float plata) {
		this.plata = plata;
	}
	public float getBronce() {
		return bronce;
	}
	public void setBronce(float bronce) {
		this.bronce = bronce;
	}
	
}
