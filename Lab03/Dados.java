package pratica3;

public class Dados {

	private double Array[];
	private int N; 
	public int contador = 0;
	
	public Dados() {
		Array = new double[10];
		N = Array.length;
	}
	
	public Dados(double[] array) {
		Array = array;
		N = array.length;
	}
	
	public void ImprimirArray() {
		for(int i = 0; i<N; i++) {
			System.out.println("Posicao: " + i + ": " + Array[i]);
		}
	}
	
	public double CalcularMedia() {
		double sum = 0;
		for(int i = 0; i<N; i++) {
			sum += Array[i];
		}
		return sum/N;
	}
	
	public void Ordenar() {
		for (int i = 0; i < (N-1); i++) {
			for (int j =i + 1; j < N; j++) {
				contador++;
				if (Array[i] > Array[j]) {
					double temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
				}
			}
		}
	}
	

	public double CalcularMediana() {
		Ordenar();
		double median;
		int esquerda = 0, direita = 0;

		if(N % 2 != 0){
			median = Array[N/2];
		} else {
			esquerda = ( N/2) - 1;
			direita = esquerda + 1;
			median = (Array[esquerda] + Array[direita]) / 2;
		}
		return median;
	}
	
	public double QuantidadeComparacoes() {
		return (((N * N)/2) - (N/2));
		
	}

}
