package controle;

import visualizacao.EntradaSaida;

import javax.swing.JOptionPane;

import modelo.*;


public class Controladora {

	private Casa casa = null;
	
	public void exibeMenu() {
		
		int opcao;
		
		do {
			opcao = EntradaSaida.solicitaOpcao();
			
			switch(opcao) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "Contruir  casa");
			break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Movimentar portas ou janelas");
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Ver informações da casa");
			break;
			
			}
		}while(opcao != 3);
		
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
	}
	
}
