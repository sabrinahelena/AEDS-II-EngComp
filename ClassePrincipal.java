package Pratica02;

public class ClassePrincipal {

	public static void main(String[] args) {
		double[] V = {1,2,4,6,2,3};
		 Dados D1 = new Dados(V);
		 D1.ImprimirArray();
		 System.out.println("A media e': " + D1.CalcularMedia());
		 System.out.println("O vetor ordenado e': ");
		 D1.Ordenar();
		 D1.ImprimirArray();
		 System.out.println("A mediana e': " + D1.CalcularMediana());

	}

}
