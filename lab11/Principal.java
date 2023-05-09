package pratica12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []V= {7,3,4,6,3,2,7,8,1};
		Matriz  M = new Matriz ();
		M.PreencherMatriz(V);
		M.Imprimir();
		
		System.out.println("------------");
		int []V2 = {1,5,6,2,1,5,6,7,3,1,12,3,5,6,1,2};
		Matriz M2 = new Matriz(4,4);
		M2.PreencherMatriz(V2);
		M2.Imprimir();
	}

}
