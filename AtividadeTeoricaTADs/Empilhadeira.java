public class Empilhadeira {
    private Pilha pilhaA;
    private Pilha pilhaB;
    private Pilha pilhaC;

    public Empilhadeira(int tam) {
        pilhaA = new Pilha(tam);
        pilhaB = new Pilha(tam);
        pilhaC = new Pilha(tam);
    }

    public void adicionarCaixa(int peso) {
        //Se a pilhaA está vazia, ou o peso é menor que o que está na última posição, podemos empilhar direto nela.
        if (pilhaA.vazia() || peso <= pilhaA.GetElementoTopo()) {
            pilhaA.Empilhar(peso);
            //Agora, se a pilha não está vazia ou o elemento na última posição for menor que o peso (peso maior)
        } else if (peso > pilhaA.GetElementoTopo()) {//sendo o peso maior,
            while (!pilhaA.vazia() && peso > pilhaA.GetElementoTopo()) {//enquanto esse peso for maior que o último peso da minha caixa
                if (pilhaA.GetElementoTopo() == 5) {//se for 5 vai pra pilha B e remove da A
                    pilhaB.Empilhar(pilhaA.Desempilhar());
                } else if(pilhaA.GetElementoTopo() == 3){//se for 3 vai pra pilhaC e remove da A
                    pilhaC.Empilhar(pilhaA.Desempilhar());
                }
            }
            pilhaA.Empilhar(peso);//Agora, tendo removido todos pesos menores, podemos empilhar aquele que era maior.
            while (!pilhaB.vazia()) {
                pilhaA.Empilhar(pilhaB.Desempilhar());//Retira os da B que são os de 5, e volta pra A
            }
            while (!pilhaC.vazia()) {
                pilhaA.Empilhar(pilhaC.Desempilhar());//Retira os da C que são os de 3, e volta pra A.
            }

            //Assim, fica os de maior peso, médio e pequeno por último.
        }
    }

    public void imprimirPilhas() {
        pilhaA.Motrar();
    }
}
