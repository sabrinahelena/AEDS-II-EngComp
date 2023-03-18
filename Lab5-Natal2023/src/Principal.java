public class Principal {
    private int n;
    private Duende Array[];

    public Principal(Duende array[]) {
        n = array.length;
        Array = array;
    }

    public void Ordenar() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Array[i].GetIdade() > Array[j].GetIdade()) {
                    Duende tempDuende = Array[i];
                    Array[i] = Array[j];
                    Array[j] = tempDuende;
                }
            }
        }
    }

    public void ImprimirArray() {
        for(int i = 0; i<n; i++) {
            System.out.println("Posicao: " + i + ": " + Array[i].GetNome() + " " + Array[i].GetIdade());
        }
    }

    public static void main(String[] args) {
        Duende D1, D2, D3, D4 , D5, D6;
        D1 = new Duende("Sabrina", 51);
        D2 = new Duende("Maria", 20);
        D3 = new Duende("Helena", 12);
        D4 = new Duende("Geralda", 30);
        D5 = new Duende("Roberto", 5);
        D6 = new Duende("Vivian", 70);
        Duende[] D = {D1, D2, D3, D4, D5, D6};

        Principal p;
        p = new Principal(D);
        p.Ordenar();
        p.ImprimirArray();

        Time time = new Time();
        time.CostruirTime(D);




    }

}
