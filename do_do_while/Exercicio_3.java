package do_do_while;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;


//Feito por: Felipe Rafael Rothbarth
//Data: 14/08/2023

/*
	A prefeitura de "Araquachussets" planeja conduzir uma pesquisa entre seus cidadãos,
	a fim de coletar informações sobre seus nomes, idades, salários e número de filhos.
	Para alcançar esse objetivo, sugiro a criação de um formulário online, que possa ser
	preenchido pelos moradores da cidade.
	
	Uma vez que a pesquisa tenha sido concluída, podemos utilizar os dados coletados
	para gerar algumas informações estatísticas relevantes, tais como:
	● A média de salário da população, que pode ser calculada dividindo-se a soma
	de todos os salários pelo número total de respondentes.
	
	● A média do número de filhos, que pode ser calculada dividindo-se a soma de
	todos os filhos pelo número total de respondentes.
	
	● O maior salário entre os habitantes, que pode ser identificado através da
	comparação dos salários individuais.
	
	● Uma lista com os nomes das pessoas cujo salário é inferior a R$ 1000,00. Essa
	lista pode ser gerada filtrando-se os respondentes cujo salário é menor que
	esse valor e extraindo seus nomes.
	
	● A média de idade da população, que pode ser calculada da mesma forma que
	a média de salário e a média de número de filhos.
	
	Com essas informações em mãos, a prefeitura de "Araquachussets" poderá ter uma
	melhor compreensão da situação econômica e demográfica de sua cidade, o que pode
	ajudá-la a planejar políticas públicas mais eficazes.

 */

public class Exercicio_3 {

	public static void main(String[] args) {
		
		int cont = 0;
		boolean finaliza = false;
		int media_salario = 0;
		int media_filhos = 0;
		double maior_salario = 0;
		String lista_nomes = "";
		int media_idade = 0;
		
		
		DecimalFormat df = new DecimalFormat("0.00");

		
		do {
			
			cont++;
			
			String nomes = JOptionPane.showInputDialog("Informe seu nome:  ");
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade : "));
			
			if(idade >= 0) {
				media_idade += idade;
			}
			
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario : "));
			
			while(salario < 1) {
				 salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario novamente pois informou seu salario negativo : "));
				
			}media_salario += salario;
			
			if(salario < 1000) {
				lista_nomes += (" , ") + nomes;
			}
				

			int numero_filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de filhos que você tem: "));
			
			if(numero_filhos >= 0) {
				media_filhos += numero_filhos;
			}else {
				JOptionPane.showMessageDialog(null, "Você não pode ter filhos negativados " , null,JOptionPane.INFORMATION_MESSAGE);

			}

			String finalizar = JOptionPane
					.showInputDialog("Digite finalizar para finalizar ou continuar para continuar o programa:  ");

			if (finalizar.equalsIgnoreCase("finalizar")) {
				finaliza = true;
			} else {
				finaliza = false;
			}
			
			if(maior_salario < salario) {
				maior_salario = salario;
			}

			
		}while(finaliza == false);
		
			double media_salario_total = media_salario / cont;
			
			double media_numero_filhos = media_filhos / cont;
			
			double media_numero_idade = media_idade / cont;
			
			
			
			JOptionPane.showMessageDialog(null, "Média salarial da população : " + df.format(media_salario_total) + 
					"\n Média do numero dos filhos : " + media_numero_filhos + 
					"\n Maior salario entre os habitantes : " + df.format(maior_salario) + 
					"\n Lista com nomes que tem o salario menor de 1000 reais : " + lista_nomes +
					"\n Média da idade da população : " + media_numero_idade);
	}

}
