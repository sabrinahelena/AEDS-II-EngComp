public class ListaEncadeada {

    public static char[] processarLista(char[] listaEncadeada) {
        char[] letras = new char[listaEncadeada.length];
        char[] digitos = new char[listaEncadeada.length];
        int letrasIndex = 0;
        int digitosIndex = 0;

        for (char caractere : listaEncadeada) {
            if (Character.isLetter(caractere)) {
                letras[letrasIndex++] = caractere;
            } else if (Character.isDigit(caractere)) {
                digitos[digitosIndex++] = caractere;
            }
        }

        char[] resultado = new char[letrasIndex + digitosIndex];
        System.arraycopy(letras, 0, resultado, 0, letrasIndex);

        for (int i = digitosIndex - 1; i >= 0; i--) {
            resultado[letrasIndex++] = digitos[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        char[] listaEncadeada = {'A', '1', 'E', '5', 'T', '7', 'W', '8', 'G'};
        char[] resultado = processarLista(listaEncadeada);

        for (char caractere : resultado) {
            System.out.print(caractere + " ");
        }
    }
}