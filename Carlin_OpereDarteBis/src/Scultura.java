public class Scultura extends OperaDarte{
    private float altezza;
    private float larghezza;
    private float profondita;
    private Supporto s;

    public Scultura(String titolo, String artista, float altezza, float larghezza, float profondita, Supporto s)throws Exception{
        super(titolo, artista);
        this.altezza=altezza;
        this.profondita=profondita;
        this.larghezza=larghezza;
        if(s.getLarghezza()>=larghezza && s.getProondita()>=profondita) {
            this.s = new Supporto(s.getAltezza(), s.getLarghezza(), s.getProondita());
        }else{
            throw new Exception("Il supporto e troppo piccolo.");
        }
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