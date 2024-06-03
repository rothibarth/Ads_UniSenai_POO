package controle;

import modelo.*;
import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;

public class Controladora {

	public void menu() {

		int opcao;
		int cont = 0;
		int contVenda = 0;

		Fabrica fabrica = new Fabrica();

		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			case 0: // FABRICAR AÇAI

				cont++;

				// JOptionPane.showMessageDialog(null, "Fabricar Açaí");
				fabrica.fabricarAcai();

				break;

			case 1: // LISTAR AÇAÍ FABRICADO

				// JOptionPane.showMessageDialog(null, "Listar Açaí Fabricado");

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null,
							"Para fazer uma listagem dos açaís fabricados você precisa criar um !!!!!!! ");
				} else {
					String listaAcaiFabricado = fabrica.listarAcaiFabricado();
					EntradaSaida.exibeInfoAcai(listaAcaiFabricado);
				}

				break;

			case 2: // VENDER AÇAI

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null,
							"Para fazer a venda dos açaís fabricados você precisa criar um !!!!!!! ");

				} else {
					contVenda++;

					// JOptionPane.showMessageDialog(null, "Vender Açaí");
					fabrica.venderAcai();
				}

				break;

			case 3: // LISTAR VENDAS AÇAI

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null,
							"Para fazer a lista de venda dos açaís fabricados você precisa criar um !!!!!!! ");
				} else if (contVenda <= 0) {
					JOptionPane.showMessageDialog(null,
							"Para fazer a lista de venda dos açaís  você precisa fazer uma venda !!!!!!! ");
				} else {
					// JOptionPane.showMessageDialog(null, "Listar Vendas Açaí");
					String listaVendas = " VISUALIZANDO TODOS OS CUPONS FISCAIS : \n" + fabrica.getListaDeAcaiVendido();
					JOptionPane.showMessageDialog(null, listaVendas);

				}

				break;

			}

		} while (opcao != 4);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);

	}

}
