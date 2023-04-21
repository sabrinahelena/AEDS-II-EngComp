public class PilhaPosNeg {
    private int[] Pilha;
    private int ultimaPosicaoPositivo;
    private int ultimaPosicaoNegativo;

    public PilhaPosNeg(){
        Pilha = new int[4];
        ultimaPosicaoPositivo = Pilha.length -1;
        ultimaPosicaoNegativo = 0;
    }
    public PilhaPosNeg(int tam){
        Pilha = new int[tam];
        ultimaPosicaoPositivo = tam -1;
        ultimaPosicaoNegativo = 0;
    }

    public void InsercaoPilha(int n){
        if(ultimaPosicaoPositivo >= Pilha.length || ultimaPosicaoNegativo <= 0 || ultimaPosicaoPositivo == ultimaPosicaoNegativo)
            System.out.println("Não é possível fazer inserção. ");
        if(n < 0) { //é negativo
            Pilha[ultimaPosicaoNegativo] = n;
            ultimaPosicaoNegativo++;
        }
        else {
            Pilha[ultimaPosicaoPositivo] = n;
            ultimaPosicaoPositivo--;
        }
    }

    public void ExibirPilha(){
        for(int i = 0; i<Pilha.length; i++){
            System.out.println("Posicao: " + i + " Elemento: " + Pilha[i]);
        }
    }


}
