package Methods;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//Feito por: Felipe Rafael Rothbarth
//Data: 30/08/2023

/*
  	Primeiramente, peça uma medida em metros ao usuário. Depois pergunte para qual
	unidade de medida ele deseja converter: centímetros, polegadas, pés ou quilômetros.
	Ao final, apresente o valor da conversão.

 */

public class Exercicio_3 {

	public static void main(String[] args) {

		double medida_metros = armazena_medida_metros();
		String escolha = armazena_escolha();

		mostrar(escolha, medida_metros);

	}

	public static double armazena_medida_metros() {

		Double medida_metros = Double
				.parseDouble(JOptionPane.showInputDialog("Informe uma medida em metros.Ex(1.70) : "));

		while (medida_metros < 0) {

			medida_metros = Double.parseDouble(JOptionPane
					.showInputDialog("Você informou uma medida negativa!! Informe uma medida em metros.Ex(1.70) : "));

		}

		return medida_metros;

	}

	public static String armazena_escolha() {

		String escolha = JOptionPane.showInputDialog("Qual medida você deseja converter \n Opções: \n "
				+ " cm = centimetros" + "\n pol = polegadas" + "\n pes = pés" + "\n km = quilometros");

		return escolha;

	}

	public static void mostrar(String escolha, Double medida_metros) {

		DecimalFormat df = new DecimalFormat("0.00");

		switch (escolha) {

		case "cm":
			JOptionPane.showMessageDialog(null,
					"Você optou por escolher na conversão em centimetros : " + df.format(medida_metros * 100));
			break;

		case "pol":
			JOptionPane.showMessageDialog(null,
					"Você optou por escolher na conversão em polegadas : " + df.format(medida_metros * 39.37));
			break;

		case "pes":
			JOptionPane.showMessageDialog(null,
					"Você optou por escolher na conversão em pés : " + df.format(medida_metros * 3.281));
			break;

		case "km":
			JOptionPane.showMessageDialog(null,
					"Você optou por escolher na conversão em quilometros : " + df.format(medida_metros * 1000));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Você informou uma medida incorreta");
			break;

		}

	}

}
