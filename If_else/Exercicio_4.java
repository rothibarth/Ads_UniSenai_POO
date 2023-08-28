package If_else;

//Feito por : Felipe Rothbarth
//data: 03/07/2023

/*
 * 	Construa uma solução que peça ao usuário sua idade e verifique se ele é:
	● Uma criança, com idade abaixo de 18 anos;
	● Um jovem, com idade entre 18 e 30 anos;
	● Um adulto, com idade entre 30 e 59 anos;
	● Um idoso, com idade a partir de 60 anos.

 */

import javax.swing.JOptionPane;

public class Exercicio_4 {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));

		while (idade < 0) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade positiva : "));

		}

		if (idade < 18) {
			JOptionPane.showMessageDialog(null, idade, "Uma criança ", JOptionPane.INFORMATION_MESSAGE);

		} else if (idade >= 18 && idade < 30) {
			JOptionPane.showMessageDialog(null, idade, "Um Jovem ", JOptionPane.INFORMATION_MESSAGE);

		} else if (idade >= 30 && idade < 59) {
			JOptionPane.showMessageDialog(null, idade, "Um Adulto", JOptionPane.INFORMATION_MESSAGE);

		} else if (idade >= 60 && idade < 150) {
			JOptionPane.showMessageDialog(null, idade, "Um Idoso", JOptionPane.INFORMATION_MESSAGE);

		}else {
			JOptionPane.showMessageDialog(null, idade, "Idade invalida", JOptionPane.INFORMATION_MESSAGE);

		}
	}

}
