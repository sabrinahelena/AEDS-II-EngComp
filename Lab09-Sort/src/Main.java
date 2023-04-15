public class Main {
    public static void main(String[] args) {
        int[] ArrayUm = new int[100];
        int[] ArrayDois = new int[100];
        int j = 0;

        System.out.println("Inserction Sort");
        System.out.println("Melhor caso");
        //Melhor caso
        for(int i = 1; i<100; i++){
            ArrayUm[i] = i;
        }
        Dados d1 = new Dados(ArrayUm);
        d1.InsertionSort();
        d1.ImprimirArray();

        System.out.println("Pior caso");
        //Pior caso
        for(int i = 99; i>0; i--){
            ArrayDois[j] = i;
            j++;
        }
        Dados d2 = new Dados(ArrayDois);
        d2.InsertionSort();
        d2.ImprimirArray();

        System.out.println("Selection Sort");
        System.out.println("Melhor caso");
        Dados d3 = new Dados(ArrayUm);
        d3.SelectionSort();
        d3.ImprimirArray();

        System.out.println("Pior caso");
        Dados d4 = new Dados(ArrayDois);
        d4.SelectionSort();
        d4.ImprimirArray();


        /*
        Com a prática, percebe-se que no SelectionSort é feito as movimentações e comparações igualmente no melhor e pior caso,
        com o vetor já ordenado ou não. Já no InserctionSort no melhor caso só fazem as comparações, mas não movimentações.
        O inserctionsort verifica todos os elementos do atual com o seu anterior, e vai passando pelo vetor trocando as posições. O SelectionSort
        procura pelo menor, inicialmente sendo a primeira posição, e aí ao achar coloca na primeira posição.
         */
    }
}