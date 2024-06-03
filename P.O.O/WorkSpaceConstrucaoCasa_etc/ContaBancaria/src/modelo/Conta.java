package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import visualizacao.EntradaSaida;

public class Conta {

	private String titularDaConta;

	private int tipoConta; // (1-conta poupança, 2-conta corrente.)

	private int saldo;

	private String tipo_Conta;
	private String tipo_mov;

	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<>();
	private ArrayList<Movimentacao> listaDeMovimentacaoDeposito = new ArrayList<>();
	private ArrayList<Movimentacao> listaDeMovimentacaoSaque = new ArrayList<>();

	// private listaDeMovimentacao<Movimentacao>0

	public void gerarConta(Conta conta) {

		conta.setTitularDaConta(EntradaSaida.criarConta());
		conta.setTipo(EntradaSaida.tipo_conta());
		while (tipoConta > 2 || tipoConta <= 0) {
			JOptionPane.showMessageDialog(null, "INFORME O TIPO DA CONTA DIREITO ");
			System.exit(0);

		}
	}

	public void depositar(Movimentacao movimentacao, Conta conta) {

		Movimentacao movimentar = new Movimentacao();
		movimentar.setTipoMovimentacao(2);
		movimentar.setValor(EntradaSaida.solicitarInformacoesDeposito());
		// movimentacao.setData(EntradaSaida.data());
		System.out.println(movimentar.getValor()); // TESTE NO CONSOLE
		conta.setSaldo(saldo + movimentar.getValor());
		listaDeMovimentacao.add(movimentar);
		listaDeMovimentacaoDeposito.add(movimentar);

	}

	public void gerarSaldo(Movimentacao movimentacao) {

		// saldo += movimentacao.getValor();
		JOptionPane.showMessageDialog(null, "Saldo: " + saldo);
		System.out.print("saldo guri:" + saldo);
	}

	public void sacar(Movimentacao movimentacao, Conta conta) {

		Movimentacao movimentar = new Movimentacao();

		movimentar.setTipoMovimentacao(1);
		movimentar.setValor(EntradaSaida.solicitarInformacoesSaque());
		// movimentacao.setData(EntradaSaida.data());
		conta.setSaldo(saldo - movimentar.getValor());
		listaDeMovimentacao.add(movimentar);
		listaDeMovimentacaoSaque.add(movimentar);
	}

	public void exibirDadosConta(Conta conta) {

		conta.setTitularDaConta(titularDaConta);
		conta.setTipo(tipoConta);
		conta.setSaldo(saldo);

		if (tipoConta == 1) {
			JOptionPane.showMessageDialog(null,
					"Titular da conta:  " + titularDaConta + "\n tipo da Conta : Conta Poupança \n Saldo :  " + saldo);

		} else {
			JOptionPane.showMessageDialog(null,
					"Titular da conta:  " + titularDaConta + "\n tipo da Conta:  Conta Corrente \n Saldo :  " + saldo);

		}

	}

	public void gerarExtrato(Movimentacao movimentacao, String dataAtual, Conta conta) {

		if (tipoConta == 1) {

			tipo_Conta = " -- Poupança -- ";
		} else if (tipoConta == 2) {
			tipo_Conta = " -- Corrente -- ";
		}

		String info = "Titular da conta: " + this.titularDaConta + "\n Tipo da conta :" + this.tipo_Conta + "\n"
				+ "=============" + "\n Movimentação: " + "\n" + "===============";

		for (int i = 0; i < listaDeMovimentacao.size(); i++) {
			Movimentacao movimentar = listaDeMovimentacao.get(i);
			System.out.println(movimentar.getValor()); // TESTE NO CONSOLE
			System.out.println(movimentar.getTipoMovimentacao()); // TESTE NO CONSOLE
			if (movimentar.getTipoMovimentacao() == 2) {

				tipo_mov = "Deposito";

			} else if (movimentar.getTipoMovimentacao() == 1) {
				tipo_mov = "Saque";

			}

			info += "\n Tipo da Movimentação:  " + " ---- " + tipo_mov + " ---- " + "\n" + "Valor: "
					+ movimentar.getValor() + "\n " + "Data: " + dataAtual + "\n " + "===============" + "\n";
		}

		EntradaSaida.exibirExtratoCompleto(info);
	}

	public void gerarExtratoDeposito(Movimentacao movimentacao, String dataAtual, Conta conta) {

		if (tipoConta == 1) {

			tipo_Conta = " -- Poupança -- ";
		} else if (tipoConta == 2) {
			tipo_Conta = " -- Corrente -- ";
		}

		String info_deposito = "Titular da conta: " + this.titularDaConta + "\n Tipo da conta :" + this.tipo_Conta
				+ "\n" + "=============" + "\n Movimentação: " + "\n" + "===============";

		for (int i = 0; i < listaDeMovimentacaoDeposito.size(); i++) {

			Movimentacao movimentar = listaDeMovimentacaoDeposito.get(i);

			if (movimentar.getTipoMovimentacao() == 2) {

				tipo_mov = "Deposito";

			}

			info_deposito += "\n Tipo da Movimentação:  " + " ---- " + tipo_mov + " ---- " + "\n" + "Valor: "
					+ movimentar.getValor() + "\n " + "Data: " + dataAtual + "\n " + "===============" + "\n";
		}

		EntradaSaida.exibirExtratoDeposito(info_deposito);

	}

	public void gerarExtratoSaque(Movimentacao movimentacao, String dataAtual, Conta conta) {

		if (tipoConta == 1) {

			tipo_Conta = " -- Poupança -- ";
		} else if (tipoConta == 2) {
			tipo_Conta = " -- Corrente -- ";
		}

		String info_saque = "Titular da conta: " + this.titularDaConta + "\n Tipo da conta :" + this.tipo_Conta + "\n"
				+ "=============" + "\n Movimentação: " + "\n" + "===============";

		for (int i = 0; i < listaDeMovimentacaoSaque.size(); i++) {

			Movimentacao movimentar = listaDeMovimentacaoSaque.get(i);

			if (movimentar.getTipoMovimentacao() == 1) {

				tipo_mov = "Saque";

			}

			info_saque += "\n Tipo da Movimentação:  " + " ---- " + tipo_mov + " ---- " + "\n" + "Valor: "
					+ movimentar.getValor() + "\n " + "Data: " + dataAtual + "\n " + "===============" + "\n";
		}

		EntradaSaida.exibirExtratoDeposito(info_saque);

	}

	public String getTitularDaConta() {

		return this.titularDaConta;

	}

	public void setTitularDaConta(String titularDaConta) {

		this.titularDaConta = titularDaConta;
	}

	public int getTipo() {

		return this.tipoConta;
	}

	public void setTipo(int tipoConta) {

		this.tipoConta = tipoConta;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getListaDeMovimentacao() {

		return listaDeMovimentacao;

	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {

		this.listaDeMovimentacao = listaDeMovimentacao;
	}

}
