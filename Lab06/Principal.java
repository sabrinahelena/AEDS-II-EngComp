package Atividade;

public class Principal {

	public static void main(String[] args) {
		
	    System.out.println("Retangulo: ");
		Retangulo r1 = new Retangulo(1,1,2,4);
	    System.out.println("Area: " + r1.GetArea());
	    System.out.println("Perimetro: " + r1.GetPerimetro());
	    System.out.println("Diagonal: " + r1.GetDiagonal());
	    System.out.println("To string: " + r1.toString());
	    
	    System.out.println("Triangulo: ");
	    Triangulo t1 = new Triangulo(1,1,2,4,1,1,1);
	    System.out.println("Area: " + t1.GetArea());
	    System.out.println("Perimetro: " + t1.GetPerimetro());
	    System.out.println("To string: " + t1.toString());
	    
	    System.out.println("Quadrado: ");
	    Quadrado q1 = new Quadrado(1,1,2,2);
	    System.out.println("Area: " + q1.GetArea());
	    System.out.println("Perimetro: " + q1.GetPerimetro());
	    System.out.println("Diagonal: " + q1.GetDiagonal());
	    System.out.println("To string: " + q1.toString());

	}

}
