package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame{
    
    private static final long serialVersionUID = 4260055797852194459L;

    private JPanel contentPane;


    public VentanaPrincipal() {
        this.setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        this.setVisible(true);
		this.setSize(700,500);

        JButton btnNewButton = new JButton("Vendedores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuAltaVendedores ventana = new MenuAltaVendedores();
				ventana.setVisible(true);
                ventana.setSize(700,500);
			}
		});
		btnNewButton.setBounds(25, 57, 118, 23);
		contentPane.add(btnNewButton);

        JButton btnNewButton2 = new JButton("Clientes");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuClientes ventana = new MenuClientes();
				ventana.setVisible(true);
                ventana.setSize(700,500);
			}
		});
		btnNewButton2.setBounds(25, 80, 118, 23);
		contentPane.add(btnNewButton2);

        JButton btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_4.setBounds(302, 191, 89, 23);
		contentPane.add(btnNewButton_4);
    }

}
