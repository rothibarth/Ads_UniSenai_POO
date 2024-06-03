package modelo;

public abstract class Operacoes implements IOperacao {

	protected double num1;
	protected double num2;

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
}
