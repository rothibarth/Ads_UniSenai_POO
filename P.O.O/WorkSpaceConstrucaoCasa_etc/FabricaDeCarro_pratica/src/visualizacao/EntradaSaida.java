package visualizacao;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Carro;

public class EntradaSaida {

	public static String solicitaModelo(int i) {

		String modelo = JOptionPane.showInputDialog("Informe o modelo do " + (i + 1) + " º  veiculo: ");

		return modelo;
	}

	public static String solicitaCor(int i) {

		String cor = JOptionPane.showInputDialog("Informe a cor do " + (i + 1) + " º  veiculo: ");

		return cor;
	}

	public static int solicitaOpcao() {

		String[] opcoes = { "Fabricar carros", "Vender um carro", "Ver informações dos carros", "Sair" };

		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	public static void exibeInfoCarro(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informações dos carros : ", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!! ");
	}

	public static int solicitarQuantidade() {

		int qtde = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros que você deseja vender : "));

		return qtde;
	}

	public static String solicitaModeloVenda() {

		String modelo = JOptionPane.showInputDialog("Informe o modelo do  veiculo que você deseja vender: ");

		return modelo;
	}

	public static String solicitaCorVenda() {

		String cor = JOptionPane.showInputDialog("Informe a cor do veiculo que você deseja vender: ");

		return cor;
	}

}
