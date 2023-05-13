public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []V= {7,3,4,6,3,2,7,8,1};
        Matriz  M = new Matriz ();
        M.PreencherMatriz(V);
        M.Imprimir();

        System.out.println("------------");
        int []V2 = {1,5,6,2,1,5,6,7,3,1,12,3,5,6,1,2};
        Matriz M2 = new Matriz(4,4);
        M2.PreencherMatriz(V2);
        M2.Imprimir();


        System.out.println("------------");

        int []MA = {1,2,3,4};
        int []MB = {5,6,7,8};
        Matriz A = new Matriz(2,2);
        A.PreencherMatriz(MA);
        Matriz B = new Matriz(2,2);
        B.PreencherMatriz(MB);

        Matriz SomaAB = A.Soma(B);
        SomaAB.Imprimir();
        int diagonalPrincipal = A.DiagonalPrincipal();
        int diagonalSecundaria = A.DiagonalSecundaria();
        System.out.println("------------");

        System.out.println("Diagonal principal: " + diagonalPrincipal);
        System.out.printf("Diagonal secundária: " + diagonalSecundaria);
        System.out.println(" ");

        System.out.println("------------");

        Matriz MultiAB = A.Multiplicação(B);
        MultiAB.Imprimir();


    }
}