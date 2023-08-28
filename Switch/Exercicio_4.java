package Switch;

//Feito por : Felipe rothbarth
//Data: 26/07/2023

/*
    Desenvolva um programa que permita calcular o imposto de renda de uma pessoa. O
	usuário informa o valor do salário bruto mensal e o programa deve calcular o valor do
	imposto de acordo com a seguinte tabela:
	● Salário até R$1.903,98: isento de imposto
	● Salário de R$1.903,99 até R$2.826,65: 7,5% de imposto
	● Salário de R$2.826,66 até R$3.751,05: 15% de imposto
	● Salário de R$3.751,06 até R$4.664,68: 22,5% de imposto
	● Salário acima de R$4.664,68: 27,5% de imposto
	Calcule o valor do imposto de acordo com o salário informado pelo usuário e exiba o
	resultado. Lembre-se de que o valor do imposto deve ser calculado apenas sobre a
	diferença entre o salário e o limite inferior de cada faixa de imposto. Por exemplo, se
	o salário for R$2.000,00, o valor do imposto será 7,5% sobre R$96,01 (R$2.000,00 -
	R$1.903,99). Caso o valor do imposto seja igual a zero, exiba a mensagem "Isento de
	imposto". Caso contrário, exiba o valor do imposto calculado.
 */

import javax.swing.JOptionPane;

public class Exercicio_4 {

	public static void main(String[] args) {

		Double renda_pessoa = Double.parseDouble(JOptionPane.showInputDialog("Infome seu salario bruto mensal:  "));
		
		while(renda_pessoa < 0) {
			renda_pessoa = Double.parseDouble(JOptionPane.showInputDialog("NUMERO INCORRETO !! informe seu salario bruto mensal :  "));
		}

		int imposto_renda = 0;

		if (renda_pessoa <= 1903.98) {
			imposto_renda = 1;
		} else if (renda_pessoa >= 1903.99 && renda_pessoa <= 2826.65) {
			imposto_renda = 2;
		} else if (renda_pessoa >= 2826.66 && renda_pessoa <= 3751.05) {
			imposto_renda = 3;
		} else if (renda_pessoa >= 3751.06 && renda_pessoa <= 4664.68) {
			imposto_renda = 4;
		} else {
			imposto_renda = 5;
		}

		switch (imposto_renda) {

		case 1:

			JOptionPane.showMessageDialog(null, " ISENTO DE IMPOSTO ", null, JOptionPane.INFORMATION_MESSAGE);

		break;

		case 2:

			JOptionPane.showMessageDialog(null, " 7,25% de imposto :  " + renda_pessoa * 0.075, null,JOptionPane.INFORMATION_MESSAGE);

		break;

		case 3:

			JOptionPane.showMessageDialog(null, " 15% de imposto :  " + renda_pessoa * 0.15, null,JOptionPane.INFORMATION_MESSAGE);

		break;
		
		case 4:

			JOptionPane.showMessageDialog(null, " 22,5% de imposto :  " + (renda_pessoa * 22.5) / 100 , null,JOptionPane.INFORMATION_MESSAGE);

		break;
		
		
		case 5:

			JOptionPane.showMessageDialog(null, " 27,5% de imposto :  " + (renda_pessoa * 27.5) / 100 , null,JOptionPane.INFORMATION_MESSAGE);

		break;
		
		
		}
	}

}
