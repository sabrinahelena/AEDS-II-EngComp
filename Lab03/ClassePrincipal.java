package pratica3;

public class ClassePrincipal {

	public static void main(String[] args) {
		double[] V = {1,2,4,6,2,3};
		 Dados D1 = new Dados(V);
		 System.out.println("O vetor sem ordenacao e': ");
		 D1.ImprimirArray();
		 System.out.println("O vetor ordenado e': ");
		 D1.Ordenar();
		 D1.ImprimirArray();
		 System.out.println("A quantidade de comparacoes feitas foi: "+ D1.contador);
		 System.out.println("De acordo com o metodo com a expressao do exercicio 2, a quantidade de comparacoes que serao feitas e': : " + D1.QuantidadeComparacoes());
		 System.out.println("A media e': " + D1.CalcularMedia());
		 System.out.println("A mediana e': " + D1.CalcularMediana());
	}

}
