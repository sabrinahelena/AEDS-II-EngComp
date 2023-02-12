import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Digite as palavras ou textos para a contagem de maiusculas. (digite FIM para encerrar):");
        String str = scanner.nextLine();
        while (!str.equals("FIM")) { //enquanto a string digitada pela pessoa for diferente da palavra FIM
            strings.add(str); //Adiciona na arraylist a palavra/texto digitado
            str = scanner.nextLine();
        }//agora, se for FIM, nao vai adicionar o que a pessoa digitou na lista

        contarLetrasMaiusculas(strings); // chama o método para a lista
    }
    //I = Palavra - J = Letra
    public static void contarLetrasMaiusculas(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) { //acesso cada string dentro da lista
            int contador = 0;
            for (int j = 0; j < strings.get(i).length(); j++) { //aqui, acesso cada letra, pegando o  tamanho de cada string passada para percorrer
                char c = strings.get(i).charAt(j); //atribuo cada letra da string I na posicao J
                if (Character.isUpperCase(c)) {//verifico se é maiuscula
                    contador++;
                }
            }
            System.out.println("A string " + (i + 1) + " tem " + contador + " letras maiúsculas.");
        }
    }
}
