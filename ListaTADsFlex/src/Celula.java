public class Celula {
    private int elemento;
    private Celula proxima;
    private Celula Anterior;

    public Celula(int x){
        this.elemento = x;
    }
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getAnterior() {
        return Anterior;
    }

    public void setAnterior(Celula anterior) {
        Anterior = anterior;
    }
}
