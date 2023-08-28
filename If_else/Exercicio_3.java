package If_else;

//Feito por : Felipe Rothbarth
//data: 03/07/2023

/*
	 * Peça ao usuário um número de 1 a 7. Ao final, seu programa indicará a qual dia da
	semana esse número corresponde.
	 */

import javax.swing.JOptionPane;

public class Exercicio_3 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número entre 1 a 7:  "));

		while (numero < 1 || numero > 7) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Lembrando numero entre 1 a 7 , informe um numero novamente :   "));

		}

		if (numero == 1) {
			JOptionPane.showMessageDialog(null, numero, "SEGUNDA-FEIRA", JOptionPane.INFORMATION_MESSAGE);

		} else if (numero == 2) {
			JOptionPane.showMessageDialog(null, numero, "TERÇA-FEIRA", JOptionPane.INFORMATION_MESSAGE);

		} else if (numero == 3) {
			JOptionPane.showMessageDialog(null, numero, "QUARTA-FEIRA", JOptionPane.INFORMATION_MESSAGE);

		} else if (numero == 4) {
			JOptionPane.showMessageDialog(null, numero, "QUINTA-FEIRA", JOptionPane.INFORMATION_MESSAGE);

		} else if (numero == 5) {
			JOptionPane.showMessageDialog(null, numero, "SEXTA-FEIRA", JOptionPane.INFORMATION_MESSAGE);

		} else if (numero == 6) {
			JOptionPane.showMessageDialog(null, numero, "SABADO", JOptionPane.INFORMATION_MESSAGE);

		} else if (numero == 7) {
			JOptionPane.showMessageDialog(null, numero, "DOMINGO", JOptionPane.INFORMATION_MESSAGE);

		}
	}

}
