public class Fila {

    private String[] arrayStrings;
    private int P; //posicao do primeiro elemento da fila
    private int U; //posicao do ultimo elemento da fila

    public Fila(){
        arrayStrings = new String[6]; //tam maximo = 5 + 1 de sentinela
        P = 0;
        U = 0;
    }
    public Fila(int tamanhoMaximo) {
        arrayStrings = new String[tamanhoMaximo + 1]; //acrescenta uma posição sentinela
        P = 0;
        U = 0;
    }

    public void inserir(String s) {
        if (((U + 1) % arrayStrings.length) == P) {
            System.out.println("Não é possível inserir, a fila está cheia.");
            return;
        }

        arrayStrings[U] = s;
        U = (U + 1) % arrayStrings.length;
    }

    public String remover() {
        if (P == U) {
            System.out.println("Não há elementos para remover, a fila está vazia.");
            return null;
        }

        String elementoRemovido = arrayStrings[P];
        P = (P + 1) % arrayStrings.length;
        return elementoRemovido;
    }

    public void mostrar() {
        if (P == U) {
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("Elementos na fila:");
        int i = P;
        while (i != U) {
            System.out.println("Posição = " + i + " " + arrayStrings[i]);
            i = (i + 1) % arrayStrings.length;
        }
    }
}
