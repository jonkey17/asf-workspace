package pr.vodafone.dao;

import java.util.List;

import pr.vodafone.entity.Clientes;
import pr.vodafone.entity.Facturas;
import pr.vodafone.entity.Lineas;
import pr.vodafone.facade.ClienteFacade;
import pr.vodafone.facade.FacturaFacade;
import pr.vodafone.facade.LineaFacade;

public class VodafoneDAO {
	

	public static Lineas getLinea(String telf){
		LineaFacade lineaFacade = new LineaFacade();
		Lineas linea = lineaFacade.find(telf);
		lineaFacade.close();
		return linea;	
	}
	
	public static List<Lineas> getLineas(){
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAll();
		lineaFacade.close();
		return listaLineas;
	}
	
	public static List<Lineas> getLineasByEstado(boolean activa){
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByEstado(activa);
		lineaFacade.close();
		return listaLineas;
	}
	
	public static List<Lineas> getLineasByCliente(String dni){
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByNombre(dni);
		lineaFacade.close();
		return listaLineas;		
	}
	
	public static List<Lineas> getLineasByClienteAndEstado(String dni, boolean activa){
		LineaFacade lineaFacade = new LineaFacade();
		List<Lineas> listaLineas = lineaFacade.findAllByNombreAndEstado(activa, dni);
		lineaFacade.close();
		return listaLineas;		
	}
	
	public static void updateLinea(String telf, String newFecha, boolean newEstado, String newPromo, String newTDatos, String newTVoz, String newDni){
		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.edit(new Lineas(telf,newFecha,newEstado,newTVoz,newTDatos,newPromo,newDni));
		lineaFacade.close();
	}
	
	public void activateLinea(String telf, boolean activa){
		
	}
	
	public Clientes getCliente(String dni){
		ClienteFacade clienteFacade = new ClienteFacade();
		Clientes cliente = clienteFacade.find(dni);
		clienteFacade.close();
		return cliente;		
	}
	
	public List<Clientes> getClientes(){		
		ClienteFacade clienteFacade = new ClienteFacade();
		List<Clientes> listaClientes= clienteFacade.findAll();
		clienteFacade.close();
		return listaClientes;
	}
	
	public void updateCliente(String dni, String newNombre, String newDir, String newEmail){
		ClienteFacade clienteFacade = new ClienteFacade();
		clienteFacade.edit(new Clientes(dni,newNombre,newDir,newEmail));
		clienteFacade.close();
	}
	
	public Facturas getFactura(int id){
		FacturaFacade facturaFacade = new FacturaFacade();
		Facturas factura = facturaFacade.find(id);
		facturaFacade.close();
		return factura;
	}
	
	public List<Facturas> getFacturasByLinea(String telf){
		FacturaFacade facturaFacade = new FacturaFacade();
		List<Facturas> listaFacturas = facturaFacade.findAllByLinea(telf);
		facturaFacade.close();
		return listaFacturas;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Prueba método getLineas()");
		List<Lineas> listaLineas = getLineas();
		for(int k=0;k<listaLineas.size();k++)
			System.out.println(listaLineas.get(k));
		
		System.out.println("\n Prueba método getLinea(666333000) ");
		Lineas linea = getLinea("666333000");
		System.out.println(linea);
		
		System.out.println("\n Prueba método getLineasByEstado(true) ");
		List<Lineas> listaLineasByEstado = getLineasByEstado(true);
		for(int k=0;k<listaLineasByEstado.size();k++)
			System.out.println(listaLineasByEstado.get(k));
		
		System.out.println("\n Prueba método getLineasByCliente(111) ");
		List<Lineas> listaLineasByCliente = getLineasByCliente("111");
		for(int k=0;k<listaLineasByCliente.size();k++)
			System.out.println(listaLineasByCliente.get(k));
		
		System.out.println("\n Prueba método getLineasByClienteAndEstado(111,true) ");
		List<Lineas> listaLineasByClienteAndEstado = getLineasByClienteAndEstado("111",true);
		for(int k=0;k<listaLineasByClienteAndEstado.size();k++)
			System.out.println(listaLineasByClienteAndEstado.get(k));
		
		System.out.println("\n Prueba método updateLinea(666111000, 23-12-1991, false, Ninguna ");
		updateLinea("666111000", "23-01-1992", true, "Ninguna", "Si", "Consumo", "111");
		System.out.println("Linea sin actualizar "+getLinea("666333000"));
		updateLinea("666111000", "23-12-1991", false, "Ninguna", "No", "Consumo", "111");
		System.out.println("Linea actualizada "+getLinea("666333000"));
	}
}