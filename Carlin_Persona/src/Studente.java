import Carlin_Prenotazione.src.Persona;
public class Studente extends Persona{

    public Studente(){

    }

    public Studente(String cognome, String nome, String codFisc, String dataNascita)throws Exception{
        super(cognome, nome, codFisc, dataNascita, null);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
