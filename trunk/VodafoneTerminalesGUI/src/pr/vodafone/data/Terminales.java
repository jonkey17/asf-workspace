package pr.vodafone.data;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Terminales {
	
	private ArrayList<Terminal> listaTerminales;
	
	public Terminales() {
	}

	public Terminales(ArrayList<Terminal> terminales) {
		super();
		this.listaTerminales = terminales;
	}

	public ArrayList<Terminal> getListaTerminales() {
		return listaTerminales;
	}

	@XmlElementWrapper(name = "listaTerminales")
	@XmlElement(name = "terminal")
	public void setListaTerminales(ArrayList<Terminal> listaTerminales) {
		this.listaTerminales = listaTerminales;
	}	

}
