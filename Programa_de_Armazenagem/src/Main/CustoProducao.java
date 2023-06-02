package Main;
import java.util.Scanner;
import Calcular.Custeamento;
import Calcular.Plantacao;
import Calcular.Material;

public class CustoProducao {

	public static void main(String[] args) {
		 Custeamento frete = new Custeamento();
		 Custeamento imposto = new Custeamento();
		 Custeamento dpArmazenamento = new Custeamento();
		 Custeamento txDocumento = new Custeamento();
		 Plantacao semente = new Plantacao();
		 Plantacao saca = new Plantacao();
		 Plantacao valorMedio = new Plantacao();
		 Material agua = new Material();
		 Material energia = new Material();
		
		 
		 
		 
		 
		 
		 
		 
		 Scanner sc= new Scanner(System.in);
		 
		
		 
			 
		 
		
		 
					 System.out.println("Qual tipo de semente você produziu?");
					 semente.setTipoAlimento(sc.next());
					 System.out.println( "Você escolheu essa semente: " + semente.getTipoAlimento());
					 
					 
					 
					 System.out.println("Quantas Sacas você colheu?");
					 saca.setColhido(sc.nextDouble());
					 System.out.println( "Sua quantidades de sacas que você colheu foi: " + saca.getColhido());
					 					 
					 
					 
					 System.out.println("Qual valor médio das sacas?");
					 valorMedio.setPrecoMedio(sc.nextDouble());
					 System.out.println( "Valor médio de sacas você colocou é: " + valorMedio.getPrecoMedio());
					 
					 
					 System.out.println("Quanto você quastou de Água nesse mês (Em R$)?");
					 agua.setAgua(sc.nextDouble());
					 System.out.println( "Você gastou nesse mês de conta de Água" + " R$ " + agua.getAgua());
					 
					 
					 
					 System.out.println("Quanto você quastou de Energia nesse mês (Em R$)?");
					 energia.setEnergia(sc.nextDouble());
					 System.out.println( "Você gastou nesse mês de conta de Energia " + " R$ " + energia.getEnergia());
					
					 System.out.println("Digite seu Frete:");
					 frete.setFrete(sc.nextDouble());
					 System.out.println( "Seu valor do Frete é:" + " R$ " + frete.getFrete());
				 
				 
					 System.out.println("Digite do valor do Imposto:");
					 imposto.setImposto(sc.nextDouble());
					 System.out.println( "Seu valor do Imposto:" + " R$ " + imposto.getImposto());
				 
				 
					 System.out.println("Digite do valor do Despesas Armazenamento:");
					 dpArmazenamento.setDpArmazenamento(sc.nextDouble());
					 System.out.println( "Seu valor de Despesas Armazenamento:" + " R$ " + dpArmazenamento.getDpArmazenamento());
				
				 
					 System.out.println("Digite do valor do Taxa Documento:");
					 txDocumento.setTxDocumento(sc.nextDouble());
					 System.out.println( "Seu valor de Taxa Documento:" + " R$ " + txDocumento.getTxDocumento());
				 
					 
				 
				 sc.close();
			 
			 	
				 System.out.println("Os valores foram" + "\n" + "Sacas colhidas: " + saca.getColhido() + "\n" + "Valor Médio Sacas: " + " R$ " + valorMedio.getPrecoMedio()
			     +"\n"+ "Frete: " + " R$ " + frete.getFrete() + "\n" + "Imposto: " + " R$ " + imposto.getImposto() 
			     +"\n"+ "Despesas Armazenamentos: " + " R$ " + dpArmazenamento.getDpArmazenamento()
				 +"\n"+ "Taxa Documento: " + " R$ " + txDocumento.getTxDocumento()
				 +"\n"+ "Água: " + " R$ " + agua.getAgua() + "\n" + "Energia: " + " R$ " + energia.getEnergia());
				 
				 double resultadoFinal = saca.getColhido() * valorMedio.getPrecoMedio() - frete.getFrete() - imposto.getImposto() - dpArmazenamento.getDpArmazenamento() - agua.getAgua() - energia.getEnergia() - txDocumento.getTxDocumento() ; 
				 System.out.println("Valor total arrecadado foi de: " + resultadoFinal);
				 
				 
				 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	
		 
		 
		 
		 
		 
		 

		 
		 
		 
		 
		
}		 


	

