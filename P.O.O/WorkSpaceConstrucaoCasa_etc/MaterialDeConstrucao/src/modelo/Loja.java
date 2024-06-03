package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import visualizacao.EntradaSaida;

public class Loja extends Produtos {

	private ArrayList<Loja> listaDeProdutos = new ArrayList<Loja>();
	private ArrayList<Loja> listaDeProdutosEstoque = new ArrayList<Loja>(); // TEM UM COMANDO QUE FAZ GET E SET //																			// AUTOMATICO - SOURCE ......
	private ArrayList<String> listaCupomFiscal = new ArrayList<String>();

	public int valorTotal = 0;
	private int quantidade;

	public void cadastrarProduto() {

		Loja produto = new Loja();

		produto.setCodigo(EntradaSaida.codigoProduto());
		produto.setDescricao(EntradaSaida.descricaoProduto());
		produto.setPreco(EntradaSaida.precoProduto());
		listaDeProdutos.add(produto);

	}

	public String listarProdutosCadastrados() {

		String listar = "";

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			listar += "\n ---------------------------------------------------------------" + "\n Codigo produto :  "
					+ listaDeProdutos.get(i).getCodigo() + "\n Descrição produto:  "
					+ listaDeProdutos.get(i).getDescricao() + "\n Preço produto:  " + listaDeProdutos.get(i).getPreco();

		}

		return listar;
	}

	public String listarProdutosNoEstoque() {

		String listar = "";

		for (int i = 0; i < listaDeProdutosEstoque.size(); i++) {

			listar += "\n ---------------------------------------------------------------" + "\n Codigo produto :  "
					+ listaDeProdutosEstoque.get(i).getCodigo() + "\n Descrição produto:  "
					+ listaDeProdutosEstoque.get(i).getDescricao() + "\n Preço produto:  "
					+ listaDeProdutosEstoque.get(i).getPreco() + "\n Quantidade produto:  "
					+ listaDeProdutosEstoque.get(i).getQuantidade();

		}

		return listar;
	}

	public void inserirProdutosEstoque() {

		int codigo = EntradaSaida.codigoProduto();

		for (int i = 0; i < listaDeProdutos.size(); i++) {

			if (codigo == listaDeProdutos.get(i).getCodigo()) {

				int codigo_produto = listaDeProdutos.get(i).getCodigo();
				String descricao_produto = listaDeProdutos.get(i).getDescricao();
				int preco_produto = listaDeProdutos.get(i).getPreco();

				Loja produtoEstoque = new Loja();

				produtoEstoque.setCodigo(codigo_produto);
				produtoEstoque.setDescricao(descricao_produto);
				produtoEstoque.setPreco(preco_produto);
				produtoEstoque.setQuantidade(EntradaSaida.quantidade());
				listaDeProdutosEstoque.add(produtoEstoque);

			}

		}

	}

	public void venderProduto(Produtos produtos, String dataAtual) {

		int codigo = EntradaSaida.codigoProduto();
		int qtde = EntradaSaida.quantidade();
		String cupomFiscalAtual = "";

		for (int i = 0; i < listaDeProdutosEstoque.size(); i++) {

			Loja produto = listaDeProdutosEstoque.get(i);
			int quantidade_atualizada = 0;
			if (produto.getCodigo() == (codigo)) {
				if (produto.getQuantidade() < qtde) {
					JOptionPane.showMessageDialog(null, " Você informou uma quantidade maior que temos no estoque. ");
				} else {
					quantidade_atualizada = produto.getQuantidade() - qtde;
					produto.setQuantidade(quantidade_atualizada);

				}

				// VALOR TOTAL DE TODAS AS VENDAS
				valorTotal += qtde * produto.getPreco();

				cupomFiscalAtual += "\n ################################################################### "
						+ "\n Data da venda: " + dataAtual + "\n Descrição do produto: "
						+ listaDeProdutosEstoque.get(i).getDescricao() + "\n Quantidade vendida: " + qtde
						+ "\n Valor total: " + produto.getPreco() * qtde
						+ "\n ################################################################### \n";
				listaCupomFiscal.add(cupomFiscalAtual);

				if (quantidade_atualizada == 0) {
					System.out.println("vendido");
					listaDeProdutosEstoque.remove(produto);
				}
			} else {
				System.out.println("não vendido");
			}

		}
		EntradaSaida.exibeCupomFiscalAtual(cupomFiscalAtual);

	}

	public ArrayList<Loja> getListaDeProdutos() {

		return listaDeProdutos;

	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setListaDeProdutos(ArrayList<Loja> listaDeProdutos) {

		this.listaDeProdutos = listaDeProdutos;

	}

	public ArrayList<Loja> getListaDeProdutosEstoque() {
		return listaDeProdutosEstoque;
	}

	public void setListaDeProdutosEstoque(ArrayList<Loja> listaDeProdutosEstoque) {
		this.listaDeProdutosEstoque = listaDeProdutosEstoque;
	}

	public ArrayList<String> getListaCupomFiscal() {
		return listaCupomFiscal;
	}

	public void setListaCupomFiscal(ArrayList<String> listaCupomFiscal) {
		this.listaCupomFiscal = listaCupomFiscal;
	}

}
