package If_else;

//Feito por : Felipe Rothbarth
//data: 03/07/2023

/*
	 * Agora, prepare seu código para que ele receba 3 notas, calcule a média aritmética e
	verifique se o aluno foi aprovado, está em recuperação ou está reprovado (use as
	regras do Desafio 1)
	 */ 

import javax.swing.JOptionPane;
											///ajustar 5.5
public class Exercicio_2 {

	public static void main(String[] args) {

		double[] notas = new double[3];

		for (int i = 0; i < 3; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "ª nota: "));
			
			while (notas[i] < 0 || notas[i] > 10) {
				notas[i] = Double.parseDouble(
						JOptionPane.showInputDialog("Lembrando nota entre 0 a 10 Informe a " + (i + 1) + " ª nota novamente:  "));

			}
		}
				
		double media_aritmetica = (notas[0] + notas[1] + notas[2]) / 3;

		if (media_aritmetica >= 7) {
			JOptionPane.showMessageDialog(null, media_aritmetica, "Parabens você está aprovado!!!",
					JOptionPane.INFORMATION_MESSAGE);

		} else if (media_aritmetica >= 5 || media_aritmetica < 7) {
			JOptionPane.showMessageDialog(null, media_aritmetica, "Está em recuperação!!!!",JOptionPane.INFORMATION_MESSAGE);

		} else if (media_aritmetica < 5) {
			JOptionPane.showMessageDialog(null, media_aritmetica, "Está reprovado!!!!",JOptionPane.INFORMATION_MESSAGE);

		}
	}

}
