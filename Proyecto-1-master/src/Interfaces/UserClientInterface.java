package Interfaces;

import Reservations.Reservation;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UserClientInterface {

    private static Reservation reservationInstance;  // Instancia de Reservation

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
        reservationInstance = new Reservation();  // Inicializa la instancia de Reservation
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Interfaz de Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color backgroundColor = new Color(128, 0, 32);

        JPanel panel = new JPanel();
        panel.setBackground(backgroundColor);
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnReserva = createButton("Realizar Reserva", frame);
        JButton btnCancela = createButton("Cancelar Reserva", frame);
        JButton btnFactura = createButton("Factura", frame);
        JButton btnPerfil = createButton("Perfil", frame);

        panel.add(btnReserva);
        panel.add(btnCancela);
        panel.add(btnFactura);
        panel.add(btnPerfil);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static JButton createButton(String text, JFrame frame) {
        JButton button = new JButton(text);
        Color buttonColor = new Color(255, 255, 255);
        button.setBackground(buttonColor);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.equals("Realizar Reserva")) {
                    openLicenseWindow(frame);
                } else {
                    JOptionPane.showMessageDialog(null, "Has presionado el botón " + text);
                }
            }
        });
        return button;
    }

    private static void openLicenseWindow(JFrame parentFrame) {
        JFrame licenseFrame = new JFrame("Licencia");
        licenseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel licensePanel = new JPanel();
        licensePanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        licensePanel.setLayout(new GridLayout(7, 2, 10, 10));

        String[] labels = {"Número:", "País de expedición:", "Fecha de expedición:", "Foto de licencia (str):",
                "Documento de identidad:", "Elementos adicionales:"};

        for (String label : labels) {
            JLabel lbl = new JLabel(label);
            JTextField textField = new JTextField();
            licensePanel.add(lbl);
            licensePanel.add(textField);
        }

        JButton btnContinuar = new JButton("Continuar");
        btnContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener valores de los campos de texto en la ventana de licencia
                JTextField numeroTextField = (JTextField) licensePanel.getComponent(1);
                JTextField paisTextField = (JTextField) licensePanel.getComponent(3);
                JTextField fechaTextField = (JTextField) licensePanel.getComponent(5);
                JTextField fotoTextField = (JTextField) licensePanel.getComponent(7);

                // Llamar a la función driverLicense utilizando la instancia de Reservation
                List<Object> licenseInfo = reservationInstance.driverLicense(
                        Integer.parseInt(numeroTextField.getText()),
                        paisTextField.getText(),
                        fechaTextField.getText(),
                        fotoTextField.getText()
                );

                // Imprimir la información de la licencia (puedes hacer lo que desees con esta información)
                System.out.println("Número de licencia: " + licenseInfo.get(0));
                System.out.println("País de expedición: " + licenseInfo.get(1));
                System.out.println("Fecha de expedición: " + licenseInfo.get(2));
                System.out.println("Foto de licencia: " + licenseInfo.get(3));

                // Aquí puedes realizar acciones adicionales si es necesario

                // Cerrar la ventana de licencia después de procesar los datos
                licenseFrame.dispose();
            }
        });

        licensePanel.add(btnContinuar);
        licenseFrame.getContentPane().add(licensePanel, BorderLayout.CENTER);
        licenseFrame.setSize(400, 300);
        licenseFrame.setLocationRelativeTo(parentFrame);
        licenseFrame.setVisible(true);
    }
}


