package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.Controlador;
import Model.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerificarCliente extends JFrame{
    
    private JPanel contentPane;
    private JTextField numCliente;


    public VerificarCliente() {
        this.setTitle("Verificar cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        JLabel numClienteLab = new JLabel("Numero cliente");
		numClienteLab.setBounds(59, 21, 79, 14);
		contentPane.add(numClienteLab);

        numCliente = new JTextField();
        numCliente.setBounds(211, 21, 124, 23);
		contentPane.add(numCliente);
		numCliente.setColumns(10);


        JButton btnNewButton_1 = new JButton("VERIFICAR");
		btnNewButton_1.setBounds(109, 193, 89, 23);
		contentPane.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!numCliente.getText().equalsIgnoreCase("")) {
                        int numC = Integer.parseInt(numCliente.getText());
                        boolean respuesta = Controlador.getInstance().verificarCliente(numC);
                        if (respuesta) {
                            JOptionPane.showMessageDialog(null, "El cliente ya esta ingresado","Verificar cliente",JOptionPane.INFORMATION_MESSAGE);
                            numCliente.setText("");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "El cliente no esta ingresado","Verificar cliente",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
						JOptionPane.showMessageDialog(null, "Ingrese un cliente no vacio ","Verificar cliente",JOptionPane.INFORMATION_MESSAGE);
					}
                }
                catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,  "No ingrese caracteres en los campos que no corresponden","Error DATOS",JOptionPane.ERROR_MESSAGE);
				}
                

            }
        });
    
        JButton btnNewButton2 = new JButton("AGREGAR");
        btnNewButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CargarCliente ventana = new CargarCliente();
                ventana.setVisible(true);
            }
        });
        btnNewButton2.setBounds(60, 84, 201, 23);
        contentPane.add(btnNewButton2);
    }
}
