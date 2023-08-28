package If_else;

//Feito por : Felipe Rothbarth
//data: 03/07/2023

/*
	 * Construa um código capaz de solicitar ao usuário uma nota de 0 a 10. Se ele tirou: a
	partir de 7, está aprovado; entre 5 e 6, está em recuperação; abaixo de 5, está
	reprovado.
	 */

import javax.swing.JOptionPane;

public class Exercicio_1 {

	public static void main(String[] args) {

		double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota de 0 a 10: "));

		while (nota < 0 || nota > 10) {
			nota = Double.parseDouble(
					JOptionPane.showInputDialog("Lembrando nota entre 0 a 10 Informe uma nota novamente:  "));

		}

		if (nota >= 7) {
			JOptionPane.showMessageDialog(null, nota, "Parabens você está aprovado!!!",
					JOptionPane.INFORMATION_MESSAGE);

		} else if (nota >= 5 && nota < 7) {
			JOptionPane.showMessageDialog(null, nota, "Está em recuperação!!!!", JOptionPane.INFORMATION_MESSAGE);

		} else if (nota < 5) {
			JOptionPane.showMessageDialog(null, nota, "Está reprovado!!!!", JOptionPane.INFORMATION_MESSAGE);

		}

	}

}
