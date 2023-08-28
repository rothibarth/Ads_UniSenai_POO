package Switch;

	//Feito por : Felipe rothbarth
	//Data: 26/07/2023

	/*
	 * Desenvolva um sistema de votação para uma eleição. O programa terá um menu que
	deve permitir ao usuário digitar o número do candidato de sua escolha, que varia de
	1 a 5, e em seguida, exibir uma mensagem informando o nome e a plataforma política
	do candidato escolhido.
	Após o usuário digitar o número do candidato, deve-se verificar o número digitado e
	exibir uma mensagem com o nome e a plataforma política do candidato escolhido.
	Caso o número digitado não corresponda a nenhum candidato válido, o programa
	deve exibir uma mensagem de erro.
	 */

import javax.swing.JOptionPane;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		int candidato = Integer.parseInt(JOptionPane.showInputDialog("Escolha o seu canditado   \n 1 - ciro gomes \n 2 - mitico jovem \n 3 - lucas o boleia \n 4 - matue \n 5 - mel maia"));
	
		switch (candidato) {
		
			case 1:
				JOptionPane.showMessageDialog(null, " Candidato CIRO GOMES sua Plataforma politica é PPD " , null ,JOptionPane.INFORMATION_MESSAGE);
				
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, " Candidato MITICO JOVEM sua Plataforma politica é PCD " , null  ,JOptionPane.INFORMATION_MESSAGE);
				
			break;
			
			case 3:
				JOptionPane.showMessageDialog(null, " Candidato LUCAS O BOLEIA sua Plataforma politica é CLT " , null  ,JOptionPane.INFORMATION_MESSAGE);
				
			break;
			
			case 4:
				JOptionPane.showMessageDialog(null, " Candidato MATUE sua Plataforma politica é NA - narcoticos anonimos " , null  ,JOptionPane.INFORMATION_MESSAGE);
				
			break;
			
			case 5:
				JOptionPane.showMessageDialog(null, " Candidato MEL MAIA sua Plataforma politica é ACDM " , null  ,JOptionPane.INFORMATION_MESSAGE);
				
			break;
			
			default:
				
				JOptionPane.showMessageDialog(null, " CANDIDATO INVALIDO", null, JOptionPane.INFORMATION_MESSAGE);

			break;
		}
	}

}
