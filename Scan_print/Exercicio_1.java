package Scan_print;

	//Feito por : Felipe Rothbarth
	//data: 27/06/2023
	/*
	  	Construa uma solução que solicite ao usuário seu nome e idade. Em seguida, exiba
		uma saudação com o nome digitado e informe a idade dessa pessoa.
	 */

import javax.swing.JOptionPane;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		 String nome = null ;// metodo da classe JOptionPane		 		
		 nome = JOptionPane.showInputDialog("Informe seu nome :  ");
		 		//classe
		 
		 int idade = 0; 
		 idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade :  "));
		 
		 JOptionPane.showMessageDialog(null, nome, "saudações meu amigo ",  JOptionPane.INFORMATION_MESSAGE);  
		 JOptionPane.showMessageDialog(null, idade, "Sua idade é ", JOptionPane.INFORMATION_MESSAGE);

		 
	}

}
