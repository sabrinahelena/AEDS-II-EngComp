public class Lista {
    private Celula primeiro, ultimo;
    public int tam = 0;

    public Lista(){
        primeiro = ultimo;
    }

    //(a) Verificar se um numero pertence lista;

    public boolean Pertence(int x){
        Celula i = primeiro;
        while(i != null){
            if (i.getElemento() == x ) return true;
            i = i.getProxima();
        }
        return false;
    }

    //(b) Inserir um novo elemento na lista mantendo a ordem;

    public void Inserir(int x){
        Celula celulaInserir = new Celula(x);
        if(primeiro == null ||  x <= primeiro.getElemento()){
            //Lista vazia, temos que inserir no início
            celulaInserir.setProxima(primeiro); //passou o que estava no primeiro para a proxima do que vamos inserir (para ele ser o primeiro)
            primeiro = celulaInserir;
        }
        else{
            Celula atual = primeiro;
            while (atual.getProxima() != null && atual.getProxima().getElemento() < x){
                atual = atual.getProxima();
            }
            celulaInserir.setProxima(atual.getProxima());
            atual.setProxima(celulaInserir);
        }
    }

    // (c) Remover um elemento da lista;
    public int remover(int pos){
        int elemento = 0;
        Celula i = primeiro;
        if(primeiro == ultimo){
            System.out.println("Impossível remover algo de uma lista vazia. ");
        }
        else if(pos == 0){
            elemento = primeiro.getElemento();
            primeiro = primeiro.getProxima();
        }
        else{
            for(int j = 0; j < pos; j++, i = i.getProxima()){
                Celula tmp = i.getProxima();
                elemento = tmp.getElemento();
                i.setProxima(tmp.getProxima());
                tmp.setProxima(null);
            }
        }
        return elemento;
    }

    //(d) Imprimir os valores da lista;
    public void Imprimir(){
        Celula i = primeiro;
        while(i != null){
            System.out.println("Elemento " + i.getElemento());
            i = i.getProxima();
        }
        System.out.println();
    }

    //(e) Copiar uma lista l1 para uma lista l2;
    public Lista CopiarLista(Lista lista1, Lista lista2){
        Celula atual = lista1.primeiro;
        while (atual != null){
            lista2.Inserir(atual.getElemento());
            atual = atual.getProxima();
        }
        return lista2;
    }

    //(f) Concatenar uma lista l1 com uma lista l2;
    public Lista ConcatenarL(Lista lista1, Lista lista2){
        if (lista1.primeiro == null){
            lista1.primeiro = lista2.primeiro;
        }
        else{
            Celula atual = lista1.primeiro;
            while(atual.getProxima() != null){
                atual = atual.getProxima();
            }
            atual.setProxima(lista2.primeiro);
        }
        lista1.tam += lista2.tam;
        return lista2;
    }

    //(g) Intercalar l1 e l2;
    public Lista Intercalar(Lista l1, Lista l2){
        Celula atualL1 = l1.primeiro;
        Celula atualL2 = l2.primeiro;
        Lista lista = new Lista();

        while(atualL1 != null ||  atualL2 != null){
            if(atualL1 != null){
                lista.Inserir(atualL1.getElemento());
                atualL1 = atualL1.getProxima();
            }
            else if(atualL2 != null){
                lista.Inserir(atualL2.getElemento());
                atualL2 = atualL2.getProxima();
            }
            else if (atualL1 == null || atualL2 == null){
                break;
            }
        }
        return lista;
    }


    //Questão 11:

    public void removerPares(){
        Celula i = this.primeiro;
        while(i.getProxima() != null){
            if(i.getProxima().getElemento()%2 == 0){
                i.setProxima(i.getProxima().getProxima());
                i = i.getProxima().getProxima();
            }
            else{
                i = i.getProxima();
            }
        }
    }

    }
