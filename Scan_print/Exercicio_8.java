package Scan_print;

	//Feito por : Felipe Rothbarth
	//data: 28/06/2023
	/*
	 
	Solicite ao usuário uma palavra e exibe o número de caracteres da palavra.
	Obs.: pesquise como se faz a contagem de caracteres de um texto em Java
	
	 */

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra = "";
		
		System.out.println("Digite uma palavra para contarmos o número de caracteres dela :  ");
		palavra = sc.nextLine();
		
        int numero_palavra = palavra.replace(" ", "").length();

		System.out.println("A quantidade de caracteres desta palavra é " + numero_palavra);


	}

}
