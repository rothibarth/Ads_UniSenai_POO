package controle;

import modelo.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
//import java.util.Date;
//import java.text.SimpleDateFormat;

public class Controladora {

	public void exibeMenu() {

		int opcao;

		Loja loja = new Loja();

		do {

			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			case 0: // CADASTRAR PRODUTO

				loja.cadastrarProduto();
				// JOptionPane.showMessageDialog(null, "Criar conta");

				break;

			case 1: // LISTAR PRODUTOS CADASTRADOS

				String lista = loja.listarProdutosCadastrados();
				EntradaSaida.exibeListaCadastro(lista);
				// JOptionPane.showMessageDialog(null, "Listar produtos");

				break;

			case 2: // INSERIR PRODUTOS NO ESTOQUE

				loja.inserirProdutosEstoque();
				// JOptionPane.showMessageDialog(null, "Inserir produtos no estoque");

				break;

			case 3: // VENDER UM PRODUTO
				
				Date dataHoraAtual = new Date(); // retorna a data e hora atual do sistema do pc
				String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual); // formata a data para o estilo																					// desejado
				String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual); // formata a hora
				String dataAtual = "\n" + data + "\n" + hora + " "; // usei uma string para juntar as duas informações em
																	// uma só
				
				loja.venderProduto(loja,dataAtual);
				//JOptionPane.showMessageDialog(null, "Vender um produto");

				break;
				
			case 4: // LISTAR PRODUTOS EM ESTOQUE
				
				String listaEstoque = loja.listarProdutosNoEstoque();
				EntradaSaida.exibeListaCadastroEstoque(listaEstoque);
				//JOptionPane.showMessageDialog(null, "Listar produtos em estoque");


				break;
				
			case 5: // VISUALIZAÃO DE TODOS OS CUPONS GERADOS
				
				//JOptionPane.showMessageDialog(null, "VISUALIZAÃO DE TODOS OS CUPONS GERADOS");
				
				String copuns_fiscais = " VISUALIZANDO TODOS OS CUPONS FISCAIS : \n" + loja.getListaCupomFiscal();
				JOptionPane.showMessageDialog(null, copuns_fiscais);
				
				break;
				
			case 6: //Calcular o valor total dos cupons
				
				JOptionPane.showMessageDialog(null, " VALOR TOTAL: " + loja.valorTotal);
				break;

			}

		} while (opcao != 7);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}

}
