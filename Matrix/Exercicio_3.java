package Matrix;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 22/08/2023

/*
 * 	Crie um programa para solicitar os valores de uma matriz 3x2. Em seguida, você
	deverá fazer a transposição dessa matriz.
	Obs.: pesquisar o que é matriz transposta
 */

public class Exercicio_3 {

	public static void main(String[] args) {

		int[][] valores = new int[3][2];
		int[][] transposta = new int[2][3];
		String mostrar_matriz = "";
		String mostrar_transposta = "";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite um número para a " + (i + 1) + "ª linha e " + (j + 1) + " ª coluna: "));

				mostrar_matriz += "|" + valores[i][j] + " | ";

			}

			mostrar_matriz += "\n";
		}

		JOptionPane.showMessageDialog(null, mostrar_matriz);

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {

				transposta[j][i] = valores[i][j];

			}

		}

		//MOSTRAR MATRIZ TRANSPOSTA
		for (int i = 0; i < transposta.length; i++) {
			for (int j = 0; j < transposta[i].length; j++) {

				mostrar_transposta += ("|" + transposta[i][j] + " | ");

			}

			mostrar_transposta += "\n";

		}
		
		JOptionPane.showMessageDialog(null, mostrar_transposta);

	}

}
