package Exercicio_final_java;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 12/09/2023

/*
 * Exercicio Final Java   
 * 
 	DOAÇÃO DE SANGUE E ÓRGÃOS
	Você deverá controlar doações de sangue e órgãos. Para isso, você deve:
	1. Deixar pré-cadastrados os tipos de doação de 3 tipos de doação;
	2. Realizar o cadastro de 3 doações por tipo, tendo como dados:
	a. Nome;
	b. Informações sobre a doação (ex.: tipo sanguíneo, avisar familiares);
	c. Tempo máximo de espera para transplante.
	3. Criar as seguintes listas para visualização:
	a. Todos as formas de doação;
	b. Formas de doação por tipo;
	c. Formas de doação por informações;
	d. Formas de doação por tempo máximo de espera


 */

public class Exercicio_final {

	public static void main(String[] args) {

		int cont = 0;
		String doacao_cronica = "";
		int finalizar = 0;
		int lista = 0;
		String nome = "";
		int idade = 0;
		String tipo_sanguineo = "";
		String responsavel_doacao = "";
		int tipo_doacao = 0;
		int terminar = 0;

		do {
			cont++;

			nome = JOptionPane.showInputDialog("Informe seu nome: ");

			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			
				while(idade < 0) {
					
					idade = Integer.parseInt(JOptionPane.showInputDialog("Sua idade não pode ser negativa !!! Informe sua idade novamente: "));

				}

			tipo_sanguineo = JOptionPane
					.showInputDialog("Informe seu tipo sanguineo : " + "\n  - A" + "\n  - B" + "\n  - O" + "\n  - AB");
			
			while(!tipo_sanguineo.equalsIgnoreCase("A") && !tipo_sanguineo.equalsIgnoreCase("B") && !tipo_sanguineo.equalsIgnoreCase("O") && !tipo_sanguineo.equalsIgnoreCase("AB")) {
				
				tipo_sanguineo = JOptionPane
						.showInputDialog("Você informou um tipo sanguineo incorreto !!! Informe seu tipo sanguineo : " + "\n  - A" + "\n  - B" + "\n  - O" + "\n  - AB");
			}

			responsavel_doacao = JOptionPane
					.showInputDialog("Informe quem será o seu responsavel caso necessite de ajuda: ");

			doacao_cronica = JOptionPane.showInputDialog("Informe caso você tenha doença cronica (s/n): ");

			JOptionPane.showMessageDialog(null,
					"PARABENS VOCÊ FINALIZOU O CADASTRO, AGORA VOCÊ PODERÁ ESCOLHER O TIPO DE DOAÇÃO DE SUA ESCOLHA CASO ESTEJA TUDO CERTO CONTIGO");

			tipo_doacao = Integer
					.parseInt(JOptionPane.showInputDialog("Escolha o tipo de doação: " + "\n 1 - DOAÇÃO DE RIM"
							+ "\n 2 - DOAÇÃO DE VESICULA" + "\n 3 - DOAÇÃO SANGUINEA" + "\n 4 - DOAÇÃO DE CORAÇÃO"
							+ "\n 5 - DOAÇÃO DE FIGADO" + "\n 6 - DOAÇÃO DE PANCREAS" + "\n 7 - DOAÇÃO DE PULMÃO"));

			switch (tipo_doacao) {

			case 1: // doação de rim

				if (doacao_cronica.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null,
							"Você tem doença cronica, então não podera realizar a doação de rim");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Você não tem doença cronica, então podera realizar a doação de rim"
									+ "\n O tempo maximo de espera é de 2 anos ");

				}

				break;

			case 2: // doação de vesicula

				if (doacao_cronica.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null,
							"Você tem doença cronica, então não podera realizar a doação de vesicula");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Você não tem doença cronica, então podera realizar a doação de vesicula"
									+ "\n O tempo maximo  de espera é de 10 meses ");

				}

				break;

			case 3: // doação de SANGUINEA

				if (doacao_cronica.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null,
							"Você tem doença cronica, então não podera realizar a doação de SANGUINEA");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Você não tem doença cronica, então podera realizar a doação de SANGUINEA"
									+ "\n O tempo maximo de espera é de 30 dias ");

				}

				break;

			case 4: // doação de CORAÇÃO

				if (doacao_cronica.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null,
							"Você tem doença cronica, então não podera realizar a doação de CORAÇÃO");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Você não tem doença cronica, então podera realizar a doação de CORAÇÃO"
									+ "\n O tempo maximo  de espera é de 50 a 90 dias ");

				}

				break;

			case 5: // doação de FIGADO

				if (doacao_cronica.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null,
							"Você tem doença cronica, então não podera realizar a doação de FIGADO");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Você não tem doença cronica, então podera realizar a doação de FIGADO"
									+ "\n O tempo maximo  de espera é de 4 meses ");

				}

				break;

			case 6: // doação de PANCREAS

				if (doacao_cronica.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null,
							"Você tem doença cronica, então não podera realizar a doação de PANCREAS");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Você não tem doença cronica, então podera realizar a doação de PANCREAS"
									+ "\n O tempo maximo  de espera é de 3 meses ");

				}

				break;

			case 7: // doação de PULMÃO

				if (doacao_cronica.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null,
							"Você tem doença cronica, então não podera realizar a doação de PULMÃO");
					break;
				} else {
					JOptionPane.showMessageDialog(null,
							"Você não tem doença cronica, então podera realizar a doação de PULMÃO"
									+ "\n O tempo maximo  de espera é de 6 meses ");

				}

				break;

			default:
				JOptionPane.showMessageDialog(null, "Você Informou um numero incorreto!!! ");
				break;

			}

			finalizar = Integer
					.parseInt(JOptionPane.showInputDialog("Você deseja finalizar? digite 1 para SIM e 2 para NÃO"));

		} while (finalizar == 2);

	
		do {
			
			lista = Integer.parseInt(JOptionPane.showInputDialog("Abaixo teremos uma lista pela qual você poderá explorar:"
					+ "\n 1 - Informações de quem irá doar" + "\n 2 - Quantidade de doações feitas ao todo"
					+ "\n 3 - Formas de doação por nível de urgência" + "\n 4 - Formas de doação por tipo"
					+ "\n 5 - Todas as formas de doação" + "\n 6 - Formas de doação por informações"
					+ "\n 7 - Tempo Máximo de espera"));

			switch (lista) {
			case 1:
				JOptionPane.showMessageDialog(null,
						"Certo você optou por ver todas as informações de quem irá doar" + "\n Nome : " + nome
								+ "\nIdade : " + idade + "\nTipo sanguineo : " + tipo_sanguineo + "\nresponsavel doacao :"
								+ responsavel_doacao + "\ndoacao cronica : " + doacao_cronica,
						null, JOptionPane.INFORMATION_MESSAGE);
				break;

			case 2:
				JOptionPane.showMessageDialog(null,
						"Certo você optou por ver a Quantidade de doações feitas ao todo que são exatamente: " + cont, null,
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case 3:

				JOptionPane.showMessageDialog(null,
						"Os niveis de gravidade são : " + "\n - URGENTE !!" + "\n - GRAVE !!" + "\n - BAIXA GRAVIDADE !!");

				break;

			case 4:

				JOptionPane.showMessageDialog(null, "As formas de doação por tipo são : " + "\n - POR TIPO SANGUINEO !!"
						+ "\n - POR PARENTESCO !!" + "\n - POR ORGÃO SAUDAVEL !!");

				break;

			case 5:

				JOptionPane.showMessageDialog(null,
						"Todas as formas de doação são : " + "\n Doação sanguínea" + "\n Doação de rim "
								+ "\n Doação de vesícula" + "\n Doação de coração" + "\n Doação de figado"
								+ "\n doação de pancreas" + "\n doação de pulmão");

				break;
				
			case 6:

				JOptionPane.showMessageDialog(null, "As formas de doação por informações são:"
						+ "\n 1 - AVISAR FAMILIARES "
						+ "\n 2 - DOENÇAS CRONICAS"
						+ "\n 3 - SE JÁ REALIZOU ALGUMA OUTRA CIRURGIA ARRISCADA");

				break;
				
			case 7:

				JOptionPane.showMessageDialog(null, " Tempo Máximo de espera é :"
						+ "\n 1 - Doação sanguínea - 100 dias "
						+ "\n 2 - doação de rim -  2 anos "
						+ "\n 3 - doação de vesícula - 10 meses"
						+ "\n 4 - doação de coração - 30 a 90 dias"
						+ "\n 5 - doação de fígado - 4 meses"
						+ "\n 6 - doação de pâncreas - 3 meses"
						+ "\n 7 - doação de pulmão - 6 meses");
						
				break;
				
			}
			
			terminar = Integer
					.parseInt(JOptionPane.showInputDialog("Você deseja finalizar? digite 1 para SIM e 2 para NÃO"));
			
		}while(terminar == 2);
		
		

	}

}
