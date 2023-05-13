
public class Matriz {
    private Celula inicio;
    private Celula celulas[][];
    private int linha,coluna;

    public Matriz(){
        this(3,3 );
        CriarMatriz();
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



    public Matriz Soma(Matriz B) {
        if (this.linha != B.linha || this.coluna != B.coluna) {
            System.out.println("Não é possível somar as matrizes. As dimensões são diferentes.");
            return null;
        }
        Matriz C = new Matriz(this.linha, this.coluna);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                C.celulas[i][j].elemento = this.celulas[i][j].elemento + B.celulas[i][j].elemento;
            }
        }
        return C;
    }

    public int DiagonalPrincipal() {
        if (this.linha != this.coluna) {
            System.out.println("A matriz não possui diagonal principal.");
            return -1;
        }
        int soma = 0;
        for (int i = 0; i < linha; i++) {
            soma += this.celulas[i][i].elemento;
        }
        return soma;
    }

    public int DiagonalSecundaria() {
        if (this.linha != this.coluna) {
            System.out.println("A matriz não possui diagonal secundária.");
            return -1;
        }
        int soma = 0;
        for (int i = 0; i < linha; i++) {
            soma += this.celulas[i][coluna-1-i].elemento;
        }
        return soma;
    }

    public Matriz Multiplicação(Matriz B) {
        if (this.coluna != B.linha) {
            System.out.println("As matrizes não podem ser multiplicadas!");
        }
        Matriz C = new Matriz(this.linha, B.coluna);

        for (int i = 0; i < this.linha; i++) {
            for (int j = 0; j < B.coluna; j++) {
                int soma = 0;
                for (int k = 0; k < this.coluna; k++) {
                    soma += this.celulas[i][k].elemento * B.celulas[k][j].elemento;
                }
                C.celulas[i][j].elemento = soma;
            }
        }

        return C;
    }
}
