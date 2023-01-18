package View;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.Controlador;


public class CargarCliente extends JFrame{
    
    private JPanel contentPane;

    private JTextField numCliente;
    private JTextField nombreC;
    private ButtonGroup grupoRadios1;
	private JRadioButton radioA,radioC;


    public CargarCliente() {
        this.setTitle("Carga Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
/*------------------------------------------------------------------------------------------ */
        JLabel numClienteLab = new JLabel("Numero cliente:");
        numClienteLab.setBounds(60, 20, 100, 20);
        contentPane.add(numClienteLab);

        numCliente = new JTextField();
        numCliente.setBounds(200, 20, 80, 20);
        contentPane.add(numCliente);
        numCliente.setColumns(10);
/*------------------------------------------------------------------------------------------ */

        JLabel nombreClienteLab = new JLabel("Nombre cliente:");
        nombreClienteLab.setBounds(60, 50, 100, 20);
        contentPane.add(nombreClienteLab);

        nombreC = new JTextField();
        nombreC.setBounds(200, 50, 80, 20);
        contentPane.add(nombreC);
        nombreC.setColumns(10);
/*------------------------------------------------------------------------------------------ */

        JLabel tipoFacturaLab = new JLabel("Tipo factura");
        tipoFacturaLab.setBounds(60, 80, 100, 20);
        contentPane.add(tipoFacturaLab);

        grupoRadios1 = new ButtonGroup();

        radioA = new JRadioButton();
        radioA.setText("Factura A");
        radioA.setBounds(200, 80, 80, 20);

        radioC = new JRadioButton();
        radioC.setText("Factura C");
        radioC.setBounds(280, 80, 80, 20);

        grupoRadios1.add(radioA);
		grupoRadios1.add(radioC);
        contentPane.add(radioA);
        contentPane.add(radioC);
/*------------------------------------------------------------------------------------------ */
//Armar los otros botones que tienen el tipo de IIBB
/*------------------------------------------------------------------------------------------ */
        JButton btnNewButton = new JButton("Crear cliente");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent arg0) {
                try {
                    if (!numCliente.getText().equalsIgnoreCase("")){
                        int numC = Integer.parseInt(numCliente.getText());

                        boolean respuesta = Controlador.getInstance().registrarVendedor(numC, getName());
                    }
                    else{
                        
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,  "No ingrese caracteres en los campos que no corresponden","Error DATOS",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton.setBounds(250, 150, 100, 20);
        

    }
}
git config --global user.email "you@example.com"
  git config --global user.name "Your Name"