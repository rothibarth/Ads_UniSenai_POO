package If_else;



//Feito por : Felipe Rothbarth
//data: 04/07/2023

/*
* 	Você está construindo uma solução para calcular o valor final do salário de um
	colaborador. Portanto, calcule o salário de um colaborador, sabendo que:
	• A jornada de trabalho é de 40 horas semanais, ou 160 horas mensais;
	• Caso haja horas extras, o valor a ser pago é de 50% a mais do valor normal da hora
	para cada hora extra realizada

 */ 
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio_7 {

	public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("0.00");
        
		double horas_trabalhadas_mes = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas no mês : "));
		
		while (horas_trabalhadas_mes  < 0) {
			horas_trabalhadas_mes  = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade de horas postiva:  "));

		}

		double valor_pago_hora = Double
				.parseDouble(JOptionPane.showInputDialog("Informe quanto é o valor pago por hora:  "));
		
		while (valor_pago_hora  < 0) {
			valor_pago_hora  = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor postivo:   "));

		}

		double salario_normal = horas_trabalhadas_mes * valor_pago_hora;

		if (horas_trabalhadas_mes <= 160) {
			JOptionPane.showMessageDialog(null, decimal.format(salario_normal), " Seu salario normal sem hora extra foi de R$:  ",
					JOptionPane.INFORMATION_MESSAGE);

		} else if (horas_trabalhadas_mes > 160) {

			double hora_extra = horas_trabalhadas_mes - 160;
			double salario_extra = hora_extra * valor_pago_hora +  (valor_pago_hora * 0.5);
			salario_normal = salario_extra + salario_normal;

			JOptionPane.showMessageDialog(null, decimal.format(salario_normal), " Seu salario normal com hora extra foi de R$:  ",
					JOptionPane.INFORMATION_MESSAGE);

		}

	}

}
