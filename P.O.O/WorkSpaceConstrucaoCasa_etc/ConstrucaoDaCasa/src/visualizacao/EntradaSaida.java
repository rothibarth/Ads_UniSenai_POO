package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class EntradaSaida {
	
	public static int solicitaOpcao() {
		
		String[] opcoes = {"Construir casa " , "Movimentar portas ou janelas", 
					"ver informações da casa" , "Sair do programa"};
		
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada" , JOptionPane.OK_CANCEL_OPTION);
		
		return menu.getSelectedIndex();
		
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!! ");
	}

}
