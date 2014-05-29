package acciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import pr.vodafone.dao.VodafoneDAO;
import pr.vodafone.entity.Clientes;
import pr.vodafone.entity.Lineas;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LineasAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 5764130778441460318L;
	private List<Lineas> lineas = null;
	private String dni = null;
	private Clientes cliente = null;
	private String telefono = null;
	private String nombre = null;
	private HashMap<String, Integer> numFacturas = null;

	@Override
	public void prepare() throws Exception {
		System.out.println("Prepare lineas");
		cliente = VodafoneDAO.getCliente(dni);
		nombre = cliente.getNombre();
		lineas = VodafoneDAO.getLineasByCliente(dni);
		System.out.println("Lineas: " + lineas.size());
		numFacturas = new HashMap<String, Integer>();
		for (Lineas l : lineas) {
			numFacturas.put(l.getTelefono(),
					VodafoneDAO.getFacturasByLinea(l.getTelefono()).size());
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String doFilter() {
		ArrayList<Lineas> lineasActivas = new ArrayList<Lineas>();
		for (Lineas l : lineas) {
			if (l.isActiva())
				lineasActivas.add(l);
		}
		this.lineas = lineasActivas;
		return SUCCESS;
	}

	public String doChangeStatus() throws Exception {
		System.out.println("Change status");
		Lineas linea = VodafoneDAO.getLinea(telefono);
		linea.setActiva(!linea.isActiva());
		VodafoneDAO.updateLinea(linea.getTelefono(), linea.getAntiguedad(),
				linea.isActiva(), linea.getPromocion(), linea.getTarifaDatos(),
				linea.getTarifaVoz(), linea.getDni());
		prepare();
		return SUCCESS;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Lineas> getLineas() {
		return lineas;
	}

	public void setLineas(List<Lineas> lineas) {
		this.lineas = lineas;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public HashMap<String, Integer> getNumFacturas() {
		return numFacturas;
	}
	
	public void setNumFacturas(HashMap<String, Integer> numFacturas) {
		this.numFacturas = numFacturas;
	}
}
