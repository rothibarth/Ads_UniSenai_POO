package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {

		String[] opcoes = { "Cadastrar Produto", "Listar Produtos Cadastrados", "Inserir produtos no estoque",
				"Vender um produto", "Listar produtos em estoque", "Listar todos os Cumpons gerados",
				"Calcular  o valor total dos cupons", "Encerrar programa" };

		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	public static int codigoProduto() {

		int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto: "));

		return codigoProduto;

	}

	public static String descricaoProduto() {

		String descricaoProduto = JOptionPane.showInputDialog("Informe a descrição do produto: ");

		return descricaoProduto;
	}

	public static int precoProduto() {

		int preco = Integer.parseInt(JOptionPane.showInputDialog("Informe o preço do produto"));

		return preco;
	}

	public static int quantidade() {

		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto : "));

		return qtde;
	}

	public static void exibeListaCadastro(String lista) {

		JOptionPane.showMessageDialog(null, "A lista será apresentada abaixo: \n" + lista);

	}

	public static void exibeListaCadastroEstoque(String listaEstoque) {

		JOptionPane.showMessageDialog(null, "A lista será apresentada abaixo: \n" + listaEstoque);

	}

	public static void exibeCupomFiscalAtual(String cupomFiscalAtual) {

		JOptionPane.showMessageDialog(null, "Cupom fiscal : \n" + cupomFiscalAtual);

	}

	public static void exibeMsgEncerraPrograma() {

		JOptionPane.showMessageDialog(null, "O programa será encerrado!! ");

	}
}
