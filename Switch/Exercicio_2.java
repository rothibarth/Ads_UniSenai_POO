package Switch;

//Feito por : Felipe rothbarth
//Data: 25/07/2023

/*
 * 	Solicite que o usuário informe uma letra do alfabeto. Posteriormente, verifique se essa
	letra é uma vogal, uma consoante ou um caractere inválido.

 */

import javax.swing.JOptionPane;

public class Exercicio_2 {

	public static void main(String[] args) {

		String letra_alfabeto = JOptionPane.showInputDialog("Digite uma letra do alfabeto :  ");

		switch (letra_alfabeto) {

		case "a", "e", "i", "o", "u":
			JOptionPane.showMessageDialog(null,  letra_alfabeto, " VOGAL ", JOptionPane.INFORMATION_MESSAGE);
			break;

		case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z":
			JOptionPane.showMessageDialog(null,  letra_alfabeto, " CONSOANTE ", JOptionPane.INFORMATION_MESSAGE);

			break;
			
		default:
			JOptionPane.showMessageDialog(null, letra_alfabeto, " CARACTER INVALIDO", JOptionPane.INFORMATION_MESSAGE);

		break;
		}

	}

}
