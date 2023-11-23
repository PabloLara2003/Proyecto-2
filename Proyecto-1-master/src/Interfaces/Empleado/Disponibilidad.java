package Interfaces.Empleado;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Disponibilidad extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Disponibilidad frame = new Disponibilidad();
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
    public Disponibilidad() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 286, 355);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton disponibilidad_C = new JButton("disponibilidad carro ");
        disponibilidad_C.setBounds(63, 53, 151, 23);
        contentPane.add(disponibilidad_C);

        JButton añadir_C = new JButton("Añadir Conductor ");
        añadir_C.setBounds(63, 113, 151, 23);
        contentPane.add(añadir_C);

        JButton cerrar_S = new JButton("cerrar Sesión");
        cerrar_S.setBounds(80, 262, 114, 23);
        contentPane.add(cerrar_S);

        // Add ActionListener to the "Cerrar_S" button
        cerrar_S.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the application
                System.exit(0);
            }
        });
    }
}

