
public class Principal {

	public static void main(String[] args) {
		
		
		Carro carro1 = new Carro();
		
		String modelo = EntradaSaida.solicitarModelo();
		String cor = EntradaSaida.solicitarCor();
		
		carro1.setModelo(modelo);
		carro1.setCor(cor);
		
		EntradaSaida.mostrarConsulta(carro1.getModelo(), carro1.getCor());
		
		
	}
	
	

}
