package Switch;

//Feito por : Felipe rothbarth
//Data: 25/07/2023

/*
* 	Solicite que o usuário informe uma letra do alfabeto. Posteriormente, verifique se essa
	letra é uma vogal, uma consoante ou um caractere inválido.

*/

import javax.swing.JOptionPane;

import java.io.*;

public class Exercicio_2_versao_2 {

	public static void main(String[] args) {
		
		String letra_alfabeto = JOptionPane.showInputDialog("Digite uma letra do alfabeto :  ");
		
		int escolha1 = 0;
		
		if(letra_alfabeto.equalsIgnoreCase("a") || letra_alfabeto.equalsIgnoreCase("e")|| letra_alfabeto.equalsIgnoreCase("i") || letra_alfabeto.equalsIgnoreCase("o") || letra_alfabeto.equalsIgnoreCase("u")) {
			escolha1 = 1;
		}else if (!Character.isDigit(letra_alfabeto.charAt(escolha1)) && !Character.isLetter(letra_alfabeto.charAt(escolha1)) && !Character.isWhitespace(letra_alfabeto.charAt(escolha1))) {
			escolha1 = 2;
		}
		
		switch(escolha1) {
		 case 1: 
				JOptionPane.showMessageDialog(null,  letra_alfabeto, " VOGAL ", JOptionPane.INFORMATION_MESSAGE);

		break;
		
		 case 2:
				JOptionPane.showMessageDialog(null,  letra_alfabeto, " CARACTER INVALIDO ", JOptionPane.INFORMATION_MESSAGE);

		break;
		
		default :
			JOptionPane.showMessageDialog(null, " CONSOANTE ", null,JOptionPane.INFORMATION_MESSAGE);

		break;
		
		}
	}

}
