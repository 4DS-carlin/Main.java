public class SculturaDeperibile extends Scultura{
    private String materiale;
    private int eta;
    private float deperibilita;


    public SculturaDeperibile(String titolo, String artista, float altezza, float larghezza, float profondita, String materiale, int eta, float deperibilita,Supporto s) {
        super(titolo, artista, altezza, larghezza, profondita, s);
        this.materiale=materiale;
        this.eta=eta;
        this.deperibilita=deperibilita;
    }

    @Override
    public double printIngombro() {
        float d=1-(deperibilita/365*eta);
        return super.printIngombro()*d;
    }

    public String toString(){
        return super.toString()+" materiale: "+materiale+" eta(in giorni): "+eta+" deperibilità: "+deperibilita;
    }
}
