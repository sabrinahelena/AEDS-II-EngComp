public class Pilha {
    public int[] Pilha;
    int QuantMaxima;
    int PosicaoTopo = 0; //topo da pilha

    public Pilha() {
        QuantMaxima = 6;
        Pilha = new int[6];

    }
    public Pilha(int tam) {
        QuantMaxima = tam;
        Pilha = new int[QuantMaxima];

    }

    public int GetElementoTopo(){
        return Pilha[PosicaoTopo-1];
    }

    public int GetPosicaoTopo(){
        return PosicaoTopo;
    }
    public int tamanho() {
        return PosicaoTopo + 1;
    }

    public void Empilhar(int s) {
        if(PosicaoTopo >= Pilha.length) {
            System.out.println("Nao e possivel inserir");
        }
        Pilha[PosicaoTopo++] = s;
    }

    public int Desempilhar() {
        if(QuantMaxima <= 0) {
            System.out.println("Nao e possivel remover");
        }

        int n = Pilha[--PosicaoTopo];
        Pilha[PosicaoTopo] = 0;

        return n;
    }

    public boolean vazia() {
        return PosicaoTopo == 0;
    }
    public void Motrar() {
        for (int i = 0; i < PosicaoTopo; i++) {
            System.out.println("Posição = " + i + " Elemento: " + Pilha[i]);
        }
    }
}
