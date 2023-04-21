public class Lista {
    private int[] lista;
    private int ultimaPosicao = 0;

    public Lista(){
        lista = new int[10];
        ultimaPosicao = 0;
    }

    public Lista(int tamanho){
        lista = new int[tamanho];
        ultimaPosicao = 0;
    }

    public int[]  GetLista(){
        return lista;
    }

    public void inserirInicio(int x){
        if(ultimaPosicao >= lista.length)
            System.out.println("A lista está cheia. Não é possível inserir");
        for(int i = ultimaPosicao; i>0; i--){
            lista[i] = lista[i - 1];
        }
        lista[0] = x;
        ultimaPosicao++;
    }

    public void inserirFim(int x){
        if(ultimaPosicao >= lista.length)
            System.out.println("A lista está cheia. Não é possível inserir");
        lista[ultimaPosicao] = x;
        ultimaPosicao++;
    }

    public void inserirPosicao(int x, int pos){
        if(ultimaPosicao >= lista.length || pos < 0 || pos > ultimaPosicao)
            System.out.println("Nao é possível inserir numa posição inválida ou com a lista cheia");
        for(int i = ultimaPosicao; i>pos; i--){
            lista[i] = lista[i - 1];
        }
        lista[pos] = x;
        ultimaPosicao++;
    }


    public int removerInicio(){
        if(ultimaPosicao == 0)
            System.out.println("A lista está vazia, não é possível remover");
        int resp = lista[0];
        ultimaPosicao--;
        for(int i = 0; i<ultimaPosicao; i++){
            lista[i] = lista[i + 1];
        }
        return  resp;
    }

    public int removerFim(){
        if(ultimaPosicao == 0)
            System.out.println("A lista está vazia, não é possível remover");
        ultimaPosicao--;
        int resp = lista[ultimaPosicao];
        return resp;
    }

    public int removerPosicao(int pos){
        if(ultimaPosicao == 0 || pos <0 || pos >= ultimaPosicao)
            System.out.println("A lista está vazia, não é possível remover, ou a posicao passada e invalida");
        int resp = lista[pos];
        ultimaPosicao--;
        for(int i = pos; i < ultimaPosicao; i++){
            lista[i] = lista[i+1];
        }
        return resp;
    }

    //Questão 1
    public void insercaoMeotodo(int n1, int n2, int[] lista){
        lista[ultimaPosicao] = n1;
        ultimaPosicao++;
        lista[ultimaPosicao] = n2;
        ultimaPosicao++;
    }

    //Questão 2

    public void retornaListaResultanteExclusao(int pos, int[] lista){
     if(ultimaPosicao >= lista.length || pos < 0 || pos>=ultimaPosicao)
         System.out.println("Não é possível excluir");

     int resp = lista[pos];
     ultimaPosicao--;
     /*
     Esse for abaixo é necessário para preencher o espaço que foi excluído com os elementos a direita,
     então ele traz todos os elementos a direita daquele que foi removido para a esquerda.
      */
     for(int i = pos; i<ultimaPosicao; i++){
         lista[i] = lista[i + 1];
     }
        System.out.println("O elemento excluido estava na posicao " + pos + " e era o elemento " + resp);
        System.out.println("Exibição lista: ");
     exibirLista();

    }

    public void exibirLista(){
        for(int i =0; i<ultimaPosicao; i++){
            System.out.println("Posicao: " + i + " Elemento: " + lista[i]);
        }
    }

    //Questão 3
    public void exibirListaInversa(int[] numInteiros){
        int n = numInteiros.length;
        int quantMovimentacoes = 0;
        /*
        Como eu tenho que inverter meu algoritmo, o que está na ultima posicao tem que ir para a primeira,
        o que está na penúltima ir para a segunda, e por aí vai. Logo, o mais simples é dividir a lista
        ao meio e trocar uma metade pela outra elemento por elemento.
        Esse algoritmo realizará n/2 movimentações, porque o for irá rodar a quantidade de vezes que for
        a lista dividido ao meio. Se a lista for tamanho 10, irá rodar 5 vezes, para trocar um lado
        pelo outro.
         */
        for (int i = 0; i < n / 2; i++) {

            int temp = numInteiros[i];
            numInteiros[i] = numInteiros[n - 1 - i];
            numInteiros[n - 1 - i] = temp;
            quantMovimentacoes++;
        }
        System.out.println("Quantidade movimentacoes: " + quantMovimentacoes);
        exibirLista();
    }
}
