package Atividade;

public class Triangulo extends Figura{
	private double altura;
	private double base;
	private int ladoA, ladoB, ladoC;
	
	
	public Triangulo() {
		super();
		altura = 0;
		base = 0;
		ladoA = 0;
		ladoB = 0;
		ladoC = 0;
	}
	
	public Triangulo(int x, int y, double a, double b, int lA, int lB, int lC) {
		super(x, y);
		altura = a;
		base = b;
		ladoA = lA;
		ladoB = lB;
		ladoC=  lC;
	}
	@Override
	public double GetArea() {
		return (base * altura)/2;
	}

	@Override
	public double GetPerimetro() {
		return (ladoA+ladoB+ladoC);
	}
	
	public String toString() {
		return "Triangulo("+ x0 + ": "+ y0 + ":" + base + ":" + altura+")";
	}
}
