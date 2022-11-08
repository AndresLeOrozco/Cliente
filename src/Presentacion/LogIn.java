package Presentacion;

import java.net.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame{
    private JPanel MainPanel;
    private JTextField UserName;
    private JTextField Contrasenia;
    private JButton registerButton;
    private JButton logInButton;
    private JPanel logInPanel;
    private JPanel Register;
    private JPanel encabezado;
    private JPanel registerData;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton registerButton1;
    private JPanel logInQuestion;
    private JButton logInButton1;
    private JPanel question;

    public LogIn(){
        add(MainPanel);
        setLocationRelativeTo(null);
        setSize(500,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               MainPanel.removeAll();
               MainPanel.add(Register);
               MainPanel.repaint();
               MainPanel.revalidate();
            }
        });
        logInButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPanel.removeAll();
                MainPanel.add(logInPanel);
                MainPanel.repaint();
                MainPanel.revalidate();
            }
        });
    }

    public static void main(String[] args) {
        InetAddress ia;
        String ip;
        try {
            ia = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        ip = ia.toString();
        System.out.println(ia);
    }

}
