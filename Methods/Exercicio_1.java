package Methods;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 29/08/2023

/*
 *	 Construa um código capaz de solicitar ao usuário uma nota de 0 a 10. Se ele tirou: a
	partir 7 está aprovado, entre 5 e 6 está em recuperação, abaixo de 5 está reprovado.
 */

public class Exercicio_1 {

	public static void main(String[] args) {

		double nota = armazenando_notas();
		mostrar(nota);

	}

	private static double armazenando_notas() {

		double nota = 0;

		nota = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota entre 0 a 10: "));

		while (nota < 0 || nota > 10) {
			nota = Double.parseDouble(
					JOptionPane.showInputDialog("Você informou uma nota invalida !! Informe uma nota entre 0 a 10: "));

		}

		return nota;

	}

	private static void mostrar(double nota) {

		if (nota >= 7) {
			JOptionPane.showMessageDialog(null, "Parabens você está aprovado!!" , null, JOptionPane.INFORMATION_MESSAGE);
		} else if (nota >= 5) {
			JOptionPane.showMessageDialog(null, "Uma pena você está em recuperação !!!", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Uma pena você está reprovado !!!!!!", null, JOptionPane.INFORMATION_MESSAGE);

		}
		
		/*
		if (nota < 5) {
			JOptionPane.showMessageDialog(null, "Uma pena você está reprovado !!!!!!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (nota < 7) {
			JOptionPane.showMessageDialog(null, "Uma pena você está em recuperação !!!", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Parabens você está aprovado!!" , null, JOptionPane.INFORMATION_MESSAGE);
		}
		*/
	}

}
