package Model;
import javax.swing.JOptionPane;

public class CarroPelicula extends CarroBase{
	
		public String tipo_carro() {

			String pele = JOptionPane.showInputDialog("qual tipo de pelicula tem no seu carro Ex:(nano, normal ....) : ");

			return ("O tipo de pelicula que tem no seu carro é : " +  pele) ;
		} 
	
}
