package modelo;

//import java.util.ArrayList;

public abstract class Produtos {

	private int codigo;

	private String descricao;

	private int preco;

	public int getCodigo() {

		return this.codigo;
	}

	public void setCodigo(int codigo) {

		this.codigo = codigo;
	}

	public String getDescricao() {

		return this.descricao;
	}

	public void setDescricao(String descricao) {

		this.descricao = descricao;
	}

	public int getPreco() {

		return this.preco;
	}

	public void setPreco(int preco) {

		this.preco = preco;
	}

}
