package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;

public class Cadastro {

	JFrame frame;
	private JTextField txtForn;
	private JTextField txtCNPJ;
	private JTextField txtContato;
	private JTextField txtAgricola;
	private JLabel lblContato;
	private JLabel lblAgricola;
	private JLabel lblConcordo;
	private JPanel panel;
	private JLabel lblNewLabel_3;
	private JCheckBox checkbox;

	public static final int EXIT_ON_CLOSE = 3;
	private JButton btnNewButton;
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	            System.err.println(ex);
	        } 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastre-se aqui");
		btnCadastrar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(checkbox.isSelected()) {
					Perguntas per = new Perguntas();
					per.Perguntas.setVisible(true);
					frame.dispose();
					JOptionPane.showMessageDialog(null, " Fornecedor: " + txtForn.getText() + "\n" + " CNPJ: "+txtCNPJ.getText() + "\n" + " Contato: " 
							+ txtContato.getText() + "\n" + " Invertimento do mercado agricola: " + txtAgricola.getText() );
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, concorde com os nossos termos para prosseguir.");
				}
				
			}
			
			
		});
		
		
		
		
		btnCadastrar.setBounds(290, 452, 195, 23);
		frame.getContentPane().add(btnCadastrar);
		
		
		
		txtForn = new JTextField();
		txtForn.setBounds(435, 167, 202, 27);
		frame.getContentPane().add(txtForn);
		txtForn.setColumns(10);
		
		txtCNPJ = new JTextField();
		txtCNPJ.setToolTipText("");
		txtCNPJ.setBounds(435, 205, 202, 26);
		frame.getContentPane().add(txtCNPJ);
		txtCNPJ.setColumns(10);
		
		JLabel lblFornecedor = new JLabel("Nome do Fornecedor ou da Empresa: ");
		lblFornecedor.setForeground(Color.BLACK);
		lblFornecedor.setBackground(Color.WHITE);
		lblFornecedor.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFornecedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblFornecedor.setBounds(161, 180, 235, 14);
		frame.getContentPane().add(lblFornecedor);
		
		JLabel lblCNPJ = new JLabel("CNPJ OU CPF:");
		lblCNPJ.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCNPJ.setHorizontalAlignment(SwingConstants.CENTER);
		lblCNPJ.setBounds(161, 217, 101, 14);
		frame.getContentPane().add(lblCNPJ);
		
		txtContato = new JTextField();
		txtContato.setBounds(435, 242, 202, 27);
		frame.getContentPane().add(txtContato);
		txtContato.setColumns(10);
		
		txtAgricola = new JTextField();
		txtAgricola.setBounds(435, 273, 202, 27);
		frame.getContentPane().add(txtAgricola);
		txtAgricola.setColumns(10);
		
		lblContato = new JLabel("Contato:");
		lblContato.setBackground(Color.WHITE);
		lblContato.setHorizontalAlignment(SwingConstants.CENTER);
		lblContato.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblContato.setBounds(161, 257, 52, 14);
		frame.getContentPane().add(lblContato);
		
		lblAgricola = new JLabel("Invertimento no mercado agricola:");
		lblAgricola.setBackground(Color.WHITE);
		lblAgricola.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAgricola.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgricola.setBounds(159, 286, 212, 14);
		frame.getContentPane().add(lblAgricola);
		
		lblConcordo = new JLabel("Concordo com os termos de serviço e a política de privacidade");
		lblConcordo.setForeground(new Color(0, 0, 0));
		lblConcordo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblConcordo.setHorizontalAlignment(SwingConstants.CENTER);
		lblConcordo.setBounds(159, 399, 389, 14);
		frame.getContentPane().add(lblConcordo);
		
		panel = new JPanel();
		panel.setBounds(1, 0, 704, 531);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(EXIT_ON_CLOSE);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(343, 497, 89, 23);
		panel.add(btnNewButton);
		
		checkbox = new JCheckBox("");
		checkbox.setBackground(new Color(253, 251, 217));
		checkbox.setBounds(555, 394, 21, 23);
		panel.add(checkbox);
		
		
		
		
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Cadastro.class.getResource("/image.png")));
		lblNewLabel_3.setBounds(0, 0, 704, 531);
		panel.add(lblNewLabel_3);
		
		
		
		
		
	}
	
	

	
	
	
}
