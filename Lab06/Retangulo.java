package Atividade;

public class Retangulo extends Figura {

	protected double base;
	protected double altura;
	
	public Retangulo() {
		super();
		altura = 0;
		base = 0;
	}
	
	public Retangulo(int x, int y, double b, double a) {
		super(x, y);
		altura = a;
		base = b;
	}
	@Override
	public double GetArea() {
		// TODO Auto-generated method stub
		return (base * altura);
	}

	@Override
	public double GetPerimetro() {
		return (altura * 2) + (base * 2);
	}
	
	public double GetDiagonal() {
		return Math.sqrt((Math.pow(altura, 2)+(Math.pow(base, 2))));
	}
	
	public String toString() {
		return "Retangulo("+ x0 + ": "+ y0 + ":" + base + ":" + altura+")";
	}

}
