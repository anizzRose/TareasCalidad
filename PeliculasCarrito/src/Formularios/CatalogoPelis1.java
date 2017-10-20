package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

public class CatalogoPelis1 {

	private JFrame frmCarritoDeCompras;
	private JTextField txt_idpeli;
	private JTextField txt_titulo;
	private JTextField txt_director;
	private JTextField txt_protagonista;
	private JTextField textField_6;
	private JTextField txt_Cantidad;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CatalogoPelis1 window = new CatalogoPelis1();
					window.frmCarritoDeCompras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CatalogoPelis1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarritoDeCompras = new JFrame();
		frmCarritoDeCompras.setTitle("Carrito de Compras");
		frmCarritoDeCompras.getContentPane().setBackground(SystemColor.activeCaption);
		frmCarritoDeCompras.getContentPane().setLayout(null);
		
		JLabel lblBienvenidoAlCarrito = new JLabel("Bienvenido al Carrito de compras");
		lblBienvenidoAlCarrito.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblBienvenidoAlCarrito.setBounds(172, 22, 294, 49);
		frmCarritoDeCompras.getContentPane().add(lblBienvenidoAlCarrito);
		
		JLabel lblIdpelicula = new JLabel("ID_Pelicula");
		lblIdpelicula.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblIdpelicula.setBounds(54, 92, 93, 28);
		frmCarritoDeCompras.getContentPane().add(lblIdpelicula);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		lblTtulo.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTtulo.setBounds(54, 131, 77, 28);
		frmCarritoDeCompras.getContentPane().add(lblTtulo);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblDirector.setBounds(54, 170, 77, 28);
		frmCarritoDeCompras.getContentPane().add(lblDirector);
		
		JLabel lblProtagonista = new JLabel("Protagonista");
		lblProtagonista.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblProtagonista.setBounds(54, 209, 93, 28);
		frmCarritoDeCompras.getContentPane().add(lblProtagonista);
		
		JComboBox combo_combina = new JComboBox();
		combo_combina.setModel(new DefaultComboBoxModel(new String[] {"Acci\u00F3n", "Aventuras", "Ciencia Ficci\u00F3n", "Documental", "Drama", "Comedia", "Animada", "Anime", "Hist\u00F3rica"}));
		combo_combina.setBounds(204, 250, 177, 28);
		frmCarritoDeCompras.getContentPane().add(combo_combina);
		
		JLabel lblClasificacin = new JLabel("Clasificaci\u00F3n");
		lblClasificacin.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblClasificacin.setBounds(54, 248, 93, 28);
		frmCarritoDeCompras.getContentPane().add(lblClasificacin);
		
		txt_idpeli = new JTextField();
		txt_idpeli.setBounds(204, 94, 177, 28);
		frmCarritoDeCompras.getContentPane().add(txt_idpeli);
		txt_idpeli.setColumns(10);
		
		txt_titulo = new JTextField();
		txt_titulo.setColumns(10);
		txt_titulo.setBounds(204, 131, 177, 28);
		frmCarritoDeCompras.getContentPane().add(txt_titulo);
		
		txt_director = new JTextField();
		txt_director.setColumns(10);
		txt_director.setBounds(204, 170, 177, 28);
		frmCarritoDeCompras.getContentPane().add(txt_director);
		
		txt_protagonista = new JTextField();
		txt_protagonista.setColumns(10);
		txt_protagonista.setBounds(204, 209, 177, 28);
		frmCarritoDeCompras.getContentPane().add(txt_protagonista);
		
		JButton btn_ingresar = new JButton("Ingresar");
		btn_ingresar.setBounds(415, 89, 100, 38);
		frmCarritoDeCompras.getContentPane().add(btn_ingresar);
		
		JButton btn_Eliminar = new JButton("Eliminar");
		btn_Eliminar.setBounds(415, 138, 100, 38);
		frmCarritoDeCompras.getContentPane().add(btn_Eliminar);
		
		JButton btn_Modificar = new JButton("Modificar");
		btn_Modificar.setBounds(415, 187, 100, 38);
		frmCarritoDeCompras.getContentPane().add(btn_Modificar);
		
		JButton btn_Guardar = new JButton("Guardar");
		btn_Guardar.setBounds(415, 248, 100, 38);
		frmCarritoDeCompras.getContentPane().add(btn_Guardar);
		
		textField_6 = new JTextField();
		textField_6.setText("$");
		textField_6.setColumns(10);
		textField_6.setBounds(203, 381, 86, 28);
		frmCarritoDeCompras.getContentPane().add(textField_6);
		
		JLabel lblPrecio = new JLabel("Precio de Renta");
		lblPrecio.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblPrecio.setBounds(53, 381, 114, 28);
		frmCarritoDeCompras.getContentPane().add(lblPrecio);
		
		txt_Cantidad = new JTextField();
		txt_Cantidad.setColumns(10);
		txt_Cantidad.setBounds(203, 344, 44, 28);
		frmCarritoDeCompras.getContentPane().add(txt_Cantidad);
		
		JLabel lblPrecioDeVenta = new JLabel("Precio de Venta");
		lblPrecioDeVenta.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblPrecioDeVenta.setBounds(53, 420, 114, 28);
		frmCarritoDeCompras.getContentPane().add(lblPrecioDeVenta);
		
		textField_4 = new JTextField();
		textField_4.setText("$");
		textField_4.setColumns(10);
		textField_4.setBounds(203, 420, 86, 28);
		frmCarritoDeCompras.getContentPane().add(textField_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(559, 33, 239, 245);
		frmCarritoDeCompras.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("Peliculas");
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(33, 61, 516, 237);
		frmCarritoDeCompras.getContentPane().add(panel_1);
		
		textField = new JTextField();
		textField.setText("$");
		textField.setColumns(10);
		textField.setBounds(203, 537, 86, 28);
		frmCarritoDeCompras.getContentPane().add(textField);
		
		JLabel lblTotla = new JLabel("Total");
		lblTotla.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTotla.setBounds(53, 537, 114, 28);
		frmCarritoDeCompras.getContentPane().add(lblTotla);
		
		JLabel lblIva = new JLabel("Iva");
		lblIva.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblIva.setBounds(53, 498, 114, 28);
		frmCarritoDeCompras.getContentPane().add(lblIva);
		
		JLabel lblTotal = new JLabel("Subtotal");
		lblTotal.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTotal.setBounds(53, 459, 93, 28);
		frmCarritoDeCompras.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 500, 44, 28);
		frmCarritoDeCompras.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("$");
		textField_2.setColumns(10);
		textField_2.setBounds(203, 461, 86, 28);
		frmCarritoDeCompras.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("$");
		textField_3.setColumns(10);
		textField_3.setBounds(477, 407, 86, 28);
		frmCarritoDeCompras.getContentPane().add(textField_3);
		
		JLabel lblCambio = new JLabel("Cambio");
		lblCambio.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblCambio.setBounds(327, 407, 114, 28);
		frmCarritoDeCompras.getContentPane().add(lblCambio);
		
		JLabel lblPago = new JLabel("Pago");
		lblPago.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblPago.setBounds(327, 368, 114, 28);
		frmCarritoDeCompras.getContentPane().add(lblPago);
		
		textField_7 = new JTextField();
		textField_7.setText("$");
		textField_7.setColumns(10);
		textField_7.setBounds(477, 368, 86, 28);
		frmCarritoDeCompras.getContentPane().add(textField_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBounds(18, 320, 559, 245);
		frmCarritoDeCompras.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(333, 149, 103, 35);
		panel_2.add(btnNewButton);
		
		JButton btnMen = new JButton("Men\u00FA");
		btnMen.setBounds(616, 461, 103, 35);
		frmCarritoDeCompras.getContentPane().add(btnMen);
		frmCarritoDeCompras.setBounds(100, 100, 844, 644);
		frmCarritoDeCompras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
