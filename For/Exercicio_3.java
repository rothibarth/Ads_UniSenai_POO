package For;

//Feito por : Felipe Rothbarth
//data: 01/08/2023

/*
 * 	Prepare um código-fonte para um programa que verifica APENAS os números primos
	de 1 a 100.
	Obs.: pesquise o que são números primos.
 */
import javax.swing.JOptionPane;

public class Exercicio_3 {

	public static void main(String[] args) {

		String var = "";

		for (int i = 2; i < 101; i++) {

			boolean validar = true;

			for (int x = 2; x < i; x++) {

				if (i % x == 0) {
					validar = false;

				}
			}

			if (validar == true) {
				var += (i + " ");
			}

		}

		JOptionPane.showMessageDialog(null, " ESSES SÃO OS NUMEROS PRIMOS \n " + var , null, JOptionPane.INFORMATION_MESSAGE);

	}

}
