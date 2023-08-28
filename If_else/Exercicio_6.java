package If_else;

//Feito por : Felipe Rothbarth
//data: 04/07/2023

/*
* 	Construa um programa que solicite ao usuário três comprimentos de lado e, em
seguida, verifique se é possível formar um triângulo. Se sim, exiba o tipo de triângulo.
Obs.: pesquise o que são triângulos equiláteros, isósceles e escalenos

*/

import javax.swing.JOptionPane;

public class Exercicio_6 {

	public static void main(String[] args) {

		double[] lados = new double[3];

		for (int i = 0; i < 3; i++) {
			lados[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe o comprimento do  " + (i + 1) + " º lado: "));
			
			while (lados[i] <= 0) {
				lados[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento do " + (i + 1) + "º lado novamente pois digitou um numero abaixo de 0 : "));

			}
		}

		if (lados[0] == lados[1] && lados[0] == lados[2] && lados[1] == lados[2]) {
			JOptionPane.showMessageDialog(null, " TRIANGULO EQUILATERO !!!!", null, JOptionPane.INFORMATION_MESSAGE);

		} else if (lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2]) {
			JOptionPane.showMessageDialog(null, " TRIANGULO ISOCELES !!!!", null, JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, " TRIANGULO ESCALENOS !!!!", null, JOptionPane.INFORMATION_MESSAGE);

		}
	}

}
