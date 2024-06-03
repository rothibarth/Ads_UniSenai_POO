package modelo;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import visualizacao.EntradaSaida;

public class Fabrica {


	private ArrayList<Carro> listaDeCarro = new ArrayList<Carro>();

	public ArrayList<Carro> getListaDeCarro() {

		return listaDeCarro;
	}

	public void setListaDeCarro(ArrayList<Carro> listaDeCarro) {
		this.listaDeCarro = listaDeCarro;
	}

	public void fabricarCarro(int qtdeCarro) {
		// Carro carro = new Carro();

		for (int i = 0; i < qtdeCarro; i++) {

			Carro carro = new Carro();

			carro.setModelo(EntradaSaida.solicitaModelo(i));
			carro.setCor(EntradaSaida.solicitaCor(i));
			listaDeCarro.add(carro);

		}
	}

	public String geraInfoCarro() {

		String informacoes = "";

		for (int i = 0; i < listaDeCarro.size(); i++) {

			informacoes += "\n Modelo do " + (i + 1) + "º  carro : " + listaDeCarro.get(i).getModelo() + "\n Cor do "
					+ (i + 1) + " º carro " + listaDeCarro.get(i).getCor();

		}

		return informacoes;

	}

	public void venderCarro(String modelo, String cor) {

		for (int i = 0; i < listaDeCarro.size(); i++) {

			Carro carro = listaDeCarro.get(i);
			if ((carro.getModelo().equals(modelo)) && (carro.getCor().equals(cor))) {
				System.out.println("vendido");
				listaDeCarro.remove(carro);
			} else {
				System.out.println("não vendido");
			}
		}

	}

}
