package do_do_while;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;


//Feito por: Felipe Rafael Rothbarth
//Data: 15/08/2023

/*
	Foi conduzida uma pesquisa com "N" indivíduos sobre suas opiniões em relação à
	pré-estreia de um filme. Os dados coletados incluíram sexo, idade e uma nota de 0 a
	10 referente à opinião sobre o filme. As perguntas foram feitas repetidamente até que
	todas as pessoas disponíveis tivessem respondido.
	Com base nos resultados da pesquisa, podemos calcular e apresentar as seguintes
	informações:
	
	● A média de idade das pessoas que responderam ao questionário;
	● Lista de pessoas que deram nota igual a 10;
	● A quantidade de homens cujas opiniões sobre o filme foram inferiores a 5;
	● A quantidade de mulheres cujas opiniões sobre o filme foram inferiores a 5;
	● A quantidade de homens cujas opiniões sobre o filme foram superiores a 7;
	● A quantidade de mulheres cujas opiniões sobre o filme foram superiores a 7;
	● Média das notas informadas.
	
	Essas informações podem ajudar a compreender melhor a recepção do público em
	relação ao filme e a orientar decisões futuras da equipe responsável pela sua
	promoção.
	
	Obs.: não esqueça de validar se a nota está entre 0 e 10.
 */

public class Exercicio_4 {

	public static void main(String[] args) {
		
		boolean finaliza = false;
		int media_idade = 0;
		int cont = 0;
		int cont_nota_10 = 0;
		int cont_masc_nota_menor_5 = 0;
		int cont_masc_nota_maior_7 = 0;
		int cont_fem_nota_menor_5 = 0;
		int cont_fem_nota_maior_7 = 0;
		int media_nota = 0;
		
		DecimalFormat df = new DecimalFormat("0.00");

		
		do {
			
		cont ++;
			
			int sexo = Integer.parseInt(JOptionPane.showInputDialog("Informe seu sexo USE = (1 - para MASCULINO ou 2 - para FEMININO) : "));
			
			while(sexo > 2 || sexo < 0) {
				 sexo = Integer.parseInt(JOptionPane.showInputDialog("Você informou o sexo invalido !!!! por favor Informe seu sexo USE = (1 - para AMASCULINO ou 2 - para FEMININO) : "));
			}
			
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade : "));
			
			if(idade >= 0) {
				media_idade += idade;
			}
			
			int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe sua nota entre 0 até 10 sobre o filme assistido : "));
			
			while(nota < 0 || nota > 10) {
				
				nota = Integer.parseInt(JOptionPane.showInputDialog("Você informou uma nota menor que 0 ou maior que 10 !!!! Por favor Informe sua nota entre 0 até 10 : "));

			}
			
			media_nota += nota;
			
			if(sexo == 1 && nota < 5) {
				cont_masc_nota_menor_5++;
			}else if(sexo == 1 && nota > 7) {
				cont_masc_nota_maior_7++;
			}
			
			if(sexo == 2 && nota < 5) {
				cont_fem_nota_menor_5++;
			}else if(sexo == 2 && nota > 7) {
				cont_fem_nota_maior_7++;
			}
			
			if(nota == 10) {
				cont_nota_10 ++;
			}
			
			String finalizar = JOptionPane
					.showInputDialog("Deseja finalizar? (s/n) ");

			if (finalizar.equalsIgnoreCase("s")) {
				finaliza = true;
			} else {
				finaliza = false;
			}
			
				
		}while(finaliza == false);
		
		int media_idade_real = media_idade / cont;
		double media_notas_informadas = media_nota / cont;
		JOptionPane.showMessageDialog(null, "Média de idade de todas as pessoas que responderam o formulario : " + media_idade_real +
				"\n Lista de pessoas que deram nota igual á 10: " + cont_nota_10 +
				"\n Quantidade de homens cujas opiniões sobre o filme foram inferiores a 5 : " + cont_masc_nota_menor_5 + 
				"\n Quantidade de mulheres cujas opiniões sobre o filme foram inferiores a 5 : " + cont_fem_nota_menor_5 + 
				"\n Quantidade de homens cujas opiniões sobre o filme foram superiores a 7 : " + cont_masc_nota_maior_7 +
				"\n Quantidade de mulheres cujas opiniões sobre o filme foram superiores a 7 : " + cont_fem_nota_maior_7 +
				"\n Média das notas informadas : " + df.format(media_notas_informadas));
		
	}

}
