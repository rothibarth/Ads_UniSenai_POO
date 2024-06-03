import javax.swing.JOptionPane;

public class Carro {
	
	public static String solicitarModelo() {
		
		String modelo = JOptionPane.showInputDialog("Informe o modelo do veiculo: ");
		
		return modelo;
	}
	
	public static String solicitarCor() {
		
		String cor = JOptionPane.showInputDialog("Informe a cor do veiculo: ");
		
		return cor;
	}
	
	public static void mostrarConsulta(String modelo, String cor) {
		
		JOptionPane.showMessageDialog(null, "O modelo escolido foi :  " + modelo + "  e a cor escolhida foi :  " + cor);
	}
}
