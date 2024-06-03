package modelo;

import java.util.ArrayList;

import visualizacao.EntradaSaida;

public class Movimentacao {

	private int tipoMovimentacao; // (considerar: 1- saque e 2- depósito

	private int valor;

	private int data;

	public int getTipoMovimentacao() {

		return this.tipoMovimentacao;
	}

	public void setTipoMovimentacao(int tipoMovimentacao) {

		this.tipoMovimentacao = tipoMovimentacao;
	}

	public int getValor() {

		return this.valor;
	}

	public void setValor(int valor) {

		this.valor = valor;

	}

	public int getData() {

		return this.data;
	}

	public void setData(int data) {

		this.data = data;
	}

}
