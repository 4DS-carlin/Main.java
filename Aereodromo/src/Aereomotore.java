public class Aereomotore extends Aereomobile {
    private double potenzaCV;

    public Aereomotore(String sigla, double potenzaCV) {
        this.sigla=sigla;
        this.potenzaCV = potenzaCV;
    }

    public double getPotenzaCV() {
        return potenzaCV;
    }


    public boolean isSuperior(Aereomobile x) {
        if (x==null || !(x instanceof Aereomotore)) {
            Aereomotore other = (Aereomotore) x;
            return this.potenzaCV > other.potenzaCV;
        }
        return false;
    }
    @Override
    public boolean equals(Object oggetto) {
        Boolean verifica = false;

        if (oggetto instanceof Aereomotore) {
            Aereomotore a = (Aereomotore) oggetto;

            if (getSigla().equals(a.getSigla()) && getPotenzaCV()==a.getPotenzaCV()){

                verifica = true;
            }
        }

        return verifica;
    }
    @Override
    public String toString() {
        return "Aereomotore{" +
                "sigla='" + sigla + '\'' +
                ", potenzaCV=" + potenzaCV +
                '}';
    }

}
