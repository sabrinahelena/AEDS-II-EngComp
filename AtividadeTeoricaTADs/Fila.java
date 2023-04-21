public class Fila {
    private int[] FilaPadrao;
    private int[] FilaPar;
    private int[] FilaImpar;
    private int ultimaPosicaoFila;
    private int primeiraPosicaoFila;
    private int ultimaPosicaoFilaPar;
    private int ultimaPosicaoFilarImpar;
    private int primeiraPosicaoFilaPar;
    private int primeiraPosicaoFilaImpar;

    public Fila() {
        FilaPadrao = new int[4];
        FilaPar = new int[4];
        FilaImpar = new int[4];
        ultimaPosicaoFila = 0;
        primeiraPosicaoFila = 0;
        ultimaPosicaoFilaPar = 0;
        primeiraPosicaoFilaPar = 0;
        primeiraPosicaoFilaImpar = 0;
        ultimaPosicaoFilarImpar = 0;
    }

    public Fila(int tam) {
        FilaPadrao = new int[tam];
        FilaPar = new int[tam];
        FilaImpar = new int[tam];
        ultimaPosicaoFila = 0;
        primeiraPosicaoFila = 0;
        ultimaPosicaoFilaPar = 0;
        primeiraPosicaoFilaPar = 0;
        primeiraPosicaoFilaImpar = 0;
        ultimaPosicaoFilarImpar = 0;
    }

    public int[] GetFila() {
        System.out.println("FILA PRINCIPAL");
        for (int i = primeiraPosicaoFila; i < ultimaPosicaoFila; i++)
            System.out.println("Posicao: " + i + " Elemento: " + FilaPadrao[i]);


        return FilaPadrao;
    }
    public void inserirFila(int n){
        if(n%2 == 0) {
            FilaPar[ultimaPosicaoFilaPar] = n;
            ultimaPosicaoFilaPar++;
        }
        else {
            FilaImpar[ultimaPosicaoFilarImpar] = n;
            ultimaPosicaoFilarImpar++;
        }
    }

    public int removerFilaPar(){
        if(ultimaPosicaoFilaPar == primeiraPosicaoFilaPar)
            System.out.println("Nao é possível remover uma lista vazia. ");
        int resp = FilaPar[primeiraPosicaoFilaPar];
        primeiraPosicaoFilaPar = (primeiraPosicaoFilaPar + 1)% FilaPar.length;
        return resp;
    }

    public int removerFilaImpar(){
        if(ultimaPosicaoFilarImpar == primeiraPosicaoFilaImpar)
            System.out.println("Não é possível remover uma fila vazia");
        int resp = FilaImpar[primeiraPosicaoFilaImpar];
        primeiraPosicaoFilaImpar = (primeiraPosicaoFilaImpar+1)% FilaImpar.length;
        return resp;
    }

    public int removerFila(){
        if(ultimaPosicaoFila == primeiraPosicaoFila)
            System.out.println("Não é possível remover uma fila vazia");
        int resp = FilaPadrao[primeiraPosicaoFila];
        primeiraPosicaoFila = (primeiraPosicaoFila+1)% FilaPadrao.length;
        return resp;
    }

    //Exercício 6
    public void SepararFilas(int[] fila, int[] filaPar, int[] filaImpar){
        while(primeiraPosicaoFila < fila.length){ //se a lista estiver vazia, não dá para separar
            int resp = fila[primeiraPosicaoFila]; //mesma coisa de remover
            if(resp % 2 ==0){
                filaPar[ultimaPosicaoFilaPar] = resp;
                ultimaPosicaoFilaPar++;
            }
            else{
                filaImpar[ultimaPosicaoFilarImpar] = resp;
                ultimaPosicaoFilarImpar++;
            }
            primeiraPosicaoFila++;
        }
        FilaPadrao = fila;
        FilaPar = filaPar;
        FilaImpar = filaImpar;
    }

    public void ExibirFilas(){
        System.out.println("FILA PRINCIPAL");
        for(int i = primeiraPosicaoFila; i<ultimaPosicaoFila; i++)
            System.out.println("Posicao: " + i + " Elemento: " + FilaPadrao[i]);
        System.out.println("FILA PAR");
        for(int i = primeiraPosicaoFilaPar; i<ultimaPosicaoFilaPar; i++)
            System.out.println("Posicao: " + i + " Elemento: " + FilaPar[i]);
        System.out.println("FILA IMPAR");
        for(int i = primeiraPosicaoFilaImpar; i<ultimaPosicaoFilarImpar; i++)
            System.out.println("Posicao: " + i + " Elemento: " + FilaImpar[i]);
    }

    //Exercício 9
    public void ordenarFilaComPilhas(int[] fila) {
        int n = fila.length;
        Pilha p1 = new Pilha(n);
        Pilha p2 = new Pilha(n);

        // Empilha os elementos na primeira pilha
        for (int i = 0; i < n; i++) {
            p1.Empilhar(fila[i]);
        }

        // Divide a primeira pilha em duas partes
        // e empilha cada parte na segunda pilha
        while (p1.tamanho() > 1) {
            int tamanho1 = p1.tamanho() / 2;
            int tamanho2 = p1.tamanho() - tamanho1;
            for (int i = 0; i < tamanho1; i++) {
                p2.Empilhar(p1.Desempilhar());
            }
            for (int i = 0; i < tamanho2; i++) {
                p2.Empilhar(p1.Desempilhar());
            }
        }
        if (p1.tamanho() == 1) {
            p2.Empilhar(p1.Desempilhar());
        }

        // Combina as duas pilhas em uma única pilha ordenada
        while (p2.tamanho() > 1) {
            int primeiraMetade = p2.tamanho() / 2;
            int segundaMetade = p2.tamanho() - primeiraMetade;
            for (int i = 0; i < primeiraMetade; i++) {
                p1.Empilhar(p2.Desempilhar());
            }
            for (int i = 0; i < segundaMetade; i++) {
                p1.Empilhar(p2.Desempilhar());
            }
            while (!p1.vazia() && !p2.vazia()) {
                if (p1.GetPosicaoTopo() < p2.GetPosicaoTopo()) {
                    p2.Empilhar(p1.Desempilhar());
                } else {
                    p2.Empilhar(p2.Desempilhar());
                }
            }
            while (!p1.vazia()) {
                p2.Empilhar(p1.Desempilhar());
            }
        }

        // Desempilha os elementos da pilha ordenada e coloca na fila
        for (int i = 0; i < n; i++) {
            fila[i] = p2.Desempilhar();
        }
    }

}
