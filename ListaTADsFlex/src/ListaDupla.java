public class ListaDupla {
    private ListaDupla primeiro, ultimo;
    private int chave;
    private String nome;
    private ListaDupla topo;

    public ListaDupla getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(ListaDupla primeiro) {
        this.primeiro = primeiro;
    }

    public ListaDupla getUltimo() {
        return ultimo;
    }

    public void setUltimo(ListaDupla ultimo) {
        this.ultimo = ultimo;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaDupla getTopo() {
        return topo;
    }

    public void setTopo(ListaDupla topo) {
        this.topo = topo;
    }

    public ListaDupla(int k, String s) {
        primeiro = null;
        ultimo = null;
        this.chave = k;
        this.nome = s;
        this.topo = null;
    }

    //(a) Buscar um nome dado o valor da chave;
    public ListaDupla Buscar(int chave) {
        ListaDupla atual = topo;
        while (atual != null) {
            if (atual.getChave() == chave) {
                return atual;
            }
            atual = atual.getUltimo();
        }
        return null;
    }

    //(b) Inserir um novo elemento na lista mantendo a ordem;
    public void Inserir(int chave, String nome) {
        ListaDupla novaLista = new ListaDupla(chave, nome);

        if (topo == null) {
            setTopo(novaLista);
        } else {
            ListaDupla atual = topo;
            while (atual != null && atual.getChave() < chave) {
                atual = atual.getUltimo();
            }
            if (atual == topo) {
                novaLista.setUltimo(topo);
                topo.setPrimeiro(novaLista);
                topo = novaLista;

            } else if (atual == null) {
                ListaDupla anterior = topo;
                while (anterior.getUltimo() != null) {
                    anterior = anterior.getUltimo();
                }

                anterior.setUltimo(novaLista);
                novaLista.setPrimeiro(anterior);
            } else {
                ListaDupla anterior = atual.getPrimeiro();
                anterior.setUltimo(novaLista);
                novaLista.setPrimeiro(anterior);
                novaLista.setUltimo(atual);
                atual.setPrimeiro(novaLista);

            }

        }
    }

    //(c) Remover um elemento da lista;
    public void Remover(int chave) {
        ListaDupla listaRemover = Buscar(chave);
        if (listaRemover != null) {
            ListaDupla ant = listaRemover.getPrimeiro();
            ListaDupla prox = listaRemover.getUltimo();
            if (ant != null) {
                ant.setUltimo(prox);
            } else {
                setTopo(prox);
            }
            if (prox != null) {
                prox.setPrimeiro(ant);
            }
        }
    }

    //(d) Imprimir os valores da lista;

    public void Imprimir() {
        ListaDupla atual = topo;
        while (atual != null) {
            System.out.println("Chave: " + atual.getChave() + ", Nome: " + atual.getNome());
            atual = atual.getUltimo();
        }
    }

    //(e) Concatenar uma lista l1 com uma lista l2;
    public void Concatenar(ListaDupla lista) {
        ListaDupla atual = lista.getTopo();
        while (atual != null) {
            Inserir(atual.getChave(), atual.getNome());
            atual = atual.getUltimo();
        }
    }

    //(f) Intercalar l1 e l2;
    public void Intercalar(ListaDupla lista) {
        ListaDupla atual1 = topo;
        ListaDupla atual2 = lista.getTopo();

        while (atual1 != null && atual2 != null) {
            ListaDupla proximo1 = atual1.getUltimo();
            ListaDupla proximo2 = atual2.getUltimo();

            atual1.setUltimo(atual2);
            atual2.setPrimeiro(atual1);
            atual2.setUltimo(proximo1);
            if (proximo1 != null) {
                proximo1.setPrimeiro(atual2);
            }

            atual1 = proximo1;
            atual2 = proximo2;
        }

        if (atual2 != null) {
            ListaDupla anterior = topo;
            while (anterior.getUltimo() != null) {
                anterior = anterior.getUltimo();
            }
            anterior.setUltimo(atual2);
            atual2.setPrimeiro(anterior);
        }
    }

}

