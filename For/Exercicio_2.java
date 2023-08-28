package For;

//Feito por : Felipe Rothbarth
//data: 31/07/2023

/*
 *	 Construa um programa que solicita ao usuário uma frase. Ao final, indique quantas
	vogais, consoantes, espaços e outros caracteres compõem essa frase
 */


import javax.swing.JOptionPane;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog("Digite uma frase :  ");
		
		int cont_vogais = 0;
		int cont_frase_especial = 0;
		int cont_espaco = 0;
		int cont_consoante = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if( String.valueOf(frase.charAt(i)).equalsIgnoreCase("a") ||  String.valueOf(frase.charAt(i)).equalsIgnoreCase("e")||  String.valueOf(frase.charAt(i)).equalsIgnoreCase("i") || String.valueOf(frase.charAt(i)).equalsIgnoreCase("o") ||  String.valueOf(frase.charAt(i)).equalsIgnoreCase("u")) {
				 cont_vogais++ ;
			}else if (frase.charAt(i) == ' ') {
				cont_espaco++ ;
			}else if (!Character.isLetter(frase.charAt(i))){
				cont_frase_especial++ ;
			}else {
				cont_consoante ++;
			}			
			
			
		}
		
		JOptionPane.showMessageDialog(null, " Quantidade de vogais :  " + cont_vogais , null ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, " Quantidade de caracter especiais :  " + cont_frase_especial , null ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, " Quantidade de espaço :  " + cont_espaco , null ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, " Quantidade de consoante :  " + cont_consoante , null ,JOptionPane.INFORMATION_MESSAGE);
			
	}

}
