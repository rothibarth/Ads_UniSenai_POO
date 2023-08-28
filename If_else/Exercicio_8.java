package If_else;

//Feito por : Felipe Rothbarth
//data: 04/07/2023

/*
* 	Você foi contratado para desenvolver um simulador de sistema de recomendação de
	filmes. O sistema deve solicitar ao usuário informações sobre um filme, como nome,
	duração em minutos e classificação indicativa. Com base nessas informações, o
	sistema deve classificar o filme em uma categoria específica, levando em
	consideração a duração e a classificação indicativa. As categorias são:
	● Infantil: Filmes com duração menor que 60 minutos e classificação indicativa
	livre;
	● Adolescente: Filmes com duração entre 60 e 120 minutos e classificação
	indicativa de 10, 12 ou 14 anos;
	● Adulto: Filmes com duração maior que 120 minutos e classificação indicativa
	de 16 ou 18 anos;
	● Não recomendado: Filmes com duração maior que 60 minutos e classificação
	indicativa livre.
	Seu programa deve solicitar as informações do filme ao usuário, fazer as verificações
	necessárias e exibir a categoria do filme de acordo com as regras acima. Caso o filme
	não se enquadre em nenhuma categoria, o programa deve exibir uma mensagem
	adequada.

*/

import javax.swing.JOptionPane;

public class Exercicio_8 {

	public static void main(String[] args) {

		String nome_filme = JOptionPane.showInputDialog("Informe o nome do filme : ");

		double duracao_minutos = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a duração em minutos do filme :  "));

		while (duracao_minutos < 0) {
			duracao_minutos = Integer
					.parseInt(JOptionPane.showInputDialog("Informe uma duração em minutos positiva:   "));

		}

		int classificacao_indicativa = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a classificação indicativa para este filme:  "));

		while (classificacao_indicativa < 0) {
			classificacao_indicativa = Integer
					.parseInt(JOptionPane.showInputDialog("Informe uma classificação indicativa positiva:  "));

		}

		if (duracao_minutos < 60 && classificacao_indicativa < 0) {
			JOptionPane.showMessageDialog(null, " Categoria Infantil", null, JOptionPane.INFORMATION_MESSAGE);

		} else if (duracao_minutos >= 60 && duracao_minutos <= 120 && classificacao_indicativa >= 10) {
			JOptionPane.showMessageDialog(null, " Categoria Adolescente", null, JOptionPane.INFORMATION_MESSAGE);

		} else if (duracao_minutos > 120 && classificacao_indicativa >= 16) {
			JOptionPane.showMessageDialog(null, " Categoria Adulto", null, JOptionPane.INFORMATION_MESSAGE);

		} else if (duracao_minutos > 60 && classificacao_indicativa == 0) {
			JOptionPane.showMessageDialog(null, " Não recomendado ", null, JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, " NÃO SE ENQUADRA EM NENHUMA CATEGORIA ", null,
					JOptionPane.INFORMATION_MESSAGE);

		}

	}

}
