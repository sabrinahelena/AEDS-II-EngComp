public class ConjuntoInteiros {
    private boolean[] elementos;

    public ConjuntoInteiros() {
        this.elementos = new boolean[100]; // Supomos um conjunto de inteiros de 0 a 99
    }

    public void inserir(int elemento) {
        if (elemento >= 0 && elemento < 100) {
            elementos[elemento] = true;
        } else {
            System.out.println("O elemento está fora do intervalo permitido.");
        }
    }

    public void remover(int elemento) {
        if (elemento >= 0 && elemento < 100) {
            elementos[elemento] = false;
        } else {
            System.out.println("O elemento está fora do intervalo permitido.");
        }
    }

    public boolean pertence(int elemento) {
        if (elemento >= 0 && elemento < 100) {
            return elementos[elemento];
        } else {
            System.out.println("O elemento está fora do intervalo permitido.");
            return false;
        }
    }

    public ConjuntoInteiros uniao(ConjuntoInteiros outroConjunto) {
        ConjuntoInteiros resultado = new ConjuntoInteiros();

        for (int i = 0; i < 100; i++) {
            if (this.elementos[i] || outroConjunto.pertence(i)) {
                resultado.inserir(i);
            }
        }

        return resultado;
    }

    public ConjuntoInteiros intersecao(ConjuntoInteiros outroConjunto) {
        ConjuntoInteiros resultado = new ConjuntoInteiros();

        for (int i = 0; i < 100; i++) {
            if (this.elementos[i] && outroConjunto.pertence(i)) {
                resultado.inserir(i);
            }
        }

        return resultado;
    }

    public ConjuntoInteiros diferenca(ConjuntoInteiros outroConjunto) {
        ConjuntoInteiros resultado = new ConjuntoInteiros();

        for (int i = 0; i < 100; i++) {
            if (this.elementos[i] && !outroConjunto.pertence(i)) {
                resultado.inserir(i);
            }
        }

        return resultado;
    }

    public ConjuntoInteiros soma() {
        ConjuntoInteiros resultado = new ConjuntoInteiros();

        int soma = 0;
        for (int i = 0; i < 100; i++) {
            if (this.elementos[i]) {
                soma += i;
            }
        }

        resultado.inserir(soma);

        return resultado;
    }
}
