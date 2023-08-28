package Array;

import javax.swing.JOptionPane;
import java.util.Arrays;


//Feito por: Felipe Rafael Rothbarth
//Data: 16/08/2023

/*
  	Faça um programa que leia 10 números inteiros digitados pelo usuário e armazeneos em um vetor. Em seguida, calcule e imprima a média desses números e informe o
	2º maior e o 3º menor número.
 */

public class Exercicio_1 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		int media_numeros = 0;
		int maior = 0 , menor = 0;
		
		for(int i = 0; i < 10; i++) {
			numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o  " + (i + 1) + "  º número : "));
						
			while(numeros[i] < 0) {
				numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Você informou um numero negativo !! Informe o " + (i+1) + "º número inteiro: "));

			}
			
			media_numeros += numeros[i];  
		
			
		}
		
		//organizar os vetores em forma crescente
		Arrays.sort(numeros);
		
		maior = numeros[8];
		menor = numeros[2];
		
		JOptionPane.showMessageDialog(null,  "A média dos numeros digitados é : " + media_numeros / 10 , null ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, " O 2º maior : " + maior + 
				"\n O 3º menor : " + menor);
		
	}

}
