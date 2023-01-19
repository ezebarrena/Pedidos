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
    private ButtonGroup grupoRadiosF;
	private JRadioButton radioA,radioC;
    private ButtonGroup grupoRadiosIIBB;
    private JRadioButton radioEx, radioG, radioEsp;


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

        grupoRadiosF = new ButtonGroup();

        radioA = new JRadioButton();
        radioA.setText("Factura A");
        radioA.setBounds(200, 80, 80, 20);

        radioC = new JRadioButton();
        radioC.setText("Factura C");
        radioC.setBounds(280, 80, 80, 20);

        grupoRadiosF.add(radioA);
		grupoRadiosF.add(radioC);
        contentPane.add(radioA);
        contentPane.add(radioC);
/*------------------------------------------------------------------------------------------ */
//Armar los otros botones que tienen el tipo de IIBB

        JLabel tipoIIBBLab = new JLabel("Categoria IIBB");
        tipoIIBBLab.setBounds(60, 110, 100, 20);
        contentPane.add(tipoIIBBLab);

        grupoRadiosIIBB = new ButtonGroup();

        radioEx = new JRadioButton();
        radioEx.setText("Excento");
        radioEx.setBounds(200, 110, 80, 20);

        radioG = new JRadioButton();
        radioG.setText("General");
        radioG.setBounds(280, 110, 80, 20);

        radioEsp = new JRadioButton();
        radioEsp.setText("Especial");
        radioEsp.setBounds(360, 110, 80, 20);

        grupoRadiosIIBB.add(radioEsp);
        grupoRadiosIIBB.add(radioEx);
        grupoRadiosIIBB.add(radioG);
        contentPane.add(radioEsp);
        contentPane.add(radioEx);
        contentPane.add(radioG);

/*------------------------------------------------------------------------------------------ */
        JButton btnNewButton = new JButton("Crear cliente");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent arg0) {
                try {
                    if (!numCliente.getText().equalsIgnoreCase("")){
                        int numC = Integer.parseInt(numCliente.getText());
                        String tipoF;
                        String tipoIIBB;

                        if (radioA.isSelected()){
                            tipoF = "A";
                        }
                        else{
                            tipoF = "C";
                        }

                        if (radioEx.isSelected()){
                            tipoIIBB = "Excento";
                        }
                        else if (radioG.isSelected()){
                            tipoIIBB = "General";
                        }
                        else{
                            tipoIIBB ="Especial";
                        }

                        boolean respuesta = Controlador.getInstance().altaCliente(numC, nombreC.getText(), tipoF, tipoIIBB);
                        System.out.println(numC);
                        System.out.println(nombreC.getText());
                        System.out.println(tipoF);
                        System.out.println(tipoIIBB);
                        if (respuesta) { 
                            JOptionPane.showMessageDialog(null, "El vendedor se ha creado exitosamente","Vendedor Creado",JOptionPane.INFORMATION_MESSAGE);
							numCliente.setText("");
							nombreC.setText("");
                            grupoRadiosF.clearSelection();
                            grupoRadiosIIBB.clearSelection();
                        }
                        else {
                            JOptionPane.showMessageDialog(null,  "El vendedor no se pudo crear","Vendedor Duplicado",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese un vendedor no vacio ","Vendedor incompleto",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,  "No ingrese caracteres en los campos que no corresponden","Error DATOS",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton.setBounds(100, 150, 150, 20);
        contentPane.add(btnNewButton);
        

    }
}
