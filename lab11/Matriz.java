package pratica12;

public class Matriz {
	private Celula inicio;
	private Celula celulas[][];
	private int linha,coluna;
	
	public Matriz(){
		this(3,3);
	}
	public Matriz (int l, int c) {
	    this.linha=l;
	    this.coluna=c;
	    this.celulas = new Celula[linha][coluna]; // inicializa o array celulas
	    CriarMatriz();
	}
	
	public void CriarMatriz() {
	    inicio= new Celula();
	    //iniciando uma matriz
	    for (int i = 0; i < linha; i++) {
	        for (int j = 0; j < coluna; j++) {
	            this.celulas[i][j] = new Celula();
	            if (i > 0) {
	                this.celulas[i][j].inf = this.celulas[i-1][j];
	                this.celulas[i-1][j].sup = this.celulas[i][j];
	            }
	            if (j > 0) {
	                this.celulas[i][j].esq = this.celulas[i][j-1];
	                this.celulas[i][j-1].dir = this.celulas[i][j];
	            }
	        }
	    }
	}
	
	public void PreencherMatriz(int[]V) {
		int contador = 0;
        for (int i = 0; i <linha; i++) {
            for (int j = 0; j <coluna; j++) {
                this.celulas[i][j].elemento = V[contador];
                contador++;
            }
        }
	}
	
	public void Imprimir() {
	    for (int i = 0; i <linha; i++) {
	        for (int j = 0; j <coluna; j++) {
	            System.out.print(this.celulas[i][j].elemento + " ");
	        }
	        System.out.println();
	    }
	}

}
