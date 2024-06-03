
public class Subtracao {

	private double num1;

	private double num2;
	
	public double getNum1() {
		
		return this.num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return this.num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double calculaSubtracao() {
		double sub = num1 - num2;

		return sub;
	}
}
