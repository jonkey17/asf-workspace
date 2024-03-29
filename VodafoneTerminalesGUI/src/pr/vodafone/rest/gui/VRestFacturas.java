package pr.vodafone.rest.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import pr.vodafone.rest.data.Factura;
import pr.vodafone.rest.data.Linea;
import pr.vodafone.rest.pattern.Singleton;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;

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
public class VRestFacturas extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel labelDatos;
	private JLabel labelVoz;
	private JLabel labelAntiguedad;
	private JTextField cajaId;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel labelTelefono;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel2;
	private JButton botonCerrar;
	private JButton botonGuardar;
	private JButton botonNueva;
	private JButton botonEditar;
	private JButton botonBorrar;
	private JTable tablaFacturas;
	private JLabel labelActiva;
	private JLabel labelPromocion;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JScrollPane jScrollPane1;
	private JLabel jLabel8;
	private JTextField cajaImporte;
	private JTextField cajaPeriodo;
	private JTextField cajaFecha;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JLabel jLabel1;
	
	private Linea linea;
	
	private javax.swing.JFrame before;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Linea linea= new Linea("666222000", "mucha", true, "koko", "popo", "lolo", "21232121-X");
				VRestFacturas inst = new VRestFacturas(null, linea);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public VRestFacturas(javax.swing.JFrame before, Linea linea) {
		super();
		this.linea=linea;
		this.before = before;
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Gesti�n de Facturas");
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setBounds(12, 12, 360, 116);
				jPanel1.setFont(new java.awt.Font("Dialog", 1, 10));
				jPanel1.setLayout(null);
				jPanel1.setBorder(BorderFactory
						.createTitledBorder(null, "Datos L�nea",
								TitledBorder.LEADING,
								TitledBorder.DEFAULT_POSITION,
								new java.awt.Font("Segoe UI", 1, 10),
								new java.awt.Color(0, 0, 0)));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("Tel�fono:");
					jLabel1.setBounds(11, 22, 70, 16);
				}
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setText("Antiguedad:");
					jLabel2.setBounds(11, 44, 70, 16);
				}
				{
					jLabel6 = new JLabel();
					jPanel1.add(jLabel6);
					jLabel6.setText("Tarifa voz:");
					jLabel6.setBounds(11, 66, 70, 16);
				}
				{
					jLabel7 = new JLabel();
					jPanel1.add(jLabel7);
					jLabel7.setText("Tarifa datos:");
					jLabel7.setBounds(11, 89, 79, 16);
				}
				{
					labelTelefono = new JLabel();
					jPanel1.add(labelTelefono);
					labelTelefono.setText(linea.getTelefono());
					labelTelefono.setBounds(92, 22, 102, 16);
					labelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12));
				}
				{
					labelAntiguedad = new JLabel();
					jPanel1.add(labelAntiguedad);
					labelAntiguedad.setText(linea.getAntiguedad());
					labelAntiguedad.setBounds(92, 44, 102, 16);
					labelAntiguedad
							.setFont(new java.awt.Font("Segoe UI", 1, 12));
				}
				{
					labelVoz = new JLabel();
					jPanel1.add(labelVoz);
					labelVoz.setText(linea.getTarifaVoz());
					labelVoz.setBounds(92, 66, 102, 16);
					labelVoz.setFont(new java.awt.Font("Segoe UI", 1, 12));
				}
				{
					labelDatos = new JLabel();
					jPanel1.add(labelDatos);
					labelDatos.setText(linea.getTarifaDatos());
					labelDatos.setBounds(92, 89, 102, 16);
					labelDatos.setFont(new java.awt.Font("Segoe UI", 1, 12));
				}
				{
					jLabel10 = new JLabel();
					jPanel1.add(jLabel10);
					jLabel10.setText("Promoci�n:");
					jLabel10.setBounds(195, 22, 65, 16);
				}
				{
					jLabel11 = new JLabel();
					jPanel1.add(jLabel11);
					jLabel11.setText("Activa:");
					jLabel11.setBounds(195, 44, 65, 16);
				}
				{
					labelPromocion = new JLabel();
					jPanel1.add(labelPromocion);
					labelPromocion.setText(linea.getPromocion());
					labelPromocion.setBounds(263, 22, 87, 16);
					labelPromocion
							.setFont(new java.awt.Font("Segoe UI", 1, 12));
				}
				{
					labelActiva = new JLabel();
					jPanel1.add(labelActiva);
					labelActiva.setText(linea.isActiva()?"Si":"No");
					labelActiva.setBounds(263, 44, 87, 16);
					labelActiva.setFont(new java.awt.Font("Segoe UI", 1, 12));
				}
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2);
				jPanel2.setFont(new java.awt.Font("Dialog", 0, 8));
				jPanel2.setBounds(13, 140, 360, 145);
				jPanel2.setLayout(null);
				jPanel2.setBorder(BorderFactory
						.createTitledBorder(null, "Facturas Disponibles",
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
								new String[] { "Id", "Fecha", "Periodo",
										"Importe" }, 2);
						tablaFacturas = new JTable();
						jScrollPane1.setViewportView(tablaFacturas);
						tablaFacturas.setModel(jTable1Model);
					}
				}
				{
					botonBorrar = new JButton();
					jPanel2.add(botonBorrar);
					botonBorrar.setText("Borrar");
					botonBorrar.setBounds(266, 113, 82, 23);
					botonBorrar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("botonBorrar.actionPerformed, event="
											+ evt);
							if(comprobarSelecion()){
								botonBorrar();
							}	
							peticionGet(linea.getTelefono());
						}
					});
				}
				{
					botonEditar = new JButton();
					jPanel2.add(botonEditar);
					botonEditar.setText("Editar");
					botonEditar.setBounds(185, 113, 76, 23);
					botonEditar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonEditar.actionPerformed, event="
											+ evt);
							if(comprobarSelecion()){
								botonEditar();
							}										
						}
					});
				}
			}
			{
				jPanel3 = new JPanel();
				getContentPane().add(jPanel3);
				jPanel3.setFont(new java.awt.Font("Dialog", 0, 8));
				jPanel3.setBounds(13, 297, 359, 145);
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
					jLabel3.setText("Id:");
					jLabel3.setBounds(10, 24, 64, 16);
				}
				{
					cajaId = new JTextField();
					jPanel3.add(cajaId);
					cajaId.setBounds(86, 21, 83, 23);
				}
				{
					cajaFecha = new JTextField();
					jPanel3.add(cajaFecha);
					cajaFecha.setBounds(86, 50, 262, 23);
				}
				{
					jLabel5 = new JLabel();
					jPanel3.add(jLabel5);
					jLabel5.setText("Fecha:");
					jLabel5.setBounds(10, 53, 71, 16);
				}
				{
					jLabel4 = new JLabel();
					jPanel3.add(jLabel4);
					jLabel4.setText("Periodo:");
					jLabel4.setBounds(10, 81, 57, 16);
				}
				{
					cajaPeriodo = new JTextField();
					jPanel3.add(cajaPeriodo);
					cajaPeriodo.setBounds(86, 78, 262, 23);
				}
				{
					cajaImporte = new JTextField();
					jPanel3.add(cajaImporte);
					cajaImporte.setBounds(86, 107, 262, 23);
				}
				{
					jLabel8 = new JLabel();
					jPanel3.add(jLabel8);
					jLabel8.setText("Importe:");
					jLabel8.setBounds(10, 110, 71, 16);
				}
				{
					botonNueva = new JButton();
					jPanel3.add(botonNueva);
					botonNueva.setText("Nueva");
					botonNueva.setBounds(181, 21, 78, 23);
					botonNueva.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonNueva.actionPerformed, event="
											+ evt);
							botonNueva();
							peticionGet(linea.getTelefono());
						}
					});
				}
				{
					botonGuardar = new JButton();
					jPanel3.add(botonGuardar);
					botonGuardar.setText("Guardar");
					botonGuardar.setBounds(264, 21, 84, 23);
					botonGuardar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out
									.println("botonGuardar.actionPerformed, event="
											+ evt);
							botonGuardar();
							peticionGet(linea.getTelefono());
						}
					});
				}
			}
			{
				botonCerrar = new JButton();
				getContentPane().add(botonCerrar);
				botonCerrar.setText("Atras");
				botonCerrar.setBounds(294, 450, 79, 23);
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
			this.setSize(400, 521);
			
			peticionGet(linea.getTelefono());
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void peticionGet(String numLinea){
		try{
		Factura facturas[]=Singleton.getInstance().path("rest").path("lineas").path(numLinea).path("facturas").accept(MediaType.APPLICATION_XML).get(Factura[].class);
		
		DefaultTableModel tableModel = (DefaultTableModel) tablaFacturas.getModel();
		tableModel.getDataVector().removeAllElements();
		for (int i = 0; i < facturas.length; i++) {
			tableModel.insertRow(i, new Object[]{facturas[i].getIdFactura(), facturas[i].getFecha(), facturas[i].getPeriodo(), facturas[i].getImporte()});
		}
		}catch(UniformInterfaceException e){ // if code != 20x exception is thrown
			ClientResponse r = e.getResponse();
			JOptionPane.showMessageDialog(VRestFacturas.this, r.getEntity(String.class), "Error "+ r.getStatus(), JOptionPane.ERROR_MESSAGE);
		}
	}

	private void botonEditar() {
		int row=tablaFacturas.getSelectedRow();
		DefaultTableModel tableModel = (DefaultTableModel) tablaFacturas.getModel();
		String id= tableModel.getValueAt(row, 0)+"";
		String importe=tableModel.getValueAt(row, 3)+"";
		cajaId.setText(id);
		cajaFecha.setText( (String) tableModel.getValueAt(row, 1));
		cajaPeriodo.setText( (String) tableModel.getValueAt(row, 2));
		cajaImporte.setText( importe);
		
	}

	private void botonBorrar() {
		try{
		DefaultTableModel tableModel = (DefaultTableModel) tablaFacturas.getModel();
		String idFactura=tableModel.getValueAt(tablaFacturas.getSelectedRow(), 0)+"";
		Singleton.getInstance().path("rest").path("facturas").path(idFactura).delete();
		JOptionPane.showMessageDialog(VRestFacturas.this, "Factura eliminada correctamente", "Eliminada", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Factura "+ idFactura+ " eliminada");
		}catch(UniformInterfaceException e){
			ClientResponse r = e.getResponse();
			JOptionPane.showMessageDialog(VRestFacturas.this, r.getEntity(String.class), "Error "+ r.getStatus(), JOptionPane.ERROR_MESSAGE);
		}
	}

	private void botonNueva() {
		//Factura factura= new Factura(Integer.parseInt(cajaId.getText()), cajaFecha.getText(), cajaPeriodo.getText(), Float.parseFloat(cajaImporte.getText()),linea.getTelefono());
		Factura factura= new Factura(cajaFecha.getText(), cajaPeriodo.getText(), Float.parseFloat(cajaImporte.getText()),linea.getTelefono());		
		try{
			Singleton.getInstance().path("rest").path("lineas").path(factura.getTelefono()).path("facturas").type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_JSON).post(factura);
			System.out.println("Factura creada correctamente");
			vaciarCampos();
			JOptionPane.showMessageDialog(VRestFacturas.this, "Nueva factura creada correctamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
		}catch(UniformInterfaceException e){
			ClientResponse r = e.getResponse();
			JOptionPane.showMessageDialog(VRestFacturas.this, r.getEntity(String.class), "Error "+ r.getStatus(), JOptionPane.ERROR_MESSAGE);
		}
	}

	private void botonGuardar() {
		String idFactura=cajaId.getText();
		Factura factura= new Factura(Integer.parseInt(idFactura), cajaFecha.getText(), cajaPeriodo.getText(), Float.parseFloat(cajaImporte.getText()),linea.getTelefono());
		try{
			Singleton.getInstance().path("rest").path("facturas").path(idFactura).type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_JSON).put(factura);
			JOptionPane.showMessageDialog(VRestFacturas.this, "La factura de se ha editado correctamente", "Editado", JOptionPane.OK_OPTION);
			vaciarCampos();
			System.out.println("Factura editada correctamente");
		}catch(UniformInterfaceException e){
			ClientResponse r = e.getResponse();
			JOptionPane.showMessageDialog(VRestFacturas.this, r.getEntity(String.class), "Error "+ r.getStatus(), JOptionPane.ERROR_MESSAGE);
			//System.out.println("facturas.PUT('application/xml').status: " + r.getStatus());
			//System.out.println("facturas.PUT('application/xml').entity: " + r.getEntity(String.class));
		}
	}

	private void botonCerrar() {
		if (this.before != null) {
			this.setVisible(false);
			before.setVisible(true);
		} else {
			System.exit(0);
		}
	}
	
	private boolean comprobarSelecion(){
		if(tablaFacturas.getSelectedRow()<0){
			JOptionPane.showMessageDialog(VRestFacturas.this, "No has seleccionado ninguna factura", "Atenci�n", JOptionPane.WARNING_MESSAGE);
			return false;
		}else{
			return true;
		}
	}
	
	private void vaciarCampos(){
	 cajaId.setText("");
	 cajaFecha.setText("");
	 cajaImporte.setText("");
	 cajaPeriodo.setText("");
	}
	
}
