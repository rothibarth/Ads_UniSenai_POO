package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {

		String[] opcoes = { "Fabricar Açaí", "Listar Açaí Fabricado", "Vender Açaí", "Listar Vendas Açaí",
				"Encerrar Programa" };

		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção que você deseja", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}
	
	public static String nomeCliente() {
		
		String nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
		
		return nome;
	}

	public static String solicitaOpcaoTamanho() {

		String[] opcoes = { "300 - ML  " , "400 - ML", "500 - ML" };

		JComboBox<String> tamanho = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, tamanho, "Selecione o tamanho do seu Açaí: ", JOptionPane.OK_CANCEL_OPTION);

		return tamanho.getSelectedItem().toString();

	}

	public static int solicitaQtdeAcompanhamento() {

		String[] opcoes = { "1", "2" , "3" };

		JComboBox<String> qtdeAcompanhamento = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, qtdeAcompanhamento, "Selecione os acompanhamentos:", JOptionPane.OK_CANCEL_OPTION);

		return qtdeAcompanhamento.getSelectedIndex();

	}
	
	public static void exibeListaVendasAtual(String listaVendas) {

		JOptionPane.showMessageDialog(null, "Lista de Vendas : \n" + listaVendas);

	}
	
	
	public static void exibeInfoAcai(String listaAcaiFabricado) {
		
		JOptionPane.showMessageDialog(null, listaAcaiFabricado, " Lista Açai : ", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!!!!!!!!!!");
	}

}
