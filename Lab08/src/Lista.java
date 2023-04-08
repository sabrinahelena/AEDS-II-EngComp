public class Lista {
    private String[] array; //array de strings
    private int quantMaxima; //quantidade máxima que pode ficar no array
    private int inicioLista = 0;

    public Lista() {
        quantMaxima = 5;
        array = new String[quantMaxima]; //define o array de tamanhoMax = 5, indo de  0 a 5
    }

    public Lista(int tamMaximo) {
        quantMaxima = tamMaximo;
        array = new String[tamMaximo];
    }

    public void inserirInicio(String s) {
        if (inicioLista >= array.length) { //se o inicio da lista for igual ao tamanho (5) ou maior, significa que a lista já está cheia
            System.out.println("Não é possível inserir"); //então não é possível inserir
            return;
        }

        /*
         * como insere no início, tem que mover quem está  no início para a posição seguinte, e assim por diante,
         * então i = inicioLista, que pode ser 1 por exemplo se só tiver sido inserido 1 string até o momento, enquanto for > 0, entra no for
         * e subtrai 1 no i  para indicar que já foi movido aquela string. Após isso, seta na posição i (1 nesse exemplo) o que estava na posição 0, para
         * adicionar a nova string (liberar a primeira posição). Se tivessem mais elementos, o for passaria mais vezes, nesse exemplo.
         */
        for (int i = inicioLista; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = s; //Com a primeira posição liberada, pode setar a string passada.
        inicioLista++; //Soma 1 para o inicio da lista, agora nossa lista se inicia em 2.
    }

    public void inserirFim(String s) {
        if (inicioLista >= array.length) {//Se o início da lista for maior ou igual ao tamanho do array, não é possível inserir
            System.out.println("Não é possível inserir");
            return;
        }

        array[inicioLista] = s; //se não, basta inserir na posição inicioLista diretamente, que já indica o fim do array.
        inicioLista++;
    }

    public void inserirPosicao(String s, int pos) {
        if (inicioLista >= array.length || pos < 0 || pos > inicioLista) {//Verifica se o inicioLista é maior ou igual que o tam do array e verifica a posicao passada.
            System.out.println("Não é possível inserir");
            return;
        }

        /*
        Aqui nesse caso, se a pos é menor que o i, ou seja, você quer inserir sua string em uma posicao menor do que a última disponível, devemos mover
        as strings que estão na posicao que voce pediu para frente para liberar a posição pedida.
         */
        for (int i = inicioLista; i > pos; i--) {
            array[i] = array[i - 1];
        }

        array[pos] = s; //Estando livre, pode setar.
        inicioLista++;
    }

    public String removerInicio() {
        if (inicioLista == 0) {
            System.out.println("Não é possível remover");
            return null;
        }

        String resp = array[0];
        inicioLista--;

        for (int i = 0; i < inicioLista; i++) {
            array[i] = array[i + 1]; //for para movimentar o array para trás, visto que removeu a primeira posição
        }

        return resp;
    }

    public String removerFim() {
        if (inicioLista == 0) {
            System.out.println("Não é possível remover");
            return null;
        }

        return array[--inicioLista];
    }

    public String removerPosicao(int pos) {
        if (inicioLista == 0 || pos < 0 || pos >= inicioLista) {
            System.out.println("Não é possível remover");
            return null;
        }

        String resp = array[pos];
        inicioLista--;

        for (int i = pos; i < inicioLista; i++) {
            array[i] = array[i + 1]; //se a posicao for menor que o inicio da lista, tem que reorganizar o array trazendo pra trás visto que liberou aquela pos.
        }

        return resp;
    }

    public void mostrar() {
        for (int i = 0; i < inicioLista; i++) {
            System.out.println("Posição = " + i + " Elemento: " + array[i]);
        }
    }
}