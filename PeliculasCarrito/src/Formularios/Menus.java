package Formularios;


import java.awt.EventQueue;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Menus extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menus frame = new Menus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Menus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 406);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnIngresaCliente = new JButton("Ingresa Datos Cliente");
		btnIngresaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistrarCliente regcli= new RegistrarCliente();
				
				
			}
		});
		btnIngresaCliente.setBounds(63, 113, 164, 53);
		
		JButton btnIngresarCarritoVideo = new JButton("Carrito video");
		btnIngresarCarritoVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnIngresarCarritoVideo.setBounds(73, 208, 154, 53);
		
		 JButton btnIngresarClientePelicula = new JButton("Carritocliente");
		btnIngresarClientePelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngresoSistema ingsis= new IngresoSistema();
				  
				  Menus menu= new Menus();
				  menu.dispose();
			}
		});
		btnIngresarClientePelicula.setBounds(291, 113, 121, 53);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(291, 208, 121, 53);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		   System.exit(0);
			}
		});
		
		JLabel lblBienvenidoAlMen = new JLabel("Videopeliculas UACM");
		lblBienvenidoAlMen.setBounds(152, 36, 189, 39);
		lblBienvenidoAlMen.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		contentPane.setLayout(null);
		contentPane.add(btnIngresaCliente);
		contentPane.add(btnIngresarCarritoVideo);
		contentPane.add(btnIngresarClientePelicula);
		contentPane.add(btnSalir);
		contentPane.add(lblBienvenidoAlMen);
	}
}
