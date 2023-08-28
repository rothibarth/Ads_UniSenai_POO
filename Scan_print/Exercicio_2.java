package Scan_print;

	//Feito por : Felipe Rothbarth
	//data: 27/06/2023
	/*
	  	Prepare um código que solicita ao usuário dois números inteiros e exibe a soma, a
		subtração, a multiplicação e a divisão desses números.
	 */
import javax.swing.JOptionPane;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		int numero1 = 0 ;
		int numero2 = 0;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º numero: "));
		
		JOptionPane.showMessageDialog(null, numero1 + " + " + numero2 + " = " + (numero1 + numero2), "a soma entre",  JOptionPane.INFORMATION_MESSAGE);  
		JOptionPane.showMessageDialog(null, numero1 + " - " + numero2 + " = " + (numero1 - numero2), "a subtração entre",  JOptionPane.INFORMATION_MESSAGE);  
		JOptionPane.showMessageDialog(null, numero1 + " * " + numero2 + " = " + (numero1 * numero2), "a multiplicação entre",  JOptionPane.INFORMATION_MESSAGE);  
		JOptionPane.showMessageDialog(null, numero1 + " / " + numero2 + " = " + (numero1 / numero2), "a divisão entre",  JOptionPane.INFORMATION_MESSAGE);  

	}

}
