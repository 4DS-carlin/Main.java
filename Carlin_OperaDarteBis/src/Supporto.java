public class Supporto {
    private float altezza;
    private float larghezza;
    private float prfondita;

    public Supporto(float altezza, float larghezza, float proondita){
        this.altezza=altezza;
        this.larghezza=larghezza;
        this.prfondita=proondita;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getLarghezza() {
        return larghezza;
    }

    public float getProondita() {
        return prfondita;
    }
    public double printIngombro(){
        return altezza*larghezza*prfondita;
    }
    public String toString(){
        return "\nSUPPORTO: altezza: "+altezza+" larghezza: "+larghezza+" profondità: "+prfondita;
    }
}
