package Matrix;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 22/08/2023

/*
 * 	O professor "Beico Zito" está em busca de uma solução que possa calcular a soma
	de cada linha e a soma total de uma matriz 4x5. Para isso, ele precisa de um algoritmo
	que possa realizar esses cálculos.

 */

public class Exercicio_1 {

	public static void main(String[] args) {

		
		int[][] valores = new int[4][5];
		int[] somaLinha = new int[4];
		int somaTotal = 0;
		String mostrar = "";
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				valores [i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a " + (i+1) + "ª linha e " + (j+1) + " ª coluna: ")); 
				
				while(valores [i][j] < 0) {
					valores [i][j] = Integer.parseInt(JOptionPane.showInputDialog("Você informou um numero abaixo de 0 !!! Digite um número para a " + (i+1) + "ª linha e " + (j+1) + " ª coluna: ")); 

				}
				
				somaLinha[i] += valores[i][j];
				somaTotal += valores[i][j];
				
			}
			
			mostrar += ( "A soma da " + (i+1) + "ª linha é " +  somaLinha[i] + " " +"\n" );
		}
		
		JOptionPane.showMessageDialog(null,  mostrar + "\n A soma da matriz é : " + somaTotal , null ,JOptionPane.INFORMATION_MESSAGE);

		
	}

}
