package View;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
	
	public static int solicitaOpcao() {
		
		String [] opcoes = {"Construir carro" , "Listar Carros" , "Encerrar o programa"};
		
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Escolha a opção que você deseja " , JOptionPane.OK_CANCEL_OPTION);
		
		return menu.getSelectedIndex();
	}

	public static String solicitarModelo() {

		String modelo = JOptionPane.showInputDialog("Informe o modelo do veiculo: ");

		return modelo;
	}

	public static String solicitarCor() {

		String cor = JOptionPane.showInputDialog("Informe a cor do veiculo: ");

		return cor;
	}
	
	public static int solicitarAno() {
		
		int ano_carro = Integer.parseInt(JOptionPane.showInputDialog("Informe a ano do veiculo: "));
		
		return ano_carro;
	}
	
	public static int solicitar_tipo_carro() {
		
		int carro_tipo_escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite :"
				+ "\n (1) para carro esportivo "
				+ " \n (2) para carro com pelicula, "
				+ " \n (caso seja um carro normal digite qualquer outro numero) :  "));
		
		return carro_tipo_escolha;
	}
	

	public static String mostrarConsulta(String descricao_carro) {

		JOptionPane.showMessageDialog(null, "" + descricao_carro);
		
		return descricao_carro;
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!! ");
	}
}
