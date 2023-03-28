package pratica7;
import java.util.Random;

public class Circunferencia extends Figura {

	private double R;
	public Circunferencia() {
	super();
	 R = 0;
	}
	
	public Circunferencia(int x, int y, double r) {
	super(x, y);
	R = r;
	
	}
	
	
	@Override
	public double GetArea() {
		
		return Math.PI * Math.pow(R, 2);
	}

	@Override
	public double GetPerimetro() {
	
		return 2 * Math.PI * R;
	}
	
	
	double CalculaPI(int L) {
        int numDentroCirculo = 0;
        Random rand = new Random();

        for (int i = 0; i <  L; i++) {
            // Gera um ponto aleatório dentro do quadrado unitário
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            // Verifica se o ponto está dentro do círculo unitário
            if (x*x + y*y <= 1) {
                numDentroCirculo++;
            }
        }

        // Estima o valor de pi
        double pi = 4.0 * numDentroCirculo /  L;
        return pi;
    }
	
	public double GetAreaMonteCarlo(int L) {
		double pi = CalculaPI(L);
		
		return pi * Math.pow(R,2);
	}
	
	public double GetPerimetroMonteCarlo(int L) {
		double pi = CalculaPI(L);
		return 2 * pi * R;
	}
	
}


