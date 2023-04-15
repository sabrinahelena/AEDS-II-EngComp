public class Dados {
    private int Array [];
    private int N ;
    private int NumComparacoes = 0;
    private int NumMovimentacoes = 0;

    public Dados () {
        Array = new int [10];
        N = Array . length ;
    }

    public Dados ( int[] array ) {
         Array = array;
         N = Array.length;
    }

    public void ImprimirArray () {
         for(int i =0; i < N ; i ++)
             System . out . println (" Posicao "+ i + ": " + Array [ i ]) ;
        System.out.println("Quantidade de movimentacoes: " + NumMovimentacoes + " Quantidade de comparacoes: " + NumComparacoes);
    }

    public void InsertionSort(){
        for(int i = 1; i<N; i++){
            int tmp = Array[i];
            int j = i - 1; //sempre uma posicao a menos
            NumComparacoes++;
            while((j >= 0) && (Array[j] > tmp)){
                NumMovimentacoes++;
                Array[j+1] = Array[j];
                j--;
            }
            Array[j + 1] = tmp;
        }
    }

    public void SelectionSort(){
        for(int i = 0; i<(N - 1); i++){
            int menor = i;
            for(int j = (i + 1); j<N; j++){
                NumComparacoes++;
                if(Array[menor] > Array[j]){
                    menor = j;
                }
            }
            int temp = Array[menor];
            Array[menor] = Array[i];
            Array[i] = temp;
            NumMovimentacoes++;
        }
    }

}
