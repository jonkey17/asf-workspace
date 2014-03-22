package pr.vodafone.rest.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import pr.vodafone.dao.GestorBD;
import pr.vodafone.rest.data.Cliente;
import pr.vodafone.rest.data.Factura;
import pr.vodafone.rest.data.Linea;

public class Utils {

	private Utils() {
	}

	private static GestorBD bd;

	static {
		bd = new GestorBD();
		try {
			bd.conectar();
		} catch (Exception e) {
			e.printStackTrace();
			bd = null;
		}
	}

	public static GestorBD getBD() {
		return bd;
	}

	public static List<Cliente> clientesDAOaData(
			Vector<pr.vodafone.dao.dto.Cliente> clientes) {
		ArrayList<Cliente> list = new ArrayList<Cliente>();
		for (pr.vodafone.dao.dto.Cliente c : clientes) {
			list.add(clienteDAOaData(c));
		}
		return list;
	}

	public static Cliente clienteDAOaData(pr.vodafone.dao.dto.Cliente cliente) {
		return new Cliente(cliente.getDni(), cliente.getNombre(),
				cliente.getDireccion(), cliente.getEmail());
	}

	public static pr.vodafone.dao.dto.Cliente clienteDataADAO(Cliente cliente) {
		return new pr.vodafone.dao.dto.Cliente(cliente.getDni(),
				cliente.getNombre(), cliente.getDireccion(), cliente.getEmail());
	}

	public static List<Linea> lineasDAOaData(
			Vector<pr.vodafone.dao.dto.Linea> lineas) {
		ArrayList<Linea> list = new ArrayList<Linea>();
		for (pr.vodafone.dao.dto.Linea l : lineas) {
			list.add(lineaDAOaData(l));
		}
		return list;
	}

	public static Linea lineaDAOaData(pr.vodafone.dao.dto.Linea linea) {
		return new Linea(linea.getTelefono(), linea.getAntiguedad(),
				linea.isActiva(), linea.getTarifaVoz(), linea.getTarifaDatos(),
				linea.getPromocion(), linea.getDni());
	}

	public static pr.vodafone.dao.dto.Linea lineaDataADAO(Linea linea) {
		return new pr.vodafone.dao.dto.Linea(linea.getTelefono(),
				linea.getAntiguedad(), linea.isActiva(), linea.getTarifaVoz(),
				linea.getTarifaDatos(), linea.getPromocion(), linea.getDni());
	}

	public static List<Factura> facturasDAOaData(
			Vector<pr.vodafone.dao.dto.Factura> facturas) {
		ArrayList<Factura> list = new ArrayList<Factura>();
		for (pr.vodafone.dao.dto.Factura f : facturas) {
			list.add(facturaDAOaData(f));
		}
		return list;
	}

	public static Factura facturaDAOaData(pr.vodafone.dao.dto.Factura factura) {
		return new Factura(factura.getIdFactura(), factura.getFecha(),
				factura.getPeriodo(), factura.getImporte(),
				factura.getTelefono());
	}

	public static pr.vodafone.dao.dto.Factura facturaDataADAO(Factura factura) {
		return new pr.vodafone.dao.dto.Factura(factura.getIdFactura(),
				factura.getFecha(), factura.getPeriodo(), factura.getImporte(),
				factura.getTelefono());
	}

}
