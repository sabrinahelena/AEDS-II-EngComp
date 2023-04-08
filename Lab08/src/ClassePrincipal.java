public class ClassePrincipal {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(4);
        pilha.Empilhar("oi");
        pilha.Empilhar("sabrina");
        pilha.Empilhar("linda");
        pilha.Empilhar("inteligente");

        System.out.println("MOSTRAR UM: ");

        pilha.MotrarUm();
        System.out.println("MOSTRAR DOIS: ");
        pilha.MostrarDois();

        pilha.Desempilhar();
        System.out.println("MOSTRAR UM: ");
        pilha.MotrarUm();
        System.out.println("MOSTRAR DOIS: ");
        pilha.MostrarDois();


        Lista lista = new Lista(6);


        lista.inserirInicio("sabrina");
        lista.inserirInicio("helena");
        lista.inserirInicio("inicio 3");
        System.out.println("MOSTRAR LISTA: ");
        lista.mostrar();
        lista.removerInicio();
        System.out.println("MOSTRAR LISTA APOS REMOVER INICIO: ");
        lista.mostrar();
        lista.inserirInicio("inicio 3");
        lista.removerFim();
        System.out.println("MOSTRAR LISTA APOS REMOVER FIM: ");
        lista.mostrar();
        lista.inserirInicio("inicio 4");
        lista.inserirInicio("inicio 5");
        lista.removerPosicao(3);
        System.out.println("MOSTRAR LISTA APOS REMOVER POS 3: ");
        lista.mostrar();


        Fila fila = new Fila(5);
        fila.inserir("oi");
        fila.inserir("tudo bem");
        fila.inserir("teste");
        System.out.println("MOSTRAR FILA APOS INSERIR ");
        fila.mostrar();
        fila.remover();
        System.out.println("MOSTRAR FILA APOS REMOVER ");
        fila.mostrar();
    }
}
