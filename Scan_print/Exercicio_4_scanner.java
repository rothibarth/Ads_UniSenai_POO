package Scan_print;

	//Feito por : Felipe Rothbarth
	//data: 27/06/2023
	/*
	  	Solicite ao usuário o nome, idade e altura (em metros). Ao final, mostre todas as
		informações em uma única linha, de maneira organizada.
	 */
	
import java.util.Scanner;


public class Exercicio_4_scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			String nome = "";
			
			System.out.println("Informe seu nome :  ");
			nome = sc.nextLine();
						
			int idade = 0;
			System.out.println("Informe sua idade :  ");
			idade = sc.nextInt();
			
			 float altura = 0;
			 System.out.println("Informe sua altura : ");
			 altura = sc.nextFloat();
			
			 System.out.println("Seu nome: "+ nome + "\nSua idade: "+ idade + "\nSua Altura: "+ altura);
	
	}

}
