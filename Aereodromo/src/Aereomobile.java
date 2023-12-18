public abstract class Aereomobile implements CMP{
    protected String sigla;

    public void Aeromobile(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
    public abstract boolean isSuperior(Aereomobile x);

    public String toString() {
        return "Aeromobile{" + "sigla= " + sigla + '}';
    }
}
