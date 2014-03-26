package pr.vodafone.rest.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
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
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;

import pr.vodafone.rest.data.Cliente;
import pr.vodafone.rest.data.Linea;
import pr.vodafone.rest.pattern.Singleton;

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
public class VRestClientes extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JButton botonBuscar;
	private JTextField cajaDni;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton botonSalir;
	private JButton botonGuardar;
	private JButton botonNuevo;
	private JButton botonEditar;
	private JButton botonLineas;
	private JTable tablaClientes;
	private JScrollPane jScrollPane1;
	private JLabel jLabel8;
	private JTextField cajaEmail;
	private JTextField cajaDireccion;
	private JTextField cajaNombre;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JButton botonTodos;
	private JTextField cajaDniBuscar;
	private JLabel jLabel1;
	private List<Cliente> listaActualizadaClientes;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VRestClientes inst = new VRestClientes();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public VRestClientes() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Gesti�n de Clientes");
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setBounds(12, 12, 360, 56);
				jPanel1.setFont(new java.awt.Font("Dialog", 0, 8));
				jPanel1.setBorder(BorderFactory
						.createTitledBorder(null, "B�squeda",
								TitledBorder.LEADING,
								TitledBorder.DEFAULT_POSITION,
								new java.awt.Font("Segoe UI", 1, 10),
								new java.awt.Color(0, 0, 0)));
				jPanel1.setLayout(null);
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("DNI:");
					jLabel1.setBounds(11, 22, 23, 16);
				}
				{
					cajaDniBuscar = new JTextField();
					jPanel1.add(cajaDniBuscar);
					cajaDniBuscar.setBounds(46, 19, 141, 23);
				}
				{
					botonBuscar = new JButton();
					jPanel1.add(botonBuscar);
					botonBuscar.setText("Buscar");
					botonBuscar.setBounds(193, 19, 82, 23);
					botonBuscar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonBuscar.actionPerformed, event="
											+ evt);
							// TODO add your code for
							// botonBuscar.actionPerformed
							botonBuscar();
						}
					});
				}
				{
					botonTodos = new JButton();
					jPanel1.add(botonTodos);
					botonTodos.setText("Todos");
					botonTodos.setBounds(280, 19, 70, 23);
					botonTodos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonTodos.actionPerformed, event="
											+ evt);
							// TODO add your code for botonTodos.actionPerformed
							botonTodos();
						}
					});
				}
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2);
				jPanel2.setFont(new java.awt.Font("Dialog", 0, 8));
				jPanel2.setBounds(13, 78, 360, 145);
				jPanel2.setLayout(null);
				jPanel2.setBorder(BorderFactory
						.createTitledBorder(null, "Clientes",
								TitledBorder.LEADING,
								TitledBorder.DEFAULT_POSITION,
								new java.awt.Font("Segoe UI", 1, 10),
								new java.awt.Color(0, 0, 0)));
				{
					jScrollPane1 = new JScrollPane();
					jPanel2.add(jScrollPane1);
					jScrollPane1.setBounds(12, 24, 336, 84);
					{
						TableModel jTable1Model = new DefaultTableModel(
								new String[] { "DNI", "Nombre", "Direcci�n",
										"Email" }, 2);
						tablaClientes = new JTable();
						jScrollPane1.setViewportView(tablaClientes);
						tablaClientes.setModel(jTable1Model);
					}
				}
				{
					botonLineas = new JButton();
					jPanel2.add(botonLineas);
					botonLineas.setText("Ver L�neas...");
					botonLineas.setBounds(250, 113, 98, 23);
					botonLineas.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonLineas.actionPerformed, event="
											+ evt);
							// TODO add your code for
							// botonLineas.actionPerformed
							botonVerLineas();
						}
					});
				}
				{
					botonEditar = new JButton();
					jPanel2.add(botonEditar);
					botonEditar.setText("Editar");
					botonEditar.setBounds(175, 113, 70, 23);
					botonEditar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonEditar.actionPerformed, event="
											+ evt);
							// TODO add your code for
							// botonEditar.actionPerformed
							botonEditar();
						}
					});
				}
			}
			{
				jPanel3 = new JPanel();
				getContentPane().add(jPanel3);
				jPanel3.setFont(new java.awt.Font("Dialog", 0, 8));
				jPanel3.setBounds(13, 235, 359, 143);
				jPanel3.setLayout(null);
				jPanel3.setBorder(BorderFactory
						.createTitledBorder(null, "Edici�n",
								TitledBorder.LEADING,
								TitledBorder.DEFAULT_POSITION,
								new java.awt.Font("Segoe UI", 1, 10),
								new java.awt.Color(0, 0, 0)));
				{
					jLabel3 = new JLabel();
					jPanel3.add(jLabel3);
					jLabel3.setText("DNI:");
					jLabel3.setBounds(10, 24, 23, 16);
				}
				{
					cajaDni = new JTextField();
					jPanel3.add(cajaDni);
					cajaDni.setBounds(74, 21, 95, 23);
				}
				{
					cajaNombre = new JTextField();
					jPanel3.add(cajaNombre);
					cajaNombre.setBounds(74, 50, 274, 23);
				}
				{
					jLabel5 = new JLabel();
					jPanel3.add(jLabel5);
					jLabel5.setText("Nombre:");
					jLabel5.setBounds(10, 53, 57, 16);
				}
				{
					jLabel4 = new JLabel();
					jPanel3.add(jLabel4);
					jLabel4.setText("Direcci�n:");
					jLabel4.setBounds(10, 81, 57, 16);
				}
				{
					cajaDireccion = new JTextField();
					jPanel3.add(cajaDireccion);
					cajaDireccion.setBounds(74, 78, 274, 23);
				}
				{
					cajaEmail = new JTextField();
					jPanel3.add(cajaEmail);
					cajaEmail.setBounds(74, 107, 274, 23);
				}
				{
					jLabel8 = new JLabel();
					jPanel3.add(jLabel8);
					jLabel8.setText("Email:");
					jLabel8.setBounds(10, 110, 37, 16);
				}
				{
					botonNuevo = new JButton();
					jPanel3.add(botonNuevo);
					botonNuevo.setText("Nuevo");
					botonNuevo.setBounds(181, 21, 73, 23);
					botonNuevo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonNuevo.actionPerformed, event="
											+ evt);
							// TODO add your code for botonNuevo.actionPerformed
							botonNuevo();
						}
					});
				}
				{
					botonGuardar = new JButton();
					jPanel3.add(botonGuardar);
					botonGuardar.setText("Guardar");
					botonGuardar.setBounds(259, 21, 89, 23);
					botonGuardar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonGuardar.actionPerformed, event="
											+ evt);
							// TODO add your code for
							// botonGuardar.actionPerformed
							botonGuardar();
						}
					});
				}
			}
			{
				botonSalir = new JButton();
				getContentPane().add(botonSalir);
				botonSalir.setText("Salir");
				botonSalir.setBounds(297, 384, 75, 23);
				botonSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("botonSalir.actionPerformed, event="
								+ evt);
						// TODO add your code for botonSalir.actionPerformed
						botonSalir();
					}
				});
			}
			pack();
			this.setSize(400, 452);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	private void botonBuscar() {
		// Get XML for application
		try{
			String campoDni = cajaDniBuscar.getText();
			Cliente [] arrayClientes = Singleton.getInstance().path("rest").path("clientes").path(campoDni).accept(MediaType.APPLICATION_XML).get(Cliente[].class);
			System.out.println("todos.GET('application/xml').results (con un ARRAY): ");
			DefaultTableModel dtm = (DefaultTableModel) tablaClientes.getModel();
			listaActualizadaClientes = new ArrayList<Cliente>();
			int numFilas = dtm.getRowCount();
			for(int k=0;k<numFilas;k++)
				dtm.removeRow(0);
			
			for(int i=0;i<arrayClientes.length;i++) 
			{
				System.out.println(arrayClientes[i].getDni() + "\t" + arrayClientes[i].getNombre());	
				String[]cliente = {arrayClientes[i].getDni(),arrayClientes[i].getNombre(),arrayClientes[i].getDireccion(),arrayClientes[i].getEmail()};
				dtm.addRow(cliente);
				listaActualizadaClientes.add(arrayClientes[i]);
			}
		}catch(UniformInterfaceException e){ // if code != 20x exception is thrown
			ClientResponse r = e.getResponse();
			System.out.println("todos.GET('application/xml').status: " + r.getStatus());
			System.out.println("todos.GET('application/xml').entity: " + r.getEntity(String.class));
			JOptionPane.showMessageDialog(VRestClientes.this, r.getEntity(String.class), "Error " + r.getStatus(), JOptionPane.ERROR_MESSAGE);
		}		
	}

	private void botonTodos() {
		// Get XML for application
		try{
			Cliente [] arrayClientes = Singleton.getInstance().path("rest").path("clientes").accept(MediaType.APPLICATION_XML).get(Cliente[].class);
			System.out.println("todos.GET('application/xml').results (con un ARRAY): ");
			DefaultTableModel dtm = (DefaultTableModel) tablaClientes.getModel();
			listaActualizadaClientes = new ArrayList<Cliente>();
			
			int numFilas = dtm.getRowCount();
			for(int k=0;k<numFilas;k++)
				dtm.removeRow(0);
			
			for(int i=0;i<arrayClientes.length;i++) 
			{
				System.out.println(arrayClientes[i].getDni() + "\t" + arrayClientes[i].getNombre());	
				String[]cliente = {arrayClientes[i].getDni(),arrayClientes[i].getNombre(),arrayClientes[i].getDireccion(),arrayClientes[i].getEmail()};
				dtm.addRow(cliente);
				listaActualizadaClientes.add(arrayClientes[i]);
			}
			
		}catch(UniformInterfaceException e){ // if code != 20x exception is thrown
			ClientResponse r = e.getResponse();
			System.out.println("todos.GET('application/xml').status: " + r.getStatus());
			System.out.println("todos.GET('application/xml').entity: " + r.getEntity(String.class));
			JOptionPane.showMessageDialog(VRestClientes.this, r.getEntity(String.class), "Error " + r.getStatus(), JOptionPane.ERROR_MESSAGE);
		}		
	}

	private void botonEditar() {
		int selectedRow = tablaClientes.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(this,
					"SELECCIONE UN CLIENTE",
					"ATENCION", JOptionPane.WARNING_MESSAGE);
			return;
		}

		Cliente c = listaActualizadaClientes.get(tablaClientes.getSelectedRow());
		
		cajaDireccion.setText(c.getDireccion());
		cajaEmail.setText(c.getEmail());
		cajaNombre.setText(c.getNombre());
		cajaDni.setText(c.getDni());
	}

	private void botonVerLineas() {
		Cliente clienteSeleccionado = listaActualizadaClientes.get(tablaClientes.getSelectedRow());
		VRestLineas ventana = new VRestLineas(clienteSeleccionado);
		System.out.println("Cliente mandado a Ibai: "+clienteSeleccionado.toString());
		ventana.setVisible(true);
		this.setVisible(false);
	}

	private void botonNuevo() {
		// POST
		Cliente c = new Cliente();
		c.setDireccion(cajaDireccion.getText());
		c.setDni(cajaDni.getText());
		c.setEmail(cajaEmail.getText());
		c.setNombre(cajaNombre.getText());
		// TYPE is the type of content consumes by the service/method
		// ACCEPT is the type of content returned by the service/method
		// PUT is the type of operation invoked. The first param is the content returned and the second one the values received.
		ClientResponse cr1 = Singleton.getInstance().path("rest").path("clientes").type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_JSON).post(ClientResponse.class, c);
		if (cr1.getStatus() == 201){ // Return code should be 201 == created resource
			System.out.println("todos.POST('application/xml').status: " + cr1.getStatus());
			System.out.println("todos.POST('application/xml').location: " + cr1.getLocation());
			listaActualizadaClientes.add(c);
			DefaultTableModel dtm = (DefaultTableModel)tablaClientes.getModel();
			String[]cliente = {c.getDni(),c.getNombre(),c.getDireccion(),c.getEmail()};
			JOptionPane.showMessageDialog(VRestClientes.this, "CLIENTE INSERTADO CORRECTAMENTE", "ATENCION", JOptionPane.ERROR_MESSAGE);
			dtm.addRow(cliente);
			botonTodos();
		}else{ // Or code 409 == resource already exists 
			System.out.println("todos.POST('application/xml').status: " + cr1.getStatus());
			System.out.println("todos.POST('application/xml').entity: " + cr1.getEntity(String.class));
			JOptionPane.showMessageDialog(VRestClientes.this, "CLIENTE EXISTENTE, NO SE HA PODIDO INSERTAR", "ATENCION", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void botonGuardar() {

		Cliente c = new Cliente();
		c.setDireccion(cajaDireccion.getText());
		c.setDni(cajaDni.getText());
		c.setEmail(cajaEmail.getText());
		c.setNombre(cajaNombre.getText());
		
		try {
			Singleton.getInstance().path("rest").path("clientes").path(c.getDni())
					.type(MediaType.APPLICATION_XML)
					.accept(MediaType.APPLICATION_JSON).put(c);
			Cliente c2 = listaActualizadaClientes.get(tablaClientes.getSelectedRow());
			c2.setDireccion(c.getDireccion());
			c2.setEmail(c.getEmail());
			c2.setNombre(c.getNombre());
			JOptionPane.showMessageDialog(VRestClientes.this, "CLIENTE MODIFICADO CORRECTAMENTE", "ATENCION", JOptionPane.ERROR_MESSAGE);
			botonTodos();
		} catch (UniformInterfaceException e) {
			ClientResponse r = e.getResponse();
			JOptionPane.showMessageDialog(VRestClientes.this, r.getEntity(String.class), "Error " + r.getStatus(), JOptionPane.ERROR_MESSAGE);
		}
	
	}

	private void botonSalir() {
		System.exit(0);
	}
}
