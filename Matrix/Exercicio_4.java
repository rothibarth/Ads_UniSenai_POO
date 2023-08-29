package Matrix;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 28/08/2023

/*
 * 	Desenvolva um programa em Java que leia uma matriz de dimensões 4x4 e exiba o
	resto da divisão de cada elemento da diagonal principal. Além disso, apresente
	também produto total da diagonal secundária da matriz.
 */

public class Exercicio_4 {

	public static void main(String[] args) {

		int[][] valores = new int[4][4];
		String mostrar_matriz = "";
		String mostrar_resto = "";
		int[] resto = new int[4];

		int numero_divisor_produto_resto = 0;

		numero_divisor_produto_resto = Integer.parseInt(JOptionPane
				.showInputDialog("Informe um numero para ser o resto da divisão e do produto da matriz: "));

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite um número para a " + (i + 1) + "ª linha e " + (j + 1) + " ª coluna: "));

				mostrar_matriz += "|" + valores[i][j] + " | ";

			}
			
			mostrar_matriz += "\n";

		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				if (i == j) {
					resto[i] += valores[i][j] % numero_divisor_produto_resto;
					mostrar_resto += ("|" + resto[i] + "|");
				}

				if (i + j == valores.length - 1) {
					numero_divisor_produto_resto =  numero_divisor_produto_resto * valores[i][j];
				}

			}
		}

		//SAIDA DE DADOS
		JOptionPane.showMessageDialog(null, mostrar_matriz);
		JOptionPane.showMessageDialog(null, "Resto divisao primeira diagonal " + mostrar_resto);
		JOptionPane.showMessageDialog(null, "só produto da segunda diagonal " + numero_divisor_produto_resto);

	}

}
