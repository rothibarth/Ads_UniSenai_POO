package Scan_print;

	//Feito por : Felipe Rothbarth
	//data: 28/06/2023
	/*
	Construa um conversor de temperaturas. Você solicitará uma temperatura em graus
	Celsius e converterá para Fahrenheit e Kelvin, exibindo o resultado.
	Obs.: pesquise como realizar a conversão de Celsius para Fahrenheit e Kelvin.
	
	 */
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double temperatura = 0;
		double temperatura_fahrenheit = 0;
		double kelvin_o_chris = 0;
		
		System.out.println("Informe uma temperatura celsius : ");
		temperatura = sc.nextDouble();
		
		 temperatura_fahrenheit = (temperatura * 1.8) + 32;
		 kelvin_o_chris = temperatura + 273.15;

		
		System.out.println("Em celsius = " + temperatura );
		System.out.println("Em fahrenheit = " + temperatura_fahrenheit) ;
		System.out.println("Em Kelvin = " + kelvin_o_chris) ;
		

	}

}
