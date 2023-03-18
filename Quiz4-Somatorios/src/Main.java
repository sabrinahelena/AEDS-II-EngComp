public class Main {
    public static double somatorioPA(double A, double B, int n){
        double soma = 0;

        for(double i = 0; i<=n; i++){
            soma += (A + (B * i));
        }
        return soma;

    }
    /*
    Faça um método int somatorioPA(double a, double b, int n) que retorna o somatório dos n primeiros termos de uma PA com termo inicial a e razão b.
     */
    public static void main(String[] args)
    {
        somatorioPA(1, 3,3);
        System.out.println("O somatorio e': " + somatorioPA(1,3,3));
    }
}