package For;

//Feito por : Felipe Rothbarth
//data: 31/07/2023

/*
 * 	Solicite uma palavra ao usuário. Depois, apresente cada letra daquilo que ele
	escreveu e conte quantos caracteres essa palavra tem.
 */

import javax.swing.JOptionPane;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra :  ");
		
		//int  numero_letra = palavra.length();
		
		
		for(int i = 0; i < palavra.length() ; i++) {
			
			JOptionPane.showMessageDialog(null , palavra.charAt(i), null ,JOptionPane.INFORMATION_MESSAGE);

		}
		
		
		JOptionPane.showMessageDialog(null, " Esta palavra tem  " + palavra.length() + " letras" , null ,JOptionPane.INFORMATION_MESSAGE);

		

	}

}
