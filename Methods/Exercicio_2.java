package Methods;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 29/08/2023

/*
	Construa um programa que solicite ao usuário apenas os números de seu telefone.
	(ex.: 47987654321). Em seguida, por meio de um método, você construirá uma
	máscara para esse número (ex.: (47) 98765-4321).

 */

public class Exercicio_2 {

	public static void main(String[] args) {

		String numero_telefone = armazena_telefone();
		mascarando(numero_telefone);
	}

	public static String armazena_telefone() {

		String numero_telefone = ""; 

		numero_telefone = JOptionPane.showInputDialog("Informe seu número de telefone(11 digitos): ");
		
		while(numero_telefone.length() != 11) {
			
			numero_telefone = JOptionPane.showInputDialog("Você digitou um numero diferente de 11 !!! Informe seu número de telefone(11 digitos): ");

		}
		
		return numero_telefone;


	}

	public static void mascarando(String numero_telefone) {
		
		
		JOptionPane.showMessageDialog( null, "(" + numero_telefone.substring(0, 2) + ")" + numero_telefone.substring(2, 7) + "-"
				+ numero_telefone.substring(7), null ,JOptionPane.INFORMATION_MESSAGE); 
	}

}
