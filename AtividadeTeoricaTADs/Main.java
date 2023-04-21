// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("QUESTÃO 1");
        //Questão 1
        Lista l1 = new Lista(5);
        l1.inserirInicio(2);
        l1.inserirInicio(1);
        l1.inserirFim(3);

        l1.insercaoMeotodo(4, 5, l1.GetLista());
        l1.exibirLista();

        System.out.println("----------------------------------------");
        System.out.println("QUESTÃO 2");
        //Questão 2
        Lista l2 = new Lista(5);
        l2.inserirInicio(1);
        l2.inserirFim(2);
        l2.inserirPosicao(3, 2);
        l2.retornaListaResultanteExclusao(1, l2.GetLista());
        l2.inserirInicio(1);
        l2.retornaListaResultanteExclusao(2, l2.GetLista());
        System.out.println("----------------------------------------");
        System.out.println("QUESTÃO 3");
        //Questão 3
        Lista l3 = new Lista(4);
        l3.inserirInicio(1);
        l3.inserirFim(2);
        l3.inserirFim(3);
        l3.inserirFim(4);
        l3.exibirListaInversa(l3.GetLista());

        //Questão 4
        System.out.println("----------------------------------------");
        System.out.println("QUESTÃO 4");
        PilhaDupla p1 = new PilhaDupla(4);
        p1.empilharPilhaUm(1);
        p1.empilharPilhaDois(3);
        p1.empilharPilhaDois(4);
        p1.MostrarPilha();
        p1.MostrarPosicaoPilhas();
        p1.desempilharPilhaDois();
        p1.MostrarPilha();

        //Questão 5
        System.out.println("----------------------------------------");
        System.out.println("QUESTÃO 5");
        PilhaPosNeg p2 = new PilhaPosNeg(4);
        p2.InsercaoPilha(-2);
        p2.InsercaoPilha(2);
        p2.InsercaoPilha(-1);
        p2.InsercaoPilha(1);
        p2.ExibirPilha();

    }
}
