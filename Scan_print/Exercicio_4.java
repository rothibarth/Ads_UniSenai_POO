package Scan_print;

	//Feito por : Felipe Rothbarth
	//data: 27/06/2023
	/*
	  	Solicite ao usuário o nome, idade e altura (em metros). Ao final, mostre todas as
		informações em uma única linha, de maneira organizada.
	 */
	
import javax.swing.JOptionPane;


public class Exercicio_4 {

	public static void main(String[] args) {
			
			String nome = "";
			nome = JOptionPane.showInputDialog("Informe seu nome :  ");
			
			int idade = 0;
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade :  "));
			
			 float altura = 0;
			 altura = Integer.parseInt(JOptionPane.showInputDialog("Informe sua altura :  "));
			
			JOptionPane.showMessageDialog(null, " Seu nome: " + nome + " \n " + " Sua idade: " + idade + " \n " + "Sua altura: "  + altura, " Nome, Idade, Altura ", JOptionPane.INFORMATION_MESSAGE);

			
	}

}
