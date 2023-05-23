public class Sites {
    private Site siteInicial;

    public Sites(){
        this.siteInicial = null;
    }

    public void Inserir(String n, String l ){
        Site siteInserir = new Site(n, l);
        siteInserir.setProximo(this.siteInicial);
        this.siteInicial = siteInserir;
    }

    public String buscar(String n){
        Site atual = this.siteInicial;
        Site anterior = null;
        while(atual != null){
            anterior = atual;
            atual = atual.getProximo();
        }

        if(anterior == null){
            return atual.getLink();
        }
        else{
            anterior.setProximo(atual.getProximo());
            atual.setProximo(this.siteInicial);
            this.siteInicial = atual;
            return atual.getLink();
        }
    }
}
