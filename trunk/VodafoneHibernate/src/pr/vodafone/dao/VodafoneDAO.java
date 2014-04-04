package pr.vodafone.dao;

import java.util.List;

import pr.vodafone.entity.Clientes;
import pr.vodafone.entity.Facturas;
import pr.vodafone.entity.Lineas;
import pr.vodafone.facade.ClienteFacade;
import pr.vodafone.facade.FacturaFacade;
import pr.vodafone.facade.LineaFacade;

public class VodafoneDAO {
	

	Lineas getLinea(String telf){
		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.init();
		Lineas linea = lineaFacade.find(telf);
		lineaFacade.close();
		return linea;
		
	}
	
	List<Lineas> getLineas(){
		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.init();
		List<Lineas> listaLineas = lineaFacade.findAll();
		lineaFacade.close();
		return listaLineas;
	}
	
	List<Lineas> getLineasByEstado(boolean activa){
		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.init();
		List<Lineas> listaLineas = lineaFacade.findAllByEstado(activa);
		lineaFacade.close();
		return listaLineas;
		
	}
	
	List<Lineas> getLineasByCliente(String dni){
		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.init();
		List<Lineas> listaLineas = lineaFacade.findAllByNombre(dni);
		lineaFacade.close();
		return listaLineas;		
	}
	
	List<Lineas> getLineasByClienteAndEstado(String dni, boolean activa){
		LineaFacade lineaFacade = new LineaFacade();
		lineaFacade.init();
		List<Lineas> listaLineas = lineaFacade.findAllByNombreAndEstado(activa, dni);
		lineaFacade.close();
		return listaLineas;		
	}
	
	void updateLinea(String telf, String newFecha, boolean newEstado, String newPromo,
	String newTDatos, String newTVoz, String newDni){
		
	}
	
	void activateLinea(String telf, boolean activa){
		
	}
	
	Clientes getCliente(String dni){
		ClienteFacade clienteFacade = new ClienteFacade();
		clienteFacade.init();
		Clientes cliente = clienteFacade.find(dni);
		clienteFacade.close();
		return cliente;		
	}
	
	List<Clientes> getClientes(){		
		ClienteFacade clienteFacade = new ClienteFacade();
		clienteFacade.init();
		List<Clientes> listaClientes= clienteFacade.findAll();
		clienteFacade.close();
		return listaClientes;
	}
	
	void updateCliente(String dni, String newNombre, String newDir, String newEmail){
		
	}
	
	Facturas getFactura(int id){
		FacturaFacade facturaFacade = new FacturaFacade();
		facturaFacade.init();
		Facturas factura = facturaFacade.find(id);
		facturaFacade.close();
		return factura;
	}
	
	List<Facturas> getFacturasByLinea(String telf){
		FacturaFacade facturaFacade = new FacturaFacade();
		facturaFacade.init();
		List<Facturas> listaFacturas = facturaFacade.findAllByLinea(telf);
		facturaFacade.close();
		return listaFacturas;
		
	}
}
