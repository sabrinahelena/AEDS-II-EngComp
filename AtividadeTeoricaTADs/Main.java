// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//
//        System.out.println("QUESTÃO 1");
//        //Questão 1
//        Lista l1 = new Lista(5);
//        l1.inserirInicio(2);
//        l1.inserirInicio(1);
//        l1.inserirFim(3);
//
//        l1.insercaoMeotodo(4, 5, l1.GetLista());
//        l1.exibirLista();
//
//        System.out.println("----------------------------------------");
//        System.out.println("QUESTÃO 2");
//        //Questão 2
//        Lista l2 = new Lista(5);
//        l2.inserirInicio(1);
//        l2.inserirFim(2);
//        l2.inserirPosicao(3, 2);
//        l2.retornaListaResultanteExclusao(1, l2.GetLista());
//        l2.inserirInicio(1);
//        l2.retornaListaResultanteExclusao(2, l2.GetLista());
//        System.out.println("----------------------------------------");
//        System.out.println("QUESTÃO 3");
//        //Questão 3
//        Lista l3 = new Lista(4);
//        l3.inserirInicio(1);
//        l3.inserirFim(2);
//        l3.inserirFim(3);
//        l3.inserirFim(4);
//        l3.exibirListaInversa(l3.GetLista());
//
//        //Questão 4
//        System.out.println("----------------------------------------");
//        System.out.println("QUESTÃO 4");
//        PilhaDupla p1 = new PilhaDupla(4);
//        p1.empilharPilhaUm(1);
//        p1.empilharPilhaDois(3);
//        p1.empilharPilhaDois(4);
//        p1.MostrarPilha();
//        p1.MostrarPosicaoPilhas();
//        p1.desempilharPilhaDois();
//        p1.MostrarPilha();
//
//        //Questão 5
//        System.out.println("----------------------------------------");
//        System.out.println("QUESTÃO 5");
//        PilhaPosNeg p2 = new PilhaPosNeg(4);
//        p2.InsercaoPilha(-2);
//        p2.InsercaoPilha(2);
//        p2.InsercaoPilha(-1);
//        p2.InsercaoPilha(1);
//        p2.ExibirPilha();
//

        //Exercício 6
//        System.out.println("----------------------------------------");
//        System.out.println("QUESTÃO 6");
//        Fila filaParImpar = new Fila(4);
//        int[] fila = new int[]{1, 2, 3, 4};
//        int[] filaPar = new int[4];
//        int[] filaImpar = new int[4];
//        filaParImpar.SepararFilas(fila, filaPar, filaImpar);
//        filaParImpar.ExibirFilas();

        //Exercício 7

        /*
        Como você implementaria uma pilha de filas? Escreva rotinas para implementar as
        operações corretas para essa estrutura de dados.

        R: Para a implementação de uma pilha de filas, eu deveria ter implementado previamente uma classe de Fila.
        Nessa minha classe, teria todas as implementações normais para fila, de inserção e remoção seguindo a lógica de
        quem chegou primeiro é o primeiro a ser removido, inserindo no fim e removendo no inicio.
        Após isso, na minha classe de Pilha, eu declararia um array do tipo Fila (a classe mesmo) e faria todos os métodos
        de inserção e remoção para o array de Fila. Então eu iria inserir no fim do array a fila, e removeria no fim,
        Para exibir, eu faria um método na minha Fila de getfila, percorrendo a fila e imprimindo a partir da posicao no
        primeiro, e aí na classe de Pilha eu teria um método que exibiria fila por fila inserida no meu array de filas.
        */

        //Exercício 8

        /*
        Como você implementaria uma fila de pilhas? Escreva rotinas para implementar as
        operações corretas para essa estrutura de dados.
        R: Seria a mesma coisa do exercício 7. Eu implementaria previamente uma classe Pilha com todos os métodos,
        incluindo um método de get pilha para percorrer as pilhas e imprimir cada uma. Após isso, faria a classe de fila,
        declarando um array do tipo Pilha, com a classe que implementei.
        Após isso, implementaria todos os métodos de fila, inserindo no fim e removendo no inicio mas no casso passando uma pilha
        como parâmetro. Para exibir, eu faria um método para percorrer minha fila da primeira até a última posição e chamaria
        o método de get da pilha para cada pilha na minha fala.
         */

        //Exercício 9 - Implementado na calsse fila.


        //Exercício 10
        System.out.println("----------------------------------------");
        System.out.println("EXERCICIO 10");

        Empilhadeira empilhadeira = new Empilhadeira(6);
        empilhadeira.adicionarCaixa(3);
        empilhadeira.adicionarCaixa(5);
        empilhadeira.adicionarCaixa(7);
        empilhadeira.adicionarCaixa(5);
        empilhadeira.adicionarCaixa(3);
        empilhadeira.imprimirPilhas();
    }
}
