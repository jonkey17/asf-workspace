package pr.vodafone.sw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.rmi.RemoteException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.axis2.AxisFault;

import pr.vodafone.dao.dto.xsd.Terminal;
import pr.vodafone.data.Terminales;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class VSWTerminales extends javax.swing.JFrame {
	private JTextField cajaId;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton botonCargar;
	private JTextField cajaBronce;
	private JLabel jLabel6;
	private JTextField cajaPlata;
	private JTextField cajaOro;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JButton botonCerrar;
	private JButton botonEnviar;
	private JButton botonEditar;
	private JTable tablaTerminales;
	private JScrollPane jScrollPane1;
	private JLabel jLabel8;
	private JTextField cajaPrecio;
	private JTextField cajaModelo;
	private JTextField cajaMarca;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private EditorTerminalesStub stub;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VSWTerminales inst = new VSWTerminales();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public VSWTerminales() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Gesti�n de Alta de Terminales");
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2);
				jPanel2.setFont(new java.awt.Font("Dialog", 0, 8));
				jPanel2.setBounds(13, 12, 360, 214);
				jPanel2.setLayout(null);
				jPanel2.setBorder(BorderFactory
						.createTitledBorder(null, "Terminales Recibidos",
								TitledBorder.LEADING,
								TitledBorder.DEFAULT_POSITION,
								new java.awt.Font("Segoe UI", 1, 10),
								new java.awt.Color(0, 0, 0)));
				{
					jScrollPane1 = new JScrollPane();
					jPanel2.add(jScrollPane1);
					jScrollPane1.setBounds(12, 24, 336, 152);
					{
						TableModel jTable1Model = new DefaultTableModel(
								new String[] { "Id", "Marca", "Modelo",
										"Precio" }, 6);
						tablaTerminales = new JTable();
						jScrollPane1.setViewportView(tablaTerminales);
						tablaTerminales.setModel(jTable1Model);
					}
				}
				{
					botonEditar = new JButton();
					jPanel2.add(botonEditar);
					botonEditar.setText("Editar");
					botonEditar.setBounds(272, 182, 76, 23);
					botonEditar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonEditar.actionPerformed, event="
											+ evt);
							botonEditar();
						}
					});
				}
				{
					botonCargar = new JButton();
					jPanel2.add(botonCargar);
					botonCargar.setText("Cargar Terminales...");
					botonCargar.setBounds(100, 182, 165, 23);
					botonCargar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonCargar.actionPerformed, event="
											+ evt);
							botonCargar();
						}
					});
				}
			}
			{
				jPanel3 = new JPanel();
				getContentPane().add(jPanel3);
				jPanel3.setFont(new java.awt.Font("Dialog", 0, 8));
				jPanel3.setBounds(13, 232, 359, 254);
				jPanel3.setLayout(null);
				jPanel3.setBorder(BorderFactory.createTitledBorder(null,
						"Asignaci�n de Precios Promocionales",
						TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
						new java.awt.Font("Segoe UI", 1, 10),
						new java.awt.Color(0, 0, 0)));
				{
					jLabel3 = new JLabel();
					jPanel3.add(jLabel3);
					jLabel3.setText("Id:");
					jLabel3.setBounds(10, 24, 64, 16);
				}
				{
					cajaId = new JTextField();
					jPanel3.add(cajaId);
					cajaId.setBounds(99, 21, 71, 23);
					cajaId.setEditable(false);
				}
				{
					cajaMarca = new JTextField();
					jPanel3.add(cajaMarca);
					cajaMarca.setBounds(99, 50, 249, 23);
					cajaMarca.setEditable(false);
				}
				{
					jLabel5 = new JLabel();
					jPanel3.add(jLabel5);
					jLabel5.setText("Marca:");
					jLabel5.setBounds(10, 53, 71, 16);
				}
				{
					jLabel4 = new JLabel();
					jPanel3.add(jLabel4);
					jLabel4.setText("Modelo:");
					jLabel4.setBounds(10, 81, 57, 16);
				}
				{
					cajaModelo = new JTextField();
					jPanel3.add(cajaModelo);
					cajaModelo.setBounds(99, 78, 249, 23);
					cajaModelo.setEditable(false);
				}
				{
					cajaPrecio = new JTextField();
					jPanel3.add(cajaPrecio);
					cajaPrecio.setBounds(99, 107, 249, 23);
					cajaPrecio.setEditable(false);
				}
				{
					jLabel8 = new JLabel();
					jPanel3.add(jLabel8);
					jLabel8.setText("Precio:");
					jLabel8.setBounds(10, 110, 71, 16);
				}
				{
					botonEnviar = new JButton();
					jPanel3.add(botonEnviar);
					botonEnviar.setText("Enviar");
					botonEnviar.setBounds(274, 222, 74, 23);
					botonEnviar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonEnviar.actionPerformed, event="
											+ evt);
							botonEnviar();
						}
					});
				}
				{
					jLabel1 = new JLabel();
					jPanel3.add(jLabel1);
					jLabel1.setText("Promo Oro:");
					jLabel1.setBounds(10, 138, 83, 15);
				}
				{
					jLabel2 = new JLabel();
					jPanel3.add(jLabel2);
					jLabel2.setText("Promo Plata:");
					jLabel2.setBounds(10, 167, 83, 16);
				}
				{
					cajaOro = new JTextField();
					jPanel3.add(cajaOro);
					cajaOro.setBounds(99, 135, 249, 23);
				}
				{
					cajaPlata = new JTextField();
					jPanel3.add(cajaPlata);
					cajaPlata.setBounds(99, 164, 249, 23);
				}
				{
					jLabel6 = new JLabel();
					jPanel3.add(jLabel6);
					jLabel6.setText("Promo Bronce:");
					jLabel6.setBounds(10, 196, 90, 16);
				}
				{
					cajaBronce = new JTextField();
					jPanel3.add(cajaBronce);
					cajaBronce.setBounds(99, 193, 249, 23);
				}
			}
			{
				botonCerrar = new JButton();
				getContentPane().add(botonCerrar);
				botonCerrar.setText("Cerrar");
				botonCerrar.setBounds(157, 492, 79, 23);
				botonCerrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out
								.println("botonCerrar.actionPerformed, event="
										+ evt);
						botonCerrar();
					}
				});
			}
			pack();
			this.setSize(400, 559);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			stub = new EditorTerminalesStub(
					"http://localhost:8080/axis2/services/EditorTerminales");
		} catch (AxisFault e) {
			e.printStackTrace();
			JOptionPane
					.showMessageDialog(
							this,
							"No se ha podido contactar con el servidor. Comprueba que este funcionando y vuelve a intentarlo.",
							"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void botonEditar() {
		DefaultTableModel tableModel = (DefaultTableModel) tablaTerminales
				.getModel();
		int selectedRow = tablaTerminales.getSelectedRow();
		if (selectedRow < 0) {
			JOptionPane.showMessageDialog(this,
					"No has seleccionado ningún terminal para editar",
					"Atención", JOptionPane.WARNING_MESSAGE);
			return;
		}

		String id = (String) tableModel.getValueAt(selectedRow, 0);
		String marca = (String) tableModel.getValueAt(selectedRow, 1);
		String modelo = (String) tableModel.getValueAt(selectedRow, 2);
		float precio = Float.parseFloat((String) tableModel.getValueAt(
				selectedRow, 3));

		cajaId.setText(id);
		cajaMarca.setText(marca);
		cajaModelo.setText(modelo);
		cajaPrecio.setText(precio + "");

	}

	private void botonCargar() {

		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(this);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				File fichero = jfc.getSelectedFile();
				System.out.println(fichero.getAbsolutePath());

				JAXBContext context = JAXBContext.newInstance(Terminales.class);
				Unmarshaller um = context.createUnmarshaller();

				Terminales terminales = (Terminales) um.unmarshal(fichero);

				System.out.println(terminales.getListaTerminales().get(0)
						.getMarca());

				DefaultTableModel tableModel = (DefaultTableModel) tablaTerminales
						.getModel();
				for (int i = 0; i < terminales.getListaTerminales().size(); i++) {
					String[] terminal = {
							terminales.getListaTerminales().get(i).getId() + "",
							terminales.getListaTerminales().get(i).getMarca(),
							terminales.getListaTerminales().get(i).getModelo(),
							terminales.getListaTerminales().get(i).getPrecio()
									+ "" };
					tableModel.insertRow(i, terminal);
				}

			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(this,
						"Error al cargar el archivo, vuelva a intentarlo",
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private void botonEnviar() {
		InsertarTerminal at = new InsertarTerminal();
		Terminal t = new Terminal();
		DefaultTableModel tableModel = (DefaultTableModel) tablaTerminales
				.getModel();
		int selectedRow = tablaTerminales.getSelectedRow();
		if (selectedRow < 0) {
			JOptionPane.showMessageDialog(this,
					"No estás editando ningún terminal", "Atención",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		String id = (String) tableModel.getValueAt(selectedRow, 0);
		String marca = (String) tableModel.getValueAt(selectedRow, 1);
		String modelo = (String) tableModel.getValueAt(selectedRow, 2);
		float precio = Float.parseFloat((String) tableModel.getValueAt(
				selectedRow, 3));
		t.setIdTerminal(id);
		t.setMarca(marca);
		t.setModelo(modelo);
		t.setPrecio(precio);
		try {
			t.setPromoBronce(Float.parseFloat(cajaBronce.getText()));
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this,
					"El precio Bronce debe ser un número válido", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		try {
			t.setPromoPlata(Float.parseFloat(cajaPlata.getText()));
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this,
					"El precio Plata debe ser un número válido", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		try {
			t.setPromoOro(Float.parseFloat(cajaOro.getText()));
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this,
					"El precio Oro debe ser un número válido", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		at.setTerminal(t);
		InsertarTerminalResponse atr;
		try {
			atr = stub.insertarTerminal(at);
			System.out.println("Terminal actualizado = " + atr.get_return());

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	private void botonCerrar() {
		System.exit(0);
	}
}
