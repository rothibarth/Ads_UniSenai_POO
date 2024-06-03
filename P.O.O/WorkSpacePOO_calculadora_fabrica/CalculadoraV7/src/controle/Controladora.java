package controle;


import javax.swing.JOptionPane;
import modelo.*;
//import modelo.Divisao;
//import modelo.Multiplicacao;
//import modelo.Operacoes;
//import modelo.Soma;
//import modelo.Subtracao;
import visualizacao.EntradaSaida;

public class Controladora {

	public void exibeMenu() {

		int continuar;
		double resultado = 0;
		Operacoes oper = null;
		do {

			double num1 = EntradaSaida.solicitaNumero("1º");
			double num2 = EntradaSaida.solicitaNumero("2º");
			int operacao = EntradaSaida.solicitaOperacao();

			switch (operacao) {

			case 1:
				oper = new Soma();
				break;

			case 2:
				oper = new Subtracao();
				break;

			case 3:
				oper = new Multiplicacao();
				break;

			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}

				oper = new Divisao();
				break;

			default:
				JOptionPane.showMessageDialog(null, "Operação invalida! A calculadora será encerrada! ");
				System.exit(0);
			}
			oper.setNum1(num1);
			oper.setNum2(num2);
			resultado = oper.calcula();

			EntradaSaida.mostraResultado(resultado, operacao);

			continuar = Integer
					.parseInt(JOptionPane.showInputDialog("Deseja continuar  calculando? 1 - Sim | 2 - não"));

		} while (continuar == 1);
	}

}
