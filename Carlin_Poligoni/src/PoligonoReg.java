public class PoligonoReg {
    private float lato;
    private int nLati;


    public PoligonoReg(float l, int nL)throws Exception{
        if(l>0) {
            lato = l;
            nLati = nL;
        }else {
            throw new Exception("Il lato non puo essere un numero negativo o pari a zero!!!");
        }
    }

    public float getLato() {
        return lato;
    }

    public void setLato(float lato) {
        this.lato = lato;
    }

    public int getnLati() {
        return nLati;
    }

    public float dueP(){
        return lato*nLati;
    }

    public String toString(){
        return "lunghezza lato: "+lato+" numero lati: "+nLati;
    }
}

