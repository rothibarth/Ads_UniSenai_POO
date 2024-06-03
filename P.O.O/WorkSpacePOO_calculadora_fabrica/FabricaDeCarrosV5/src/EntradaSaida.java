import javax.swing.JOptionPane;

public class EntradaSaida {

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
		
		int carro_tipo_escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite (1) para carro esportivo ou (2) para carro com pelicula, (caso seja um carro normal digite qualquer outro numero) :  "));
		
		return carro_tipo_escolha;
	}
	

	public static void mostrarConsulta(String modelo, String cor, int ano_carro, String carro_escolhido) {

		JOptionPane.showMessageDialog(null, "O modelo escolido foi :  " + modelo + " \n e a cor escolhida foi :  " + cor  + " \n e o ano do seu carro é : " + ano_carro + " \n " + carro_escolhido);
	}
}
