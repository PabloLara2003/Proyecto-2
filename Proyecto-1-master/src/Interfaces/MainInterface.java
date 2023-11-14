package Interfaces;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractSequentialList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainInterface extends JFrame implements ActionListener {
	private Color color = new Color(66,57,91);
	JButton BtnCliente = new JButton("Cliente");
	JButton BtnAdmin = new JButton("Admin");
	JButton BtnEmpleado = new JButton("Empleado");
	AdminInterface admin;
	
	public MainInterface(){
		setSize(500, 650);
		setTitle("Alquiler");
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    admin = new AdminInterface();
	    JPanel panel = new JPanel();
	    panel.setBackground(color);
	    panel.setLayout(new GridLayout(9, 3));
	    for (int i = 0; i < 9; i++) {
		    panel.add(new JLabel(""));
		    JLabel lbl = new JLabel("Elija su tipo de usuario");
		    lbl.setHorizontalAlignment(JLabel.CENTER);
		    lbl.setForeground(Color.WHITE);
		    BtnCliente.addActionListener(this);
		    BtnAdmin.addActionListener(this);
		    BtnEmpleado.addActionListener(this);
		    if (i == 1)
		    	panel.add(lbl);
		    else if (i == 3)
		    	panel.add(BtnCliente);
		    else if (i == 5)
		    	panel.add(BtnAdmin);
		    else if (i == 7)
			    panel.add(BtnEmpleado);
		    else
			    panel.add(new JLabel(""));
			panel.add(new JLabel(""));						
	    }
	    add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnCliente) {
			
		}else if (e.getSource() == BtnAdmin) {
			setVisible(false);
			admin.setVisible(true);
		}else if (e.getSource() == BtnEmpleado) {
			
		}
	}
	
	public static void main(String[] args) {
		MainInterface interfaz = new MainInterface();
		interfaz.setVisible(true);
		interfaz.setLocationRelativeTo(null);
	}
}