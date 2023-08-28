package do_do_while;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 08/08/2023

/*
  	Criar um programa que solicita ao usuário dois números e, em seguida, pergunta qual
	é o resultado da multiplicação desses dois números. Enquanto o usuário não acertar
	a resposta, o programa deve informar que ele está errado e pedir para tentar
	novamente. Quando o usuário acertar, o programa deve informar que o número está
	correto e mostrar quantas vezes o usuário tentou até acertar
 */

public class Exercicio_1 {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º numero : "));
		
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º numero : "));
		int cont = 0;
		
		int resultado_escolhido = Integer.parseInt(JOptionPane.showInputDialog("Informe qual o resultado da Multiplicação entre " + numero1 + " * " + numero2 + " : "));
		
		while(resultado_escolhido != ((numero1 * numero2))) {
			resultado_escolhido = Integer.parseInt(JOptionPane.showInputDialog("Tente Novamente !!! \n Informe qual o resultado da soma entre " + numero1 + " * " + numero2 + " : "));
			cont++;
		}
		
		JOptionPane.showMessageDialog(null, cont + 1,"Parabens você acertou !!!! \n tentou ", JOptionPane.INFORMATION_MESSAGE);

	
		
		
	
		

		
		
	}

}
