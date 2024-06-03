package controle;

import modelo.*;
//import java.util.ArrayList;
import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Controladora {

	public void exibeMenu() {

		int opcao;
		int cont = 0;

		Conta conta = new Conta();
		Movimentacao movimentar = new Movimentacao();

		do {

			Date dataHoraAtual = new Date(); // retorna a data e hora atual do sistema do pc
			String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual); // formata a data para o estilo																					// desejado
			String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual); // formata a hora
			String dataAtual = "\n" + data + "\n" + hora + " "; // usei uma string para juntar as duas informações em
																// uma só

			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			case 0: // CRIANDO A CONTA

				cont++;

				conta.gerarConta(conta);
				// JOptionPane.showMessageDialog(null, "Criar conta");

				break;

			case 1: // DEPOSITO

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE DEPOSITAR SEM TER CRIADO UMA CONTA");
					break;
				} else {

					conta.depositar(movimentar, conta);

//					int deposito = EntradaSaida.solicitarInformacoesDeposito();
//					System.out.println("dinheiro depositado :" + deposito);
					// JOptionPane.showMessageDialog(null, "Depositar");

				}

				break;

			case 2: // SACAR

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE SACAR SEM TER CRIADO UMA CONTA");
					break;
				} else {

					conta.sacar(movimentar, conta);
//					int saque = EntradaSaida.solicitarInformacoesSaque();
//					System.out.println("dinheiro sacado :" + saque);
					// JOptionPane.showMessageDialog(null, "Sacar");

				}
				break;

			case 3: // GERAR SALDO

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE GERAR SALDO SEM TER CRIADO UMA CONTA");
					break;
				} else {

					conta.gerarSaldo(movimentar);

					// JOptionPane.showMessageDialog(null, "Gerar Saldo ");

				}

				break;

			case 4: // gerarDadosDaConta

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE VER OS DADOS DA CONTA SEM TER CRIADO UMA CONTA");
					break;
				} else {
					// JOptionPane.showMessageDialog(null, "Dados da conta");
					conta.exibirDadosConta(conta);
				}

				break;

			case 5: // EXTRATO COMPLETO

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null,
							"VOCÊ NÃO PODE VER O EXTRATO DA CONTA SEM TER CRIADO UMA CONTA");
					break;
				} else {

					conta.gerarExtrato(movimentar, dataAtual, conta);
					// JOptionPane.showMessageDialog(null, "Extrato");
				}

				break;

			case 6: // EXTRATO DEPOSITOS

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null,
							"VOCÊ NÃO PODE VER O EXTRATO DEPOSITO DA CONTA SEM TER CRIADO UMA CONTA");
					break;
				} else {

					conta.gerarExtratoDeposito(movimentar, dataAtual, conta);
					// JOptionPane.showMessageDialog(null, "Extrato Deposito");

				}

				break;

			case 7: // EXTRATO SAQUE

				if (cont <= 0) {
					JOptionPane.showMessageDialog(null,
							"VOCÊ NÃO PODE VER O EXTRATO SAQUES DA CONTA SEM TER CRIADO UMA CONTA");
					break;
				} else {

					conta.gerarExtratoSaque(movimentar, dataAtual, conta);
					// JOptionPane.showMessageDialog(null, "Extrato Saques");

				}

				break;
			}

		} while (opcao != 8);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}

}
