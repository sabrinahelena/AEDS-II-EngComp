package parteA;

public class ClassePrincipal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(4);
		pilha.Empilhar("oi");
		pilha.Empilhar("sabrina");
		pilha.Empilhar("linda");
		pilha.Empilhar("inteligente");
		
		System.out.println("MOSTRAR UM: ");

		pilha.MotrarUm();
		System.out.println("MOSTRAR DOIS: ");
		pilha.MostrarDois();
		
		pilha.Desempilhar();
		System.out.println("MOSTRAR UM: ");
		pilha.MotrarUm();
		
		Lista lista = new Lista(6);
		
		lista.InserirInicio("sabrina");
		lista.InserirInicio("helena");
		lista.Mostrar();

		// TODO Auto-generated method stub

	}

}
