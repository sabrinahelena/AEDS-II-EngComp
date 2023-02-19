public class Main {
    public static void main(String[] args)
    {
         int array[];
         array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         int tamArray = array.length;

        int min = array[0]; //define-se inicialmente que o valor minimo é o primeiro do array
        int max = array[tamArray -1]; //o valor máximo é o último valor do array
        int chute; //o chute do código vai ser a média entre o valor maximo e minimo
        int valorProcurado = 4;
        int i = 0; //para contar quantas vezes vai procurar

        while(min < (max + 1)){
            i++;
            chute = (min + max)/2; //a media do valor max e minimo

            if(array[chute] == valorProcurado){
                System.out.println("Achei! e i = " + i);
                break;
            }
            else if(array[chute] < valorProcurado){ //se o valor naquela posicao é menor que o valor procurado
                min = chute + 1; //definimos o valor minimo pra proxima procura é aquele de onde começou + 1 para aumentar o valor minimo e o chute ser maior

            }
            else{
                max = chute + 1; //definimor o valor maximo pra proxima procura é aquele de onde começou + 1 para o chute ser menor
            }

        }

    }
}