package Model;

public class Carro extends CarroBase {
	
		private int ano_carro;
		
		public int getAno_carro() {
			
			return this.ano_carro;
		}
		
		public void setAno_carro(int ano_carro) {
			
			this.ano_carro = ano_carro;
		}
		
		public String tipo_carro() {
			
			return "Carro padrão ou seja não é esportivo e nem tem pelicula"; 
		}
}
