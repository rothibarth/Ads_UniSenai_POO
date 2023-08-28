package Scan_print;

	//Feito por : Felipe Rothbarth
	//data: 28/06/2023
	/*
	  	Peça ao usuário um número inteiro e exiba sua tabuada de 1 a 10.
	 */
	
	import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println(" Informe um número para ver a sua tabuada de 1 a 10:  ");
		numero = sc.nextInt();
		
		for(int i = 0; i < 11; i++) {
			System.out.println(numero + " " + " * " + i +  " = " + numero * i);

		}
		
	
	}
}
