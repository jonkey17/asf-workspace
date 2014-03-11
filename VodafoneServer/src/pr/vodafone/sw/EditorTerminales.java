package pr.vodafone.sw;

import java.sql.SQLException;
import java.util.Vector;

import pr.vodafone.dao.GestorBD;
import pr.vodafone.dao.dto.Terminal;

public class EditorTerminales {
	
	private GestorBD bd;
	
	public EditorTerminales() throws ClassNotFoundException, SQLException {
		bd = new GestorBD();
		bd.conectar();
	}

	public Terminal obtenerTerminal(String idTerminal) {
		try {
			return bd.obtenerTerminal(idTerminal);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Terminal[] obtenerTerminales() {
		try {
			Vector<Terminal> terminales = bd.obtenerTerminales();
			Terminal[] terminalesArray = new Terminal[terminales.size()];
			terminalesArray = terminales.toArray(terminalesArray);
			return terminalesArray;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Terminal[] obtenerTerminalesPorMarca(String marca) {
		try {
			Vector<Terminal> terminales = bd.obtenerTerminalesPorMarca(marca);
			Terminal[] terminalesArray = new Terminal[terminales.size()];
			terminalesArray = terminales.toArray(terminalesArray);
			return terminalesArray;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean insertarTerminal(Terminal terminal) {
		try {
			bd.insertarTerminal(terminal);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean actualizarTerminal(String idTerminal, Terminal terminal) {
		try {
			bd.actualizarTerminal(idTerminal, terminal);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean borrarTerminal(String idTerminal) {
		try {
			bd.borrarTerminal(idTerminal);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
