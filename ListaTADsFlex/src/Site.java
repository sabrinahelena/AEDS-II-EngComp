public class Site {
    private String link;
    private String nomeSite;
    private Site proximo;
    public Site(String nomeSite, String link){
        this.nomeSite = nomeSite;
        this.link = link;
    }
    public String getLink() {
        return link;
    }
    public Site getProximo() {
        return proximo;
    }

    public void setProximo(Site proximo) {
        this.proximo = proximo;
    }
}
