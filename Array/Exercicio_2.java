package Array;

import javax.swing.JOptionPane;

//Feito por: Felipe Rafael Rothbarth
//Data: 17/08/2023

/*
  	Um professor deseja ter uma aplicação que calcule a média PONDERADA de seus
	cinco alunos durante o bimestre. O bimestre é composto por duas notas, portanto, é
	necessário criar dois vetores para armazenar cada uma das notas dos alunos. Em
	seguida, outro vetor deve ser criado para armazenar o resultado da média dos alunos.

 */

public class Exercicio_2 {

	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		double [] primeira_nota = new double[5];
		double [] segunda_nota = new double[5];
		double [] media_ponderada = new double[5];
		String mostrar_media = "";
		int peso_1 = 0;
		int peso_2 = 0;
		
		
		peso_1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da 1ª nota: "));
		peso_2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da 2ª nota: "));		
		
		for(int i = 0; i < 5; i++) {
			
			nomes[i] = JOptionPane.showInputDialog("Informe o nome do " + (i+1)  + "º aluno: ");
		}
		
		//informar a 1ª nota
		for(int i = 0; i < 5; i++) {
			
			primeira_nota[i] = Double.parseDouble(JOptionPane.showInputDialog("O peso da 1ª nota é " + peso_1 + " ; !!  Informe a 1 ª nota do aluno chamado " + nomes[i] ));
			
			while(primeira_nota[i] < 0 || primeira_nota[i] > 10) {
				primeira_nota[i] = Double.parseDouble(JOptionPane.showInputDialog("O peso da 1ª nota é " + peso_1 + " ; !! Você digiou uma nota abaixo de 0 ou acima de 10 !!! Por favor Informe a 1 ª nota do aluno chamado " + nomes[i] ));
			}
		}
		
		//informar a 2ª nota
		for(int i = 0; i < 5; i++) {
			
			segunda_nota[i] = Double.parseDouble(JOptionPane.showInputDialog("O peso da 1ª nota é " + peso_2 + " ; !! Informe a 2 ª nota do aluno chamado " + nomes[i] ));
			
			while(segunda_nota[i] < 0 || segunda_nota[i] > 10) {
				segunda_nota[i] = Double.parseDouble(JOptionPane.showInputDialog("O peso da 1ª nota é " + peso_2 +  " ; !! Você digiou uma nota abaixo de 0 ou acima de 10 !!! Por favor Informe a 1 ª nota do aluno chamado " + nomes[i] ));
			}
		}
		
		//media ponderada
		
		for(int i = 0; i < 5; i++) {
			
			media_ponderada[i] = (primeira_nota[i] * peso_1 + segunda_nota[i] * peso_2) / (peso_1 + peso_2);
			
			mostrar_media += ("O aluno chamado : " + nomes[i] + " | A média ponderada dele é: " + media_ponderada[i] + " \n ");
		}
		
		JOptionPane.showMessageDialog(null, mostrar_media);
				
		
	}

}
