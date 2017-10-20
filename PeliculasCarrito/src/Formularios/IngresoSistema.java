package Formularios;

import java.awt.Component;
import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoSistema {

	private JFrame frame;
	private JTextField txt_usua;
	private JPasswordField pass_pass;
	private JButton btn_menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoSistema window = new IngresoSistema();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IngresoSistema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngresarSesionPara = new JLabel("Ingresar Sesion para los clientes de compras de pel\u00EDculas");
		lblIngresarSesionPara.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblIngresarSesionPara.setBounds(23, 11, 523, 41);
		frame.getContentPane().add(lblIngresarSesionPara);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblUsuario.setBounds(31, 95, 81, 26);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblContrasea.setBounds(31, 132, 102, 26);
		frame.getContentPane().add(lblContrasea);
		
		txt_usua = new JTextField();
		txt_usua.setBounds(168, 101, 81, 20);
		frame.getContentPane().add(txt_usua);
		txt_usua.setColumns(10);
		
		pass_pass = new JPasswordField();
		pass_pass.setBounds(168, 132, 81, 20);
		frame.getContentPane().add(pass_pass);
		
		JButton btn_sesion = new JButton("Ingresar");
		btn_sesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CatalogoPelis1 pel1= new CatalogoPelis1();
			     
				
			}
		});
		btn_sesion.setBounds(291, 91, 102, 41);
		frame.getContentPane().add(btn_sesion);
		
		JButton btn_Cancelar = new JButton("Cancelar");
		btn_Cancelar.setBounds(291, 149, 102, 41);
		frame.getContentPane().add(btn_Cancelar);
		
		JButton btn_menu = new JButton("Menu");
		btn_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Menus men = new Menus();
				men.setVisible(true);
			
				
			}
		});
		btn_menu.setBounds(422, 95, 94, 49);
		frame.getContentPane().add(btn_menu);
		frame.setBounds(100, 100, 607, 253);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
