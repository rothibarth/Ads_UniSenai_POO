package Controller;

import javax.swing.JOptionPane;
import Model.*;
import View.EntradaSaida;

public class Controladora {
	
	public void exibeMenu() {
		
		Carro carro1 = new Carro();
		int continuar;
		
		do {

			String modelo = EntradaSaida.solicitarModelo();
			String cor = EntradaSaida.solicitarCor();
			int ano_carro = EntradaSaida.solicitarAno();
			int carro_esportivo_escolha = EntradaSaida.solicitar_tipo_carro();

			CarroBase carro_escolha = null;
			String carro_escolhido = null;

			carro1.setModelo(modelo);
			carro1.setCor(cor);
			carro1.setAno_carro(ano_carro);

			switch (carro_esportivo_escolha) {

			case 1:

				carro_escolha = new CarroEsportivo();

				break;

			case 2:

				carro_escolha = new CarroPelicula();

				break;

			default:
				carro_escolha = new Carro();
			}

			carro_escolhido = carro_escolha.tipo_carro();
			EntradaSaida.mostrarConsulta(modelo, cor, ano_carro, carro_escolhido);

			continuar = Integer
					.parseInt(JOptionPane.showInputDialog("Deseja continuar? 1 - Sim | 2 - não"));

		} while (continuar == 1);
	}
	
	
}
