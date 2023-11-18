public class Cornice {
    float altezza;
    float larghezza;
    float spessore;

    public Cornice(float altezza, float larghezza, float spessore){
        this.altezza=altezza;
        this.larghezza=larghezza;
        this.spessore=spessore;
    }
    public float getAltezza() {
        return altezza;
    }
    public float getLarghezza() {
        return larghezza;
    }
    public float getSpessore() {
        return spessore;
    }
    public double printIngombro(){
        return larghezza*altezza*spessore;
    }
    public String toString(){
        return "\nCORNICE: altezza: "+altezza+" larghezza: "+larghezza+" spessore: "+spessore;
    }
}
