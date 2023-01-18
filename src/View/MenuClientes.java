package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;


public class MenuClientes extends JFrame{
    
    private JPanel contentPane;
    
    public MenuClientes() {
        this.setTitle("Menu Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


        JButton btnNewButton = new JButton("Verificar cliente");
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerificarCliente ventana = new VerificarCliente();
				ventana.setVisible(true);
			}
		});
		btnNewButton.setBounds(60, 64, 201, 23);
		contentPane.add(btnNewButton);

        JButton btnNewButton2 = new JButton("Cargar cliente");
        btnNewButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CargarCliente ventana = new CargarCliente();
                ventana.setVisible(true);
            }
        });
        btnNewButton2.setBounds(60, 84, 201, 23);
        contentPane.add(btnNewButton2);

        JButton btnNewButton_4 = new JButton("Volver");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});;
		btnNewButton_4.setBounds(302, 191, 89, 23);
		contentPane.add(btnNewButton_4);

    }

}
