package Controller;

import javax.swing.JOptionPane;
import Model.*;
import View.EntradaSaida;

public class Controladora {

	Carro carro1 = new Carro();
	int continuar;
	String descricao_carro = "";
	int cont = 0;
	String carro_escolhido = "";

	public void exibeMenu() {

		int opcao;

		do {

			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			case 0:
				// TESTE PARA VISUALIZAÇÃO - JOptionPane.showMessageDialog(null, "Construir carro");
				
				cont++;
				
				do {

					String modelo = EntradaSaida.solicitarModelo();
					String cor = EntradaSaida.solicitarCor();
					int ano_carro = EntradaSaida.solicitarAno();
					int carro_tipo_escolha = EntradaSaida.solicitar_tipo_carro();

					CarroBase carro_escolha = null;

					carro1.setModelo(modelo);
					carro1.setCor(cor);
					carro1.setAno_carro(ano_carro);

					switch (carro_tipo_escolha) {

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
					
					// TESTE PARA VISUALIZAÇÃO - EntradaSaida.mostrarConsulta(modelo, cor, ano_carro, carro_escolhido);
					
					
					continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? 1 - Sim | 2 - não"));

				} while (continuar == 1);

				break;
			
			case 1:

				// TESTE PARA VISUALIZAÇÃO - JOptionPane.showMessageDialog(null, "Listar carro");
				
				if(cont == 0 ) {
					
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE LISTAR UM CARRO SEM TER FEITO NO MINIMO UM CADASTRO!!! ");

				}else {
					
					descricao_carro = ("Modelo do seu carro: " + carro1.getModelo() + "\n  A cor do seu carro é : " + carro1.getCor() +
							"\n Ano do seu carro é :  " + carro1.getAno_carro() +  
							"\n "  + carro_escolhido);
					
					EntradaSaida.mostrarConsulta(descricao_carro);
					break;
				}
				

			}
		} while (opcao != 2);
		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);

	}

}


// ESTA PARTE DE BAIXO ERA SOMENTE UM TESTE OBS:( DEIXEI ALI SÓ PRA EU LEMBRAR DO CODIGO :) )


//		do {
//
//			String modelo = EntradaSaida.solicitarModelo();
//			String cor = EntradaSaida.solicitarCor();
//			int ano_carro = EntradaSaida.solicitarAno();
//			int carro_esportivo_escolha = EntradaSaida.solicitar_tipo_carro();
//
//			CarroBase carro_escolha = null;
//			String carro_escolhido = null;
//
//			carro1.setModelo(modelo);
//			carro1.setCor(cor);
//			carro1.setAno_carro(ano_carro);
//
//			switch (carro_esportivo_escolha) {
//
//			case 1:
//
//				carro_escolha = new CarroEsportivo();
//
//				break;
//
//			case 2:
//
//				carro_escolha = new CarroPelicula();
//
//				break;
//
//			default:
//				carro_escolha = new Carro();
//			}
//
//			carro_escolhido = carro_escolha.tipo_carro();
//			EntradaSaida.mostrarConsulta(modelo, cor, ano_carro, carro_escolhido);
//
//			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? 1 - Sim | 2 - não"));
//
//		} while (continuar == 1);
