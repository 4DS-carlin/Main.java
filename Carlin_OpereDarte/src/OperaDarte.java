public abstract class OperaDarte {
    protected String titolo;
    protected String artista;

    public OperaDarte(String titolo, String artista){
        this.artista=artista;
        this.titolo=titolo;
    }

    public OperaDarte(OperaDarte o){
        titolo=o.titolo;
        artista=o.artista;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitolo() {
        return titolo;
    }

    public abstract double printIngombro();

    public boolean equals(OperaDarte o){
        if(o.getArtista().equals(artista) && o.getTitolo().equals(titolo)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "ARTISTA: "+artista+" TITOLO: "+titolo;
    }
}
