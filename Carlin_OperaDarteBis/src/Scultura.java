public class Scultura extends OperaDarte{
    private float altezza;
    private float larghezza;
    private float profondita;
    private Supporto s;

    public Scultura(String titolo, String artista, float altezza, float larghezza, float profondita, Supporto s){
        super(titolo, artista);
        this.altezza=altezza;
        this.profondita=profondita;
        this.larghezza=larghezza;
        this.s=s;
    }
    public float getAltezza() {
        return altezza;
    }
    public float getLarghezza() {
        return larghezza;
    }
    public float getProfondita() {
        return profondita;
    }
    public double printIngombro() {
        return (altezza*larghezza*profondita)+(s.printIngombro());
    }
    public String toString(){
        return super.toString()+" ALTEZZA: "+altezza+" LARGHEZZA: "+ larghezza+" PROFONDITA: "+profondita;
    }
}