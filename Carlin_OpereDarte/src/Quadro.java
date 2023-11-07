public class Quadro extends  OperaDarte{
    private float altezza;
    private float larghezza;

    public Quadro(String titolo, String artista, float altezza, float larghezza){
        super(titolo, artista);
        this.larghezza=larghezza;
        this.altezza=altezza;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getLarghezza() {
        return larghezza;
    }


    public double printIngombro() {
        return altezza*larghezza;
    }

    public String toString(){
        return super.toString()+" ALTEZZA: "+altezza+" LARGHEZZA: "+larghezza;
    }
}
