package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import visualizacao.EntradaSaida;

public class Fabrica {

	private ArrayList<Acai> listaDeAcai = new ArrayList<Acai>();
	private ArrayList<String> listaDeAcaiVendido = new ArrayList<String>();


	public ArrayList<String> getListaDeAcaiVendido() {
		return listaDeAcaiVendido;
	}

	public void setListaDeAcaiVendido(ArrayList<String> listaDeAcaiVendido) {
		this.listaDeAcaiVendido = listaDeAcaiVendido;
	}

	public ArrayList<Acai> getListaDeAcai() {
		return listaDeAcai;
	}

	public void setListaDeAcai(ArrayList<Acai> listaDeAcai) {
		this.listaDeAcai = listaDeAcai;
	}

	public void fabricarAcai() {

		Acai acai = new Acai();
		String acompanhamentos = "";

		acai.setNomeCliente(EntradaSaida.nomeCliente());
		acai.setTamanhoAcai(EntradaSaida.solicitaOpcaoTamanho());
		acai.setQtdeAcompanhamento(EntradaSaida.solicitaQtdeAcompanhamento());

		for (int i = 0; i <= acai.getQtdeAcompanhamento(); i++) {

			acompanhamentos += JOptionPane.showInputDialog("Informe o " + (i + 1) + "º Acompanhamento: ");

			if (i == acai.getQtdeAcompanhamento()) {
				acompanhamentos += ". ";
			} else {
				acompanhamentos += ", ";

			}

		}
		acai.setAcompanhamentos(acompanhamentos);
		listaDeAcai.add(acai);

	}

	public String listarAcaiFabricado() {

		String listaAcaiFabricado = "";

		for (int i = 0; i < listaDeAcai.size(); i++) {

			listaAcaiFabricado += "\n ###################################################################################\n"
					+ "\n Nome cliente: " + listaDeAcai.get(i).getNomeCliente() + "\n Tamanho Açai: "
					+ listaDeAcai.get(i).getTamanhoAcai() + "\n Quantidade de Acompanhamento : "
					+ (listaDeAcai.get(i).getQtdeAcompanhamento() + 1) + "\n Acompanhamentos: "
					+ listaDeAcai.get(i).getAcompanhamentos()
					+ "\n ###################################################################################\n";

		}

		return listaAcaiFabricado;

	}


	public void venderAcai() {

		String nomeVenda = EntradaSaida.nomeCliente();
		String listaVendas = "";
		int contador = 0;

		for (int i = 0; i < listaDeAcai.size(); i++) {

			//Acai acai = listaDeAcai.get(i);
			
			
			if (listaDeAcai.get(i).getNomeCliente().equalsIgnoreCase(nomeVenda)) {
				System.out.println("vendido");
				contador++;
				
				listaVendas += "\n ####################################################### "
						+ "\n Nome do Cliente: " + listaDeAcai.get(i).getNomeCliente()
						+ "\n Tamanho do Açai : " + listaDeAcai.get(i).getTamanhoAcai() 
						+ "\n Quantidade de Acompanhamentos : " + (listaDeAcai.get(i).getQtdeAcompanhamento() + 1)
						+ "\n Acompanhamentos : " + listaDeAcai.get(i).getAcompanhamentos()
						+ "\n ####################################################### ";
				
				listaDeAcaiVendido.add(listaVendas);
				
				listaDeAcai.remove(i);
			} 
			
			
		}
		
		if(contador == 0) {
			JOptionPane.showMessageDialog(null, " Não encontramos nenhum cliente com esse nome. ");
			System.out.println("não vendido");

		}
	//	EntradaSaida.exibeListaVendasAtual(listaVendas);
		
		

	}
	
	
	

}
