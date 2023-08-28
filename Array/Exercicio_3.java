package Array;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//Feito por: Felipe Rafael Rothbarth
//Data: 17/08/2023

/*
	Uma turma do curso de programação da escola X é formada por 30 alunos. Faça um
	programa que leia as notas de cada aluno em uma avaliação e armazene-as em um
	vetor. O programa deve calcular e imprimir a média da turma e a quantidade de alunos
	que ficaram acima da média.

 */

public class Exercicio_3 {

	public static void main(String[] args) {
		
		double [] notas = new double [30];
		double media_notas = 0.0;
		int cont_abaixo_media = 0;
		
		DecimalFormat df = new DecimalFormat("0.00");

		
		for(int i = 0; i < 30; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do " + (i+1) + "º aluno : "));
			
			while(notas[i] < 0 || notas[i] > 10) {
				notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Você informou uma nota abaixo de 0 ou maior que 10 ; Informe a nota do " + (i+1) + "º aluno : "));

			}			
			
			media_notas += notas[i];
			
			if(notas[i] > 6) {
				cont_abaixo_media ++;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "A média da turma é : " + df.format(media_notas / 30) + "\n A quantidade de alunos acima da média é de : " + cont_abaixo_media );
		
 	}

}
