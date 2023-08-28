package Matrix;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 22/08/2023

/*
 * 	Crie duas matrizes 4x4 e compare para saber quantos elementos elas possuam que
	são iguais. Apresente a quantidade e quais são esses elementos.
 */

public class Exercicio_2 {

	public static void main(String[] args) {

		int[][] valores_matrix1 = new int[4][4];
		int[][] valores_matrix2 = new int[4][4];
		int cont = 0;
		String mostrar = "";

		// informando os valores da 1ª matrix
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				valores_matrix1[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite um número para a " + (i + 1) + "ª linha e " + (j + 1) + " ª coluna: "));

			}
		}

		// informando os valores da 2ª matrix
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				valores_matrix2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite um número para a " + (i + 1) + "ª linha e " + (j + 1) + " ª coluna: "));

			}
		}

		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 4; b++) {

				for (int c = 0; c < 4; c++) {
					for (int d = 0; d < 4; d++) {

						if (valores_matrix1[a][b] == valores_matrix2[c][d]) {
							cont++;
							mostrar += (valores_matrix2[c][d] + ",");

						}
					}
				}
			}
		}

		JOptionPane.showMessageDialog(null, "  A quantidade de numeros iguais destas matrizes são :  " + cont
				+ "  Os elementos iguais são :  " + mostrar, null, JOptionPane.INFORMATION_MESSAGE);

	}

}
