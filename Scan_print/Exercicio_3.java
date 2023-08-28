package Scan_print;

	//Feito por : Felipe Rothbarth
	//data: 27/06/2023
	/*
	  	Construa uma solução que solicita ao usuário um número inteiro e exibe se o número
		é par ou ímpar.
	 */

import javax.swing.JOptionPane;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(" Informe um numero para vermos se é par ou impar : "));
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, numero, " Este numero é par ", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, numero, " Este numero é impar ", JOptionPane.INFORMATION_MESSAGE);

		}
				
	}

}
