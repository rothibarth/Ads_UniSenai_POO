package Scan_print;

//Feito por : Felipe Rothbarth
	//data: 28/06/2023
	/*
	Peça um número real e exiba o mesmo arredondado para o inteiro.
	Obs.: pesquise como funcionam os arredondamentos em Java.	
	 */

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float numero = 0;
		
		System.out.println("Informe um número real : ");
		numero = sc.nextFloat();
		
		System.out.println( "O número  " + numero + "  arredondado é igual à " + Math.round(numero));
	}

}
