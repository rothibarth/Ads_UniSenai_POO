package Model;
import javax.swing.JOptionPane;

public class CarroEsportivo extends CarroBase {

	public String tipo_carro() {

		String esportivo = JOptionPane.showInputDialog("Informe o que tem de esportivo no seu veiculo: ");

		return ("O que tem de esportivo no seu carro é : " + esportivo) ;
	}
}
