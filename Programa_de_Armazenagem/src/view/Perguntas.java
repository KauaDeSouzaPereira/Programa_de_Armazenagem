package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import Calcular.Custeamento;
import Calcular.Plantacao;
import Calcular.Material;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Perguntas {

	public JFrame Perguntas;
	private JTextField txtProduziu;
	private JTextField txtSacas;
	private JTextField txtvlMedio;
	private JTextField txtAgua;
	private JTextField txtFrete;
	private JTextField txtImposto;
	private JTextField txtdpArmazenamento;
	private JTextField txttxDocumento;
	private JTextField txtEnergia;

	Custeamento frete = new Custeamento();
	 Custeamento imposto = new Custeamento();
	 Custeamento dpArmazenamento = new Custeamento();
	 Custeamento txDocumento = new Custeamento();
	 Plantacao semente = new Plantacao();
	 Plantacao saca = new Plantacao();
	 Plantacao valorMedio = new Plantacao();
	 Material agua = new Material();
	 Material energia = new Material();
	 
	 static Custeamento calc;
	 static Plantacao calc1;
	 static Material calc2;
	 /*
	 private void capturaValores() {
		 
	       calc1.setColhido(Float.parseFloat(txtSacas.getText()));
	       calc1.setPrecoMedio(Float.parseFloat(txtvlMedio.getText()));
	       calc2.setAgua(Float.parseFloat(txtAgua.getText()));
	       calc2.setEnergia(Float.parseFloat(txtEnergia.getText()));
	       calc.setFrete(Float.parseFloat(txtFrete.getText()));
	       calc.setImposto(Float.parseFloat(txtImposto.getText()));
	       calc.setDpArmazenamento(Float.parseFloat(txtdpArmazenamento.getText()));
	       calc.setTxDocumento(Float.parseFloat(txttxDocumento.getText()));
	    }
	 */
	 
	 
	
	 
	public static final int EXIT_ON_CLOSE = 3;
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
					Perguntas window = new Perguntas();
					window.Perguntas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Perguntas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Perguntas = new JFrame();
		Perguntas.setBounds(100, 100, 905, 758);
		Perguntas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Perguntas.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 889, 719);
		Perguntas.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblProduziu = new JLabel("Qual tipo de semente você produziu?");
		lblProduziu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblProduziu.setBounds(70, 134, 232, 14);
		panel.add(lblProduziu);
		
		JLabel lblSacas = new JLabel("Quantas Sacas desta plantação você colheu?");
		lblSacas.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSacas.setBounds(70, 175, 279, 14);
		panel.add(lblSacas);
		
		JLabel lblvlMedio = new JLabel("Qual valor médio de vendas das sacas? (Valor médio de acordo com a venda)");
		lblvlMedio.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblvlMedio.setBounds(70, 211, 480, 14);
		panel.add(lblvlMedio);
		
		JLabel lblAgua = new JLabel("Quanto você gastou de Água nesse mês (Em R$)?");
		lblAgua.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAgua.setBounds(70, 246, 304, 14);
		panel.add(lblAgua);
		
		JLabel lblEnergia = new JLabel("Quanto você gastou de Energia nesse mês (Em R$)?");
		lblEnergia.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEnergia.setBounds(70, 285, 317, 14);
		panel.add(lblEnergia);
		
		JLabel lblFrete = new JLabel("Digite valor do Frete:");
		lblFrete.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFrete.setBounds(70, 320, 140, 14);
		panel.add(lblFrete);
		
		JLabel lblImposto = new JLabel("Digite o valor do Imposto:");
		lblImposto.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblImposto.setBounds(70, 353, 174, 14);
		panel.add(lblImposto);
		
		JLabel lbldpArmazenamento = new JLabel("Digite o valor das Despesas Armazenamento:");
		lbldpArmazenamento.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbldpArmazenamento.setBounds(70, 388, 279, 14);
		panel.add(lbldpArmazenamento);
		
		JLabel lbltxDocumento = new JLabel("Digite o valor da Taxa Documento:");
		lbltxDocumento.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbltxDocumento.setBounds(70, 424, 219, 14);
		panel.add(lbltxDocumento);
		
		
		
		txtProduziu = new JTextField();
		txtProduziu.setBounds(554, 121, 195, 27);
		panel.add(txtProduziu);
		txtProduziu.setColumns(10);
		
		
		
		
		txtSacas = new JTextField();
		txtSacas.setBounds(554, 162, 195, 27);
		panel.add(txtSacas);
		txtSacas.setColumns(10);
		
		
		
		txtvlMedio = new JTextField();
		txtvlMedio.setBounds(554, 198, 195, 27);
		panel.add(txtvlMedio);
		txtvlMedio.setColumns(10);
		
		
		txtAgua = new JTextField();
		txtAgua.setBounds(554, 233, 195, 27);
		panel.add(txtAgua);
		txtAgua.setColumns(10);
		
		
		txtFrete = new JTextField();
		txtFrete.setBounds(554, 307, 195, 27);
		panel.add(txtFrete);
		txtFrete.setColumns(10);
		
		
		txtImposto = new JTextField();
		txtImposto.setBounds(554, 340, 195, 27);
		panel.add(txtImposto);
		txtImposto.setColumns(10);
		
		
		txtdpArmazenamento = new JTextField();
		txtdpArmazenamento.setBounds(554, 375, 195, 27);
		panel.add(txtdpArmazenamento);
		txtdpArmazenamento.setColumns(10);
		
		
		txttxDocumento = new JTextField();
		txttxDocumento.setBounds(554, 411, 195, 27);
		panel.add(txttxDocumento);
		txttxDocumento.setColumns(10);
		
		
		
		
		txtEnergia = new JTextField();
		txtEnergia.setBounds(554, 272, 195, 27);
		panel.add(txtEnergia);
		txtEnergia.setColumns(10);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double colheu, valorMedio, Agua, Energia, Frete, Imposto, dpArmazenamento, txDocumento;
				colheu = Double.parseDouble(txtSacas.getText());
				valorMedio = Double.parseDouble(txtvlMedio.getText());
				Agua = Double.parseDouble(txtAgua.getText());
				Energia = Double.parseDouble(txtEnergia.getText());
				Frete = Double.parseDouble(txtFrete.getText());
				Imposto = Double.parseDouble(txtImposto.getText());
				dpArmazenamento = Double.parseDouble(txtdpArmazenamento.getText());
				txDocumento = Double.parseDouble(txttxDocumento.getText());
				
				
				 double resultadoFinal = colheu * valorMedio - Agua - Energia - Frete - Imposto - dpArmazenamento - txDocumento ; 
				 
				 
				 
				 //JOptionPane.showMessageDialog(null, "Semente que você produziu: " + txtProduziu.getText() + "\n" + "\n" + "Quantas sacas você colheu: " +  txtSacas.getText() + "\n" + "\n" + "Valor médio das sacas: " + txtvlMedio.getText()
				 //+ "\n" + "\n" +"Conta de água: " + txtAgua.getText() + "\n" + "\n" +"Conta de energia: " + txtEnergia.getText() + "\n" + "\n" + "Frete: " + txtFrete.getText() 
				 //+ "\n" + "\n" + "Impostos: " + txtImposto.getText() + "\n" + "\n" + "Despesas Armazenamento: " + txtdpArmazenamento.getText() + "\n" + "\n" + "Taxa do Documento: " + txttxDocumento.getText());
				
				 JOptionPane.showMessageDialog(null, "Valor arrecadado foi de: "+ + resultadoFinal + "\n" + "Lembre-se quanto menos o desperdício maior é a ecônomia :)");
			}
		});
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCalcular.setBounds(315, 540, 183, 32);
		panel.add(btnCalcular);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(343, 587, 132, 25);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 889, 719);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Perguntas.class.getResource("/image6565.png")));
		lblNewLabel.setBounds(0, 0, 889, 719);
		panel_1.add(lblNewLabel);
		
		
	}

	public JTextField getTxtProduziu() {
		return txtProduziu;
	}

	public void setTxtProduziu(JTextField txtProduziu) {
		this.txtProduziu = txtProduziu;
	}

	public JTextField getTxtSacas() {
		return txtSacas;
	}

	public void setTxtSacas(JTextField txtSacas) {
		this.txtSacas = txtSacas;
	}

	public JTextField getTxtvlMedio() {
		return txtvlMedio;
	}

	public void setTxtvlMedio(JTextField txtvlMedio) {
		this.txtvlMedio = txtvlMedio;
	}

	public JTextField getTxtAgua() {
		return txtAgua;
	}

	public void setTxtAgua(JTextField txtAgua) {
		this.txtAgua = txtAgua;
	}

	public JTextField getTxtFrete() {
		return txtFrete;
	}

	public void setTxtFrete(JTextField txtFrete) {
		this.txtFrete = txtFrete;
	}

	public JTextField getTxtImposto() {
		return txtImposto;
	}

	public void setTxtImposto(JTextField txtImposto) {
		this.txtImposto = txtImposto;
	}

	public JTextField getTxtdpArmazenamento() {
		return txtdpArmazenamento;
	}

	public void setTxtdpArmazenamento(JTextField txtdpArmazenamento) {
		this.txtdpArmazenamento = txtdpArmazenamento;
	}

	public JTextField getTxttxDocumento() {
		return txttxDocumento;
	}

	public void setTxttxDocumento(JTextField txttxDocumento) {
		this.txttxDocumento = txttxDocumento;
	}

	public JTextField getTxtEnergia() {
		return txtEnergia;
	}

	public void setTxtEnergia(JTextField txtEnergia) {
		this.txtEnergia = txtEnergia;
	}
}
