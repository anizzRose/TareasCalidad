package Formularios;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class RegistrarCliente {

	private JFrame frmRegistroClientes;
	private JTextField txt_correo;
	private JTextField txt_apellido;
	private JTextField txt_nombre;
	private JTextField txt_idcliente;
	private JTextField txt_edad;
	private JTextField txt_usuario;
	private JPasswordField pass_contrasena;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarCliente window = new RegistrarCliente();
					window.frmRegistroClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroClientes = new JFrame();
		frmRegistroClientes.setTitle("Registro Clientes");
		frmRegistroClientes.getContentPane().setBackground(SystemColor.activeCaption);
		frmRegistroClientes.getContentPane().setLayout(null);
		
		txt_correo = new JTextField();
		txt_correo.setColumns(10);
		txt_correo.setBounds(84, 191, 158, 20);
		frmRegistroClientes.getContentPane().add(txt_correo);
		
		JLabel label = new JLabel("Correo");
		label.setBounds(10, 191, 56, 24);
		frmRegistroClientes.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Apellidos");
		label_1.setBounds(10, 149, 56, 24);
		frmRegistroClientes.getContentPane().add(label_1);
		
		txt_apellido = new JTextField();
		txt_apellido.setColumns(10);
		txt_apellido.setBounds(84, 151, 158, 20);
		frmRegistroClientes.getContentPane().add(txt_apellido);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setBounds(10, 107, 56, 24);
		frmRegistroClientes.getContentPane().add(label_2);
		
		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(84, 109, 158, 20);
		frmRegistroClientes.getContentPane().add(txt_nombre);
		
		txt_idcliente = new JTextField();
		txt_idcliente.setColumns(10);
		txt_idcliente.setBounds(84, 67, 86, 20);
		frmRegistroClientes.getContentPane().add(txt_idcliente);
		
		JLabel label_3 = new JLabel("ID_Usuario");
		label_3.setBounds(10, 65, 56, 24);
		frmRegistroClientes.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Registro de Clientes");
		label_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_4.setBounds(199, 11, 192, 43);
		frmRegistroClientes.getContentPane().add(label_4);
		
		txt_edad = new JTextField();
		txt_edad.setColumns(10);
		txt_edad.setBounds(337, 67, 86, 20);
		frmRegistroClientes.getContentPane().add(txt_edad);
		
		JLabel label_5 = new JLabel("Edad");
		label_5.setBounds(269, 65, 56, 24);
		frmRegistroClientes.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Usuario");
		label_6.setBounds(269, 100, 56, 24);
		frmRegistroClientes.getContentPane().add(label_6);
		
		txt_usuario = new JTextField();
		txt_usuario.setColumns(10);
		txt_usuario.setBounds(335, 102, 88, 20);
		frmRegistroClientes.getContentPane().add(txt_usuario);
		
		JLabel label_7 = new JLabel("Contrase\u00F1a");
		label_7.setBounds(269, 135, 56, 24);
		frmRegistroClientes.getContentPane().add(label_7);
		
		pass_contrasena = new JPasswordField();
		pass_contrasena.setBounds(335, 137, 88, 20);
		frmRegistroClientes.getContentPane().add(pass_contrasena);
		
		JButton btn_salir = new JButton("Salir");
		btn_salir.setBounds(279, 180, 104, 43);
		frmRegistroClientes.getContentPane().add(btn_salir);
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.setBounds(459, 98, 104, 43);
		frmRegistroClientes.getContentPane().add(btn_cancelar);
		
		JButton btn_registro = new JButton("Registrarse");
		btn_registro.setBounds(459, 44, 104, 43);
		frmRegistroClientes.getContentPane().add(btn_registro);
		
		JButton btn_MostarTabla = new JButton("Mostar Tabla");
		btn_MostarTabla.setBounds(459, 149, 104, 43);
		frmRegistroClientes.getContentPane().add(btn_MostarTabla);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 3));
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 237, 471, 124);
		frmRegistroClientes.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		scrollPane.setViewportView(table);
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmRegistroClientes.setBounds(100, 100, 630, 442);
		frmRegistroClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
