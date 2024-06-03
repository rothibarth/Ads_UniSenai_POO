package visualizacao;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Conta;

public class EntradaSaida {

	public static int solicitaOpcao() {

		String[] opcoes = { "Criar Conta", "Depositar", "Sacar", "Gerar Saldo", "Dados da conta", "Extrato",
				"Extrato Depositos", "Extrato saques", "Sair" };

		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	public static int solicitarInformacoesDeposito() {

		int depositar = Integer.parseInt(JOptionPane.showInputDialog("Informe quanto você deseja depositar: "));

		return depositar;
	}

	public static int solicitarInformacoesSaque() {

		int sacar = Integer.parseInt(JOptionPane.showInputDialog("Informe quanto você deseja Sacar: "));

		return sacar;
	}

	public static String criarConta() {

		String info_conta = JOptionPane.showInputDialog("Informe seu nome :  ");

		return info_conta;
	}

	public static int tipo_conta() {

		int tipo_da_conta = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe que tipo de conta você deseja criar (Digite 1 - para poupança ou 2 - para conta corrente )"));

		return tipo_da_conta;
	}

	public static void exibirExtratoCompleto(String info) {

		JOptionPane.showMessageDialog(null, info);
	}

	public static void exibirExtratoDeposito(String info_deposito) {

		JOptionPane.showMessageDialog(null, info_deposito);
	}

	public static void exibirExtratoSaque(String info_saque) {

		JOptionPane.showMessageDialog(null, info_saque);
	}

//	public static void exibirSaldo() {
//
//		JOptionPane.showMessageDialog(null, "O seu saldo é de  R$: ");
//	}
//
//	public static void exibirDadosDaConta(Conta conta) {
//		JOptionPane.showMessageDialog(null, "Nome do titular: \n" + "Tipo da conta : " + "Saldo : ");
//	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!! ");
	}
}
