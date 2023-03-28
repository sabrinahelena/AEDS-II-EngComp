package pratica7;

public class Principal {
	
	public static void main(String[] args) {
	Circunferencia C1 = new Circunferencia(0,0, 5);
	
	 System.out.println("Area: " + C1.GetArea());
	 System.out.println("Perimetro: " + C1.GetPerimetro());
	 System.out.println("Area monte carlo para 50: " + C1.GetAreaMonteCarlo(50));
	 System.out.println("Perimetro monte carlo para 50: " + C1.GetPerimetroMonteCarlo(50)); 
	 System.out.println("Area monte carlo para 500: " + C1.GetAreaMonteCarlo(500));
	 System.out.println("Perimetro monte carlo para 500: " + C1.GetPerimetroMonteCarlo(500)); 
	 System.out.println("Area monte carlo para 1000: " + C1.GetAreaMonteCarlo(1000));
	 System.out.println("Perimetro monte carlo para 1000: " + C1.GetPerimetroMonteCarlo(1000)); 
	 System.out.println("Area monte carlo para 10000: " + C1.GetAreaMonteCarlo(10000));
	 System.out.println("Perimetro monte carlo para 10000: " + C1.GetPerimetroMonteCarlo(10000)); 

	}
}
