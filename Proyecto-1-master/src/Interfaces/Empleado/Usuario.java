package Interfaces.Empleado;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;

public class Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 248);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(126, 46, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 116, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane txtpnUsuario = new JTextPane();
		txtpnUsuario.setForeground(new Color(255, 255, 255));
		txtpnUsuario.setBackground(new Color(0, 0, 255));
		txtpnUsuario.setText("Usuario");
		txtpnUsuario.setBounds(53, 46, 49, 20);
		contentPane.add(txtpnUsuario);
		
		JTextPane txtpnContrasea = new JTextPane();
		txtpnContrasea.setForeground(new Color(255, 255, 255));
		txtpnContrasea.setBackground(new Color(0, 0, 255));
		txtpnContrasea.setText("Contraseña");
		txtpnContrasea.setBounds(53, 116, 63, 20);
		contentPane.add(txtpnContrasea);
	}
}
