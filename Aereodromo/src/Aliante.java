public class Aliante extends Aereomobile{
    private int efficienzaAereodinamica;

    public Aliante(String sigla, int efficienzaAereodinamica) {
        this.sigla=sigla;
        this.efficienzaAereodinamica = efficienzaAereodinamica;
    }

    public int getEfficienzaAereodinamica() {
        return efficienzaAereodinamica;
    }


    public boolean isSuperior(Aereomobile x) {
        if (x!=null && (x instanceof Aliante)) {
            Aliante other = (Aliante) x;
            return this.efficienzaAereodinamica > other.efficienzaAereodinamica;
        }
        return false;
    }

    @Override
    public boolean equals(Object oggetto) {
        Boolean verifica = false;

        if (oggetto instanceof Aliante) {
            Aliante a = (Aliante) oggetto;

            if (getSigla().equals(a.getSigla()) && getEfficienzaAereodinamica()==a.getEfficienzaAereodinamica()){

                verifica = true;
            }
        }

        return verifica;
    }

    @Override
    public String toString() {
        return "Aliante{" +
                "sigla='" + sigla + '\'' +
                ", efficienzaAereodinamica=" + efficienzaAereodinamica +
                '}';
    }
}
