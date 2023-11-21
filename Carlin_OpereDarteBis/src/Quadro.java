public class Quadro extends  OperaDarte{
    private float altezza;
    private float larghezza;
    private Cornice c;

    public Quadro(String titolo, String artista, float altezza, float larghezza, Cornice c) throws Exception{
        super(titolo, artista);
        this.larghezza = larghezza;
        this.altezza = altezza;
        if (c.getAltezza() >= altezza + c.getSpessore() * 2 && c.getLarghezza() >= larghezza + c.getSpessore() * 2){
            this.c = new Cornice(c.getAltezza(), c.getLarghezza(), c.getSpessore());
        }else{
            throw new Exception("La cornice e troppo piccola.");
        }
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
