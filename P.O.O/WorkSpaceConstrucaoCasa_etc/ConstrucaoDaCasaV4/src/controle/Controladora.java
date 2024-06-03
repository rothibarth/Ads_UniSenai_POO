package controle;

import visualizacao.EntradaSaida;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.*;

public class Controladora {

	private Casa casa = null;

	public void exibeMenu() {
		
		int opcao;
		int cont = 0;
		int qtdePortas = 0;
		int qtdeJanelas = 0;


		
		do {
			opcao = EntradaSaida.solicitaOpcao();
			
			switch(opcao) {
			
			case 0:
				
				cont++;
				
				this.casa = new Casa();
				
				String descricao = EntradaSaida.solicitaDescricao("casa", 0);
				String cor = EntradaSaida.solicitaCor();
				
			do {
				 qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
				
				 if(qtdePortas <= 0 ) {	
					 JOptionPane.showMessageDialog(null, "Você deve informar um numero de portas acima de 0, tente novamente :  ");

				}

			}while(qtdePortas <= 0 ); 
			
			//validação para janelas menor ou igual a 0
				
			do {
				 qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
				
				 if(qtdeJanelas <= 0 ) {	
					 JOptionPane.showMessageDialog(null, "Você deve informar um numero de janelas acima de 0, tente novamente :  ");

				}

			}while(qtdeJanelas <= 0 ); 

				
				
				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
				
				for(int i = 0; i < qtdePortas; i++) {
					
					Porta porta = new Porta();
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i+1)));
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));
					listaDePortas.add(porta);
				}
				
				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
				
				for(int i = 0; i < qtdeJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i+1)));
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));
					listaDeJanelas.add(janela);
				}
				
				this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);
				
				//AQUI EM BAIXO SOMENTE UM TESTE NO CONSOLE
//				System.out.println("Descrição da casa: " + casa.getDescricao() + "\n");
//				System.out.println("Cor da casa: " + casa.getCor() + "\n");
//				
//				for(Aberturas porta : casa.getListaDePortas()) {
//					System.out.println("Descrição da porta: " + porta.getDescricao() + "\n");
//					System.out.println("Estado da porta: " + porta.getEstado() + "\n");
//				}
//				
//				for(Aberturas janela : casa.getListaDeJanelas()) {
//					System.out.println("Descrição da janela: " + janela.getDescricao() + "\n");
//					System.out.println("Estado da janela: " + janela.getEstado() + "\n");
//				}
				//FINALIZANDO O TESTE NO CONSOLE
				
				//JOptionPane.showMessageDialog(null, "Contruir  casa");
			break;
			
			case 1:
				
				if(cont <= 0) {
					
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE MOVIMENTAR PORTAS OU JANELAS SEM TER CRIADO UMA CASA !!!");
					break;
				}else {
					
				
				String tipoAbertura = EntradaSaida.solicitaTipoAbertura();
				
				ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();
				
				if(tipoAbertura.equals("porta")) {
					listaDeAberturas = this.casa.getListaDePortas();
				}else {
					listaDeAberturas = this.casa.getListaDeJanelas();
				}
				
				int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
				int novoEstado = 0;
				
				if(posicao != -1) {
					novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
					Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);
					this.casa.moverAbertura(abertura, novoEstado);
					System.out.println("Novo estado da " + tipoAbertura + ":" + abertura.getEstado());
				}else {
					EntradaSaida.exibeMsgAbertura();
				}
				
				//JOptionPane.showMessageDialog(null, "Movimentar portas ou janelas");
			break;
				}
			
			case 2:
				
				String informacoes = this.casa.geraInfoCasa();
				EntradaSaida.exibeInfoCasa(informacoes);
				//JOptionPane.showMessageDialog(null, "Ver informações da casa");
			break;
			
			}
		}while(opcao != 3);
		
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
	}

}
