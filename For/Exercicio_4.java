package For;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Exercicio_4 {

	public static void main(String[] args) {
		ArrayList<String> baralho = criarBaralho();
		Collections.shuffle(baralho);

		int pontuacao = 0;
		boolean continuar = true;

		JOptionPane.showMessageDialog(null, "Bem vindo ao jogo de 21!", null, JOptionPane.INFORMATION_MESSAGE);

		while (continuar) {
			String carta = puxarCarta(baralho);
			int valorCarta = obterValorCarta(carta);

			JOptionPane.showMessageDialog(null, "Sua próxima carta é " + carta, null, JOptionPane.INFORMATION_MESSAGE);
			pontuacao += valorCarta;
			JOptionPane.showMessageDialog(null, "Total " + pontuacao, null, JOptionPane.INFORMATION_MESSAGE);

			if (pontuacao == 21) {
				JOptionPane.showMessageDialog(null, "Parabéns! Você fez 21!" + carta, null,
						JOptionPane.INFORMATION_MESSAGE);

				break;
			} else if (pontuacao > 21) {
				JOptionPane.showMessageDialog(null, "Você ultrapassou 21. Que pena! Você perdeu o jogo.", null,
						JOptionPane.INFORMATION_MESSAGE);
				break;
			} else {
				String resposta =JOptionPane.showInputDialog(null, "Deseja mais uma carta? (sim/parar):", null,
						JOptionPane.INFORMATION_MESSAGE);
				// scanner.nextLine();
				continuar = resposta.equalsIgnoreCase("sim");
			}
		}

		JOptionPane.showMessageDialog(null, "Sua pontuação final: " + pontuacao, null, JOptionPane.INFORMATION_MESSAGE);

	}

	private static ArrayList<String> criarBaralho() {
		ArrayList<String> baralho = new ArrayList<>();
		String[] naipes = { "Espadas", "Paus", "Copas", "Ouros" };
		String[] valores = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Rainha", "Rei" };

		for (String naipe : naipes) {
			for (String valor : valores) {
				baralho.add(valor + " de " + naipe);
			}
		}

		return baralho;
	}

	private static String puxarCarta(ArrayList<String> baralho) {
		return baralho.remove(0);
	}

	private static int obterValorCarta(String carta) {
		if (carta.startsWith("Ás")) {
			return 1; // O Ás pode valer 1 ou 11, mas para simplificar, vamos considerar 1 aqui.
		} else if (carta.startsWith("Valete") || carta.startsWith("Rainha") || carta.startsWith("Rei")) {
			return 10;
		} else {
			int index = carta.indexOf(" ");
			String valorCarta = carta.substring(0, index);
			return Integer.parseInt(valorCarta);
		}
	}
}