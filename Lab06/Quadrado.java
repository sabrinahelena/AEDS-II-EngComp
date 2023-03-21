package Atividade;

public class Quadrado extends Retangulo{
	public Quadrado() {
		super();
	}
	
	public Quadrado(int x, int y, int b, int a) {
		super(x,y,b,a);
	}
	
	public String toString() {
		return "Quadrado("+ x0 + ": "+ y0 + ":" + base + ":" + altura+")";
	}
}
