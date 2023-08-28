package If_else;

//Feito por : Felipe Rothbarth
//data: 04/07/2023

/*
* 	Calcule o IMC de uma pessoa por meio de um programa. Nele, você solicitará o peso
	do usuário em quilogramas (ex.: 58.9) e sua altura em metros (ex.: 1.68). A partir
	dessas informações, você calculará seu Índice de Massa Corporal (IMC), indicando
	se seu índice é:
	● Abaixo do peso (IMC < 18,5)
	● Peso normal (IMC 18,5-24,9)
	● Sobrepeso (IMC 25-29,9)
	● Obeso (IMC >= 30).

*/

import javax.swing.JOptionPane;

public class Exercicio_5 {

	public static void main(String[] args) {

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em quilogramas : "));
		while (peso < 0) {
			peso = Integer.parseInt(JOptionPane.showInputDialog("Informe um peso positivo : "));

		}

		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metros : "));
		while (altura < 0) {
			altura = Integer.parseInt(JOptionPane.showInputDialog("Informe uma altura positivo : "));

		}

		double imc = peso / (altura * altura);

		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, " Abaixo do peso ");

		} else if (imc > 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null, " Peso normal ");

		} else if (imc > 25.0 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null, " Sobrepeso ");

		} else if (imc >= 30) {
			JOptionPane.showMessageDialog(null, " Obeso ");

		}

	}

}
