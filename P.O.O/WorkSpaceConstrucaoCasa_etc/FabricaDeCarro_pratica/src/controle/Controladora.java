package controle;
import modelo.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;

public class Controladora {
	
	Carro carro = new Carro();
	Fabrica fabrica = new Fabrica();
	int qtde = 0;
	int cont = 0;
	
	public void exibeMenu() {
		int opcao;
		

		do {
			
			opcao = EntradaSaida.solicitaOpcao();
			
			switch(opcao) {
			
			case 0:
				
				cont++;
				
				int qtdeCarro = Integer.parseInt(JOptionPane.showInputDialog(null , "Informe a quantidade de carros que você deseja construir: "));
				
				//Fabrica fabrica = new Fabrica();
				
				fabrica.fabricarCarro(qtdeCarro);


				//JOptionPane.showMessageDialog(null, "Fabricar carros ");
			break;
			
			case 1:
				
				//VENDA DE UM CARRO
				
				if(cont <= 0) {
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE VENDER UM CARRO SEM TER CRIADO UM PELO MENOS !!!");
					break;
				}else {
					
					//fabrica.venderCarro(carro.getModelo(), carro.getCor());
					qtde = EntradaSaida.solicitarQuantidade();

					int j ;
					
					for(j = 0; j < qtde; j++) {
						carro.setModelo(EntradaSaida.solicitaModeloVenda());
						carro.setCor(EntradaSaida.solicitaCorVenda());
						fabrica.venderCarro(carro.getModelo(), carro.getCor());
					}
				}
				
				
				
				
				//----------------------
				
//				int opcao_remover =+ fabrica.solicitaOpcaoRemover();
//				System.out.println("Opcao que vai ser removida : " + opcao_remover + " ");
//				//JOptionPane.showMessageDialog(null, "Vender um carro");
//				String[] VendaCarro = new String[fabrica.getListaDeCarro().size()];
//				String msgVender = "";
//				
//				if(!(fabrica.getListaDeCarro().isEmpty())) {
//					
//					for(int i = 0; i < fabrica.getListaDeCarro().size(); i++) {
//						 msgVender = "";
//						 
//						 msgVender += fabrica.getListaDeCarro().get(i).getModelo().toUpperCase() + "-" 
//						 + fabrica.getListaDeCarro().get(i).getCor().toUpperCase() + " ";
//						 
//						 
//						 
//
//					}
//				}
//				
			break;
			
			case 2:
				
				if(cont <= 0) {
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE VER AS INFORMAÇÕES DE UM CARRO SEM TER PELO MENOS CRIADO UM !!!");
					break;
					
				}else {
					String informacoes = fabrica.geraInfoCarro();
					EntradaSaida.exibeInfoCarro(informacoes);
				}
				
				
				
				//JOptionPane.showMessageDialog(null, "Ver informações dos carros");

			break;
			
				
			}
		}while(opcao != 3);
		
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
	}
	
	

}
