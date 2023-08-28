package do_do_while;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//Feito por: Felipe Rafael Rothbarth
//Data: 10/08/2023

/*
  	Você deverá desenvolver um algoritmo que solicite a idade, o gênero e o salário de
	um grupo de pessoas. Para encerrar o programa, o usuário deve digitar "Finalizar".
	Certifique-se de validar para que o usuário digite exatamente "Finalizar". Ao término
	da execução do programa, será apresentado ao usuário as seguintes informações:
	● A média de idade geral;
	● A média de idade de pessoas do gênero feminino;
	● A média de idade de pessoas do gênero masculino;
	● A média salarial geral;
	● A média salarial do gênero feminino;
	● A média salarial do gênero masculino.
	
 */

public class Exercicio_2 {

	public static void main(String[] args) {

		boolean finaliza = false;
		int cont = 0;
		int cont_media_idade_masc = 0;
		int cont_media_idade_fem = 0;
		int cont_media_salario_masc = 0;
		int cont_media_salario_fem = 0;
		int cont_masc = 0;
		int cont_fem = 0;
		double media_geral_idade = 0;
		double media_idade_masc = 0;
		double media_idade_fem = 0;
		double media_salario_masc = 0;
		double media_salario_fem = 0;
		double media_geral_salario = 0;
		//String genero2 = "";

		DecimalFormat df = new DecimalFormat("0.00");

		do {

			cont++;

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade : "));

			while (idade <= 0) {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade Novamente : "));

			}

			int genero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe seu genero use 1 - para masculino e 2 - para feminino : "));

			while (genero <= 0 || genero > 2) {
				genero = Integer.parseInt(JOptionPane.showInputDialog(
						"Você informou um numero incorreto !!!! Informe seu genero use 1 - para masculino e 2 - para feminino : "));
			}

			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario : "));

			while (salario < 0) {
				salario = Double.parseDouble(JOptionPane
						.showInputDialog("Seu salario não pode ser negativo seu pobre !! Informe seu salario real : "));
			}

			if (genero == 1) {
				cont_masc++;
				cont_media_idade_masc += idade;
				cont_media_salario_masc += salario;

			} else if (genero == 2) {
				cont_fem++;
				cont_media_idade_fem += idade;
				cont_media_salario_fem += salario;

			}

			String finalizar = JOptionPane
					.showInputDialog("Digite finalizar para finalizar ou continuar para continuar o programa:  ");

			if (finalizar.equalsIgnoreCase("finalizar")) {
				finaliza = true;
			} else {
				finaliza = false;
			}

		} while (finaliza == false);

			
 		if (cont_fem != 0 && cont_masc == 0) {

			media_salario_fem = cont_media_salario_fem / cont_fem;
			media_idade_fem = cont_media_idade_fem / cont_fem;
			//genero2 = "Feminino";
			
			JOptionPane.showMessageDialog(null, "A média de idade de pessoas do gênero feminino é de : " + media_idade_fem +
			"\n A média salarial do gênero feminino : " + df.format(media_salario_fem) );

		} else if (cont_masc != 0 && cont_fem == 0) {
			media_salario_masc = cont_media_salario_masc / cont_masc;
			media_idade_masc = cont_media_idade_masc / cont_masc;
			//genero2 = "Maculino";
			
			JOptionPane.showMessageDialog(null, "A média de idade de pessoas do gênero masculino é de : " + media_idade_masc +
					"\n A média salarial do gênero masculino : " + df.format(media_salario_masc) );

		} 
 		
 		media_geral_salario = (cont_media_salario_masc + cont_media_salario_fem) / cont;
		media_geral_idade = (cont_media_idade_masc + cont_media_idade_fem) / cont;
		
 		JOptionPane.showMessageDialog(null, "Média de idade geral: " + media_geral_idade);
 		JOptionPane.showMessageDialog(null, "Média de salario geral: " + df.format(media_geral_salario));

 		
		

	}

}
