package Switch;

/*
//Feito por : Felipe Rothbarth
//data: 27/06/2023
 * Crie um programa que peça para o usuário selecionar uma figura geométrica de sua
	escolha:
	● Círculo;
	● Quadrado;
	● Retângulo;
	● Triângulo.
	
	Em seguida, peça os dados necessários para calcular e exibir a área da figura
selecionada.
 */

import javax.swing.JOptionPane;

public class Exercicio_1 {

	public static void main(String[] args) {

		int figura_geometrica = 0;
		figura_geometrica = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite uma figura geometrica de sua escolha\n Dentre elas são :\n  use = \n 1 - Círculo\n 2 - Quadrado\n 3 - Retângulo\n 4 - Triângulo"));

		switch (figura_geometrica) {

		case 1:

			int raio = 0;
			raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio do circulo :  "));

			double area_circulo = 3.14 * (raio * raio);
			JOptionPane.showMessageDialog(null, "Área do circulo é = " + area_circulo , "CÍRCULO ", JOptionPane.INFORMATION_MESSAGE);
			
		break;

		case 2:

			int lado = 0;
			lado = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado do quadrado :  "));

			double area_quadrado = lado * lado;
			JOptionPane.showMessageDialog(null, "Área do quadrado é = " + area_quadrado , " QUADRADO ", JOptionPane.INFORMATION_MESSAGE);
			
		break;
		
		case 3:

			int base = 0;
			base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do retangulo :  "));
			
			int altura = 0;
			altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do retangulo :  "));

			double area_retangulo = base * altura;
			JOptionPane.showMessageDialog(null, "Área do retangulo é = " + area_retangulo , " RETANGULO ", JOptionPane.INFORMATION_MESSAGE);
			
		break;
		
		case 4:

			int base_tri = 0;
			base_tri = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do triangulo :  "));
			
			int altura_tri = 0;
			altura_tri = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do triangulo :  "));

			double area_triangulo = (base_tri * altura_tri) / 2;
			JOptionPane.showMessageDialog(null, "Área do triangulo é = " + area_triangulo , " TRIANGULO ", JOptionPane.INFORMATION_MESSAGE);
			
		break;
		
		default :
			JOptionPane.showMessageDialog(null, figura_geometrica, "FIGURA INEXISTENTE " , JOptionPane.INFORMATION_MESSAGE);
		break;

		}
	}

}
