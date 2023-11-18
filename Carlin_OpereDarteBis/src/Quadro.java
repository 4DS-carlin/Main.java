public class Quadro extends  OperaDarte{
    private float altezza;
    private float larghezza;
    private Cornice c;

    public Quadro(String titolo, String artista, float altezza, float larghezza, Cornice c){
        super(titolo, artista);
        this.larghezza=larghezza;
        this.altezza=altezza;
        this.c=c;
    }
    public float getAltezza() {
        return altezza;
    }
    public float getLarghezza() {
        return larghezza;
    }
    public double printIngombro() {
        return c.printIngombro();
    }
    public String toString(){
        return super.toString()+" ALTEZZA: "+altezza+" LARGHEZZA: "+larghezza;
    }
}
