public class PilhaDupla {
    /*
    Uma pilha funciona assim: o primeiro a entrar, é o último a ser removido. Então temos um método
    para inserir no fim, e um método para remover no fim.
     */
    private int[] pilhaDupla;
    private int ultimaPosicaoPilhaUm;
    private int ultimaPosicaoPilhaDois;

    public PilhaDupla(){
        pilhaDupla = new int[4];
        ultimaPosicaoPilhaUm = 0;
        ultimaPosicaoPilhaDois = pilhaDupla.length - 1;
    }
    public PilhaDupla(int tam){
        pilhaDupla = new int[tam];
        ultimaPosicaoPilhaUm = 0;
        ultimaPosicaoPilhaDois = tam - 1;
    }

    public void VerificaPilhaVazia(){
        if(ultimaPosicaoPilhaUm == 0)
            System.out.println("A pilha um está vazia.");
        else if(ultimaPosicaoPilhaDois == pilhaDupla.length - 1)
            System.out.println("A pilha dois está vazia. ");
    }

    public void empilharPilhaUm(int num){
        if(ultimaPosicaoPilhaUm >= pilhaDupla.length)
            System.out.println("Não é possível inserir, lista cheia! ");
        pilhaDupla[ultimaPosicaoPilhaUm] = num;
        ultimaPosicaoPilhaUm++;
    }

    public void empilharPilhaDois(int num){
        if(ultimaPosicaoPilhaDois <= 0)
            System.out.println("Não é possível inserir, lista cheia!");
        pilhaDupla[ultimaPosicaoPilhaDois] = num;
        ultimaPosicaoPilhaDois--;
    }

    public int desempilharPilhaUm(){
        if(pilhaDupla.length <= 0)
            System.out.println("Impossível remover uma pilha vazia.");
        ultimaPosicaoPilhaUm--;

        int resp = pilhaDupla[ultimaPosicaoPilhaUm];
        pilhaDupla[ultimaPosicaoPilhaUm] = 0;
        return resp;
    }

    public int desempilharPilhaDois(){
        if(pilhaDupla.length <= 0)
            System.out.println("Impossível remover uma pilha vazia.");
        ultimaPosicaoPilhaDois++;

        int resp = pilhaDupla[ultimaPosicaoPilhaDois];
        pilhaDupla[ultimaPosicaoPilhaDois] = 0;
        return resp;
    }

    public void MostrarPilha(){
    for(int i = 0; i<pilhaDupla.length; i++){
        System.out.println("Posicao: " + i + " Elemento: " + pilhaDupla[i]);
    }
    }

    public void MostrarPosicaoPilhas(){
        System.out.println("O último elemento da pilha 1 está na posicao " + (ultimaPosicaoPilhaUm-1) + " e é o elemento " + pilhaDupla[ultimaPosicaoPilhaUm-1]);
        System.out.println("O último elemento da pilha 2 está na posicao " + (ultimaPosicaoPilhaDois+1) + " e é o elemento " + pilhaDupla[ultimaPosicaoPilhaDois+1]);
    }
}
