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
	

	public static Lineas getLinea(String telf){
		LineaFacade lineaFacade = new LineaFacade();
		Lineas linea = lineaFacade.find(telf);
		return linea;	
	}
	
	public static List<Lineas> getLineas(){
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAll();
		return listaLineas;
	}
	
	public static List<Lineas> getLineasByEstado(boolean activa){
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByEstado(activa);
		return listaLineas;
	}
	
	public static List<Lineas> getLineasByCliente(String dni){
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByNombre(dni);
		return listaLineas;		
	}
	
	public static List<Lineas> getLineasByClienteAndEstado(String dni, boolean activa){
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByNombreAndEstado(activa, dni);
		return listaLineas;		
	}
	
	public static void updateLinea(String telf, String newFecha, boolean newEstado, String newPromo, String newTDatos, String newTVoz, String newDni){
		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.edit(new Lineas(telf,newFecha,newEstado,newTVoz,newTDatos,newPromo,newDni));
	}
	
	public void activateLinea(String telf, boolean activa){
		
	}
	
	public Clientes getCliente(String dni){
		ClienteFacade clienteFacade = new ClienteFacade();
		Clientes cliente = clienteFacade.find(dni);
		return cliente;		
	}
	
	public List<Clientes> getClientes(){		
		ClienteFacade clienteFacade = new ClienteFacade();
		List<Clientes> listaClientes= clienteFacade.findAll();
		return listaClientes;
	}
	
	public void updateCliente(String dni, String newNombre, String newDir, String newEmail){
		ClienteFacade clienteFacade = new ClienteFacade();
		clienteFacade.edit(new Clientes(dni,newNombre,newDir,newEmail));
	}
	
	public Facturas getFactura(int id){
		FacturaFacade facturaFacade = new FacturaFacade();
		Facturas factura = facturaFacade.find(id);
		return factura;
	}
	
	public List<Facturas> getFacturasByLinea(String telf){
		FacturaFacade facturaFacade = new FacturaFacade();
		List<Facturas> listaFacturas = facturaFacade.findAllByLinea(telf);
		return listaFacturas;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Prueba m�todo getLineas()");
		List<Lineas> listaLineas = getLineas();
		for(int k=0;k<listaLineas.size();k++)
			System.out.println(listaLineas.get(k));
		
		System.out.println("\n Prueba m�todo getLinea(666333000) ");
		Lineas linea = getLinea("666333000");
		System.out.println(linea);
		
		System.out.println("\n Prueba m�todo getLineasByEstado(true) ");
		List<Lineas> listaLineasByEstado = getLineasByEstado(true);
		for(int k=0;k<listaLineasByEstado.size();k++)
			System.out.println(listaLineasByEstado.get(k));
		
		System.out.println("\n Prueba m�todo getLineasByCliente(111) ");
		List<Lineas> listaLineasByCliente = getLineasByCliente("111");
		for(int k=0;k<listaLineasByCliente.size();k++)
			System.out.println(listaLineasByCliente.get(k));
		
		System.out.println("\n Prueba m�todo getLineasByClienteAndEstado(111,true) ");
		List<Lineas> listaLineasByClienteAndEstado = getLineasByClienteAndEstado("111",true);
		for(int k=0;k<listaLineasByClienteAndEstado.size();k++)
			System.out.println(listaLineasByClienteAndEstado.get(k));
		
		System.out.println("\n Prueba m�todo updateLinea(666111000, 23-12-1991, false, Ninguna ");
		//updateLinea("666111000", "23-01-1992", true, "Ninguna", "Si", "Consumo", "111");
		System.out.println("Linea sin actualizar "+getLinea("666111000"));
		updateLinea("666111000", "23-12-1991", false, "Ninguna", "No", "Consumo", "111");
		System.out.println("Linea actualizada "+getLinea("666111000"));
		
		Singleton.close();
		
	}
}