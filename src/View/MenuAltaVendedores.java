package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controller.Controlador;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAltaVendedores extends JFrame{


    private JPanel contentPane;
    private JTextField numVendedor;
	private JTextField nombre;
	
	private Controlador sistema;

    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAltaVendedores frame = new MenuAltaVendedores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    public MenuAltaVendedores() {
        this.setTitle("Crear Vendedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        this.setVisible(true);


        numVendedor = new JTextField();
        numVendedor.setBounds(246, 11, 86, 20);
		contentPane.add(numVendedor);
		numVendedor.setColumns(10);

        JLabel lblNewLabel = new JLabel("Numero de vendedor:");
		lblNewLabel.setBounds(32, 11, 96, 20);
		contentPane.add(lblNewLabel);

        nombre = new JTextField();
        nombre.setBounds(246, 40, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(32, 40, 96, 20);
		contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Crear Vendedor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                try
				{
					if (!numVendedor.getText().equalsIgnoreCase(""))
					{
						int numV= Integer.parseInt(numVendedor.getText());


						boolean respuesta = Controlador.getInstance().registrarVendedor(numV, nombre.getText());
						if (respuesta)
						{
							JOptionPane.showMessageDialog(null, "El vendedor se ha creado exitosamente","Vendedor Creado",JOptionPane.INFORMATION_MESSAGE);
							numVendedor.setText("");
							nombre.setText("");
							
						}
						else
						{
							JOptionPane.showMessageDialog(null,  "El vendedor no se pudo crear","Vendedor Duplicado",JOptionPane.ERROR_MESSAGE);
						}
							
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Ingrese un vendedor no vacio ","Vendedor incompleto",JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
				catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(null,  "No ingrese caracteres en los campos que no corresponden","Error DATOS",JOptionPane.ERROR_MESSAGE);
				}
			}
	
		});
		btnNewButton.setBounds(109, 200, 123, 30);
		contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(294, 204, 89, 23);
		contentPane.add(btnNewButton_1);
    }
}
