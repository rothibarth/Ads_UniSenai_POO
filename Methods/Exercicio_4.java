package Methods;

import javax.swing.JOptionPane;
import java.util.Random;
//Feito por: Felipe Rafael Rothbarth
//Data: 30/08/2023

/*
	Você está organizando um evento beneficente e precisa distribuir um único
	brinde para uma das pessoas participantes do evento. Contudo, esse evento não
	permite sorteio nominal. Então, alguém deu a seguinte ideia: desenvolver uma
	solução de adivinhação. A pessoa vai no computador e pode digitar até 5 (cinco)
	números, ou seja, ela terá 5 (cinco) chances. Se ela adivinhar um o número
	escolhido aleatoriamente pelo computador, ela ganhará. Se acertar aparecerá
	“PARABÉNS! Você ganhou o brinde!”. Se não, lerá “Que pena. Infelizmente você
	não acertou.”
 */

public class Exercicio_4 {

	public static void main(String[] args) {

		int numero = armazena_numero();
		mostrar(numero);
	}

	public static int armazena_numero() {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Você tem 5 tentativas !! Digite um numero: "));

		while(numero < 0) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Você tem 5 tentativas !! você informou um numero negativo!! Digite um numero: "));
		}
		
		return numero;

	}

	public static void mostrar(int numero) {


		Random numeroAleat = new Random();

		int numAleatorio = numeroAleat.nextInt(10);

		JOptionPane.showMessageDialog(null, numAleatorio, "teste", JOptionPane.INFORMATION_MESSAGE);

		int cont = 0;

		while (numero != numAleatorio) {

			cont++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("ERROU !!! Digite um numero NOVAMENTE: "));

			if (cont == 5) {
				JOptionPane.showMessageDialog(null, "Você perdeu !!!!!!!", null, JOptionPane.INFORMATION_MESSAGE);
				break;
			}

		}

		if (numero == numAleatorio) {
			JOptionPane.showMessageDialog(null, "Você Acertou !!!!!!!", null, JOptionPane.INFORMATION_MESSAGE);

		}

	}

}
