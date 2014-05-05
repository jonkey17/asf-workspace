package pr.vodafone.dao;

import java.util.List;

import pr.vodafone.entity.Clientes;
import pr.vodafone.entity.Facturas;
import pr.vodafone.entity.Lineas;
import pr.vodafone.facade.ClienteFacade;
import pr.vodafone.facade.FacturaFacade;
import pr.vodafone.facade.LineaFacade;
import pr.vodafone.persistenceunitsingleton.Singleton;

public class VodafoneDAO {

	public static Lineas getLinea(String telf) {
		LineaFacade lineaFacade = new LineaFacade();
		Lineas linea = lineaFacade.find(telf);
		return linea;
	}

	public static List<Lineas> getLineas() {
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAll();
		return listaLineas;
	}

	public static List<Lineas> getLineasByEstado(boolean activa) {
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByEstado(activa);
		return listaLineas;
	}

	public static List<Lineas> getLineasByCliente(String dni) {
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByNombre(dni);
		return listaLineas;
	}

	public static List<Lineas> getLineasByClienteAndEstado(String dni,
			boolean activa) {
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByNombreAndEstado(activa,
				dni);
		return listaLineas;
	}

	public static void updateLinea(String telf, String newFecha,
			boolean newEstado, String newPromo, String newTDatos,
			String newTVoz, String newDni) {
		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.edit(new Lineas(telf, newFecha, newEstado, newTVoz,
				newTDatos, newPromo, newDni));
	}

	public static void activateLinea(String telf, boolean activa) {
		Lineas linea = getLinea(telf);
		linea.setActiva(activa);

		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.edit(linea);
	}

	public static Clientes getCliente(String dni) {
		ClienteFacade clienteFacade = new ClienteFacade();
		Clientes cliente = clienteFacade.find(dni);
		return cliente;
	}

	public static List<Clientes> getClientes() {
		ClienteFacade clienteFacade = new ClienteFacade();
		List<Clientes> listaClientes = clienteFacade.findAll();
		return listaClientes;
	}

	public static void updateCliente(String dni, String newNombre,
			String newDir, String newEmail) {
		ClienteFacade clienteFacade = new ClienteFacade();
		clienteFacade.edit(new Clientes(dni, newNombre, newDir, newEmail));
	}

	public static Facturas getFactura(int id) {
		FacturaFacade facturaFacade = new FacturaFacade();
		Facturas factura = facturaFacade.find(id);
		return factura;
	}

	public static List<Facturas> getFacturasByLinea(String telf) {
		FacturaFacade facturaFacade = new FacturaFacade();
		List<Facturas> listaFacturas = facturaFacade.findAllByLinea(telf);
		return listaFacturas;
	}

	public static void main(String[] args) {

		System.out.println();
		System.out.println("PRUEBAS DE LAS LINEAS");
		System.out.println("-----------------------");
		System.out.println();
		
		System.out.println("Prueba metodo getLineas()");
		List<Lineas> listaLineas = getLineas();
		for (int k = 0; k < listaLineas.size(); k++)
			System.out.println(listaLineas.get(k));

		System.out.println("Prueba metodo getLinea(666333000)");
		Lineas linea = getLinea("666333000");
		System.out.println(linea);

		System.out.println("Prueba metodo getLineasByEstado(true)");
		List<Lineas> listaLineasByEstado = getLineasByEstado(true);
		for (int k = 0; k < listaLineasByEstado.size(); k++)
			System.out.println(listaLineasByEstado.get(k));

		System.out.println("Prueba metodo getLineasByCliente(111)");
		List<Lineas> listaLineasByCliente = getLineasByCliente("111");
		for (int k = 0; k < listaLineasByCliente.size(); k++)
			System.out.println(listaLineasByCliente.get(k));

		System.out
				.println("Prueba metodo getLineasByClienteAndEstado(111,true)");
		List<Lineas> listaLineasByClienteAndEstado = getLineasByClienteAndEstado(
				"111", true);
		for (int k = 0; k < listaLineasByClienteAndEstado.size(); k++)
			System.out.println(listaLineasByClienteAndEstado.get(k));

		System.out
				.println("Prueba metodo updateLinea(666111000, 23-12-1991, false, Ninguna ");
		System.out.println("Linea sin actualizar " + getLinea("666111000"));
		updateLinea("666111000", "23-12-1991", false, "Ninguna", "No",
				"Consumo", "111");
		System.out.println("Linea actualizada " + getLinea("666111000"));

		System.out.println("Prueba metodo activateLinea");
		System.out.println("Estado linea: " + getLinea("666111000").isActiva());
		activateLinea("666111000", true);
		System.out.println("Estado linea: " + getLinea("666111000").isActiva());
		
		System.out.println();
		System.out.println("PRUEBAS DE LOS CLIENTES");
		System.out.println("-----------------------");
		System.out.println();
		
		System.out.println("Prueba metodo getCliente");
		System.out.println(getCliente("111").getNombre());

		System.out.println("Prueba metodo getClientes");
		List<Clientes> clientes = getClientes();
		for (Clientes c : clientes) {
			System.out.println("Cliente: " + c.getNombre());
		}

		System.out.println("Prueba metodo updateCliente");
		System.out.println(getCliente("111").getNombre());
		updateCliente("111", "Nuevo nombre", "Dir", "Mail");
		System.out.println(getCliente("111").getNombre());
		
		System.out.println();
		System.out.println("PRUEBAS DE LAS FACTURAS");
		System.out.println("-----------------------");
		System.out.println();

		System.out.println("Prueba metodo getFactura");
		System.out.println(getFactura(1).getImporte());

		System.out.println("Prueba metodo getFacturasByLinea");
		List<Facturas> facturas = getFacturasByLinea("666111000");
		for (Facturas f : facturas) {
			System.out.println("ID linea: " + f.getIdFactura());
		}

		Singleton.close();

	}
}