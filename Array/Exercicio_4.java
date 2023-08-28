package Array;

import java.util.Arrays;

import javax.swing.JOptionPane;
//Feito por: Felipe Rafael Rothbarth
//Data: 17/08/2023

/*
 * 	Faça um programa que leia 5 números inteiros digitados pelo usuário e armazene-os
	em um vetor. Em seguida, o programa deve ordenar os números em ordem crescente
	e imprimir o vetor ordenado.
 */

public class Exercicio_4 {

	public static void main(String[] args) {
		
		// NEW - construção do objeto - construtor
		
		int [] numeros = new int[5];
		String posicao_vetor_desordem = "";
		String posicao_vetor_ordem = "";
	
 
		
		for(int i = 0; i < 5; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º número inteiro: "));
			
			while(numeros[i] < 0) {
				numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Você informou um numero negativo !! Informe o " + (i+1) + "º número inteiro: "));

			}
			
			posicao_vetor_desordem += (numeros[i] + " \n ");
			
		}
		
		Arrays.sort(numeros);
		
		for(int i = 0; i < 5; i++) {
			
			posicao_vetor_ordem += (numeros[i] + " \n ");

		}
		
		
		JOptionPane.showMessageDialog(null, "Os numeros em desordem:  \n" + posicao_vetor_desordem);
		JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente:  \n" + posicao_vetor_ordem);

	}

}
