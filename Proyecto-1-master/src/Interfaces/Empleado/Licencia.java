package Interfaces.Empleado;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;

public class Licencia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextPane txtpnFechaDeExpedicin;
	private JTextPane txtpnPaisDeExpedicin;
	private JTextPane txtpnDocumentoDeIdentidad;
	private JTextPane txtpnElementosAdicionales;
	private JTextPane txtpnNumero_5;
	private JTextPane txtpnNumero;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Licencia frame = new Licencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Licencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 355);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(125, 11, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 42, 96, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 91, 96, 34);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(125, 136, 96, 44);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(125, 191, 96, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(125, 235, 96, 34);
		contentPane.add(textField_5);
		
		txtpnFechaDeExpedicin = new JTextPane();
		txtpnFechaDeExpedicin.setToolTipText("");
		txtpnFechaDeExpedicin.setText("Fecha de expedición:");
		txtpnFechaDeExpedicin.setForeground(Color.WHITE);
		txtpnFechaDeExpedicin.setBackground(Color.BLUE);
		txtpnFechaDeExpedicin.setBounds(48, 42, 58, 34);
		contentPane.add(txtpnFechaDeExpedicin);
		
		txtpnPaisDeExpedicin = new JTextPane();
		txtpnPaisDeExpedicin.setText("Pais de expedición:");
		txtpnPaisDeExpedicin.setForeground(Color.WHITE);
		txtpnPaisDeExpedicin.setBackground(Color.BLUE);
		txtpnPaisDeExpedicin.setBounds(48, 92, 58, 33);
		contentPane.add(txtpnPaisDeExpedicin);
		
		txtpnDocumentoDeIdentidad = new JTextPane();
		txtpnDocumentoDeIdentidad.setText("documento de identidad:");
		txtpnDocumentoDeIdentidad.setForeground(Color.WHITE);
		txtpnDocumentoDeIdentidad.setBackground(Color.BLUE);
		txtpnDocumentoDeIdentidad.setBounds(48, 133, 58, 48);
		contentPane.add(txtpnDocumentoDeIdentidad);
		
		txtpnElementosAdicionales = new JTextPane();
		txtpnElementosAdicionales.setText("Elementos Adicionales:");
		txtpnElementosAdicionales.setForeground(Color.WHITE);
		txtpnElementosAdicionales.setBackground(Color.BLUE);
		txtpnElementosAdicionales.setBounds(48, 190, 58, 34);
		contentPane.add(txtpnElementosAdicionales);
		
		txtpnNumero_5 = new JTextPane();
		txtpnNumero_5.setText("Foto de licencia:");
		txtpnNumero_5.setForeground(Color.WHITE);
		txtpnNumero_5.setBackground(Color.BLUE);
		txtpnNumero_5.setBounds(48, 235, 58, 34);
		contentPane.add(txtpnNumero_5);
		
		txtpnNumero = new JTextPane();
		txtpnNumero.setText("Numero:");
		txtpnNumero.setForeground(Color.WHITE);
		txtpnNumero.setBackground(Color.BLUE);
		txtpnNumero.setBounds(48, 11, 58, 20);
		contentPane.add(txtpnNumero);
		
		btnNewButton = new JButton("cerrar Sesión");
		btnNewButton.setBounds(90, 284, 114, 23);
		contentPane.add(btnNewButton);
	}

}
