package Carlin_Prenotazione;

import org.omg.CORBA.Object;

import java.util.Objects;

public class Studente extends Persona implements Cloneable{
    public Studente(String cognome, String nome, String codFisc, String data, String email) throws Exception {
        super(cognome, nome, codFisc, data, email);
        numeroInstanzie++;
    }

    public Studente(Persona persona) throws Exception {
        super(persona);
    }

    protected Studente clone() throws CloneNotSupportedException{
        Studente s =(Studente) super.clone();
        numeroInstanzie++;
        return s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCognome(), getCodFisc());
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if(!(o instanceof Studente)) {
            return false;
        }
        if (((Studente) o).getNome() == getNome() && ((Studente) o).getCognome() == getCognome() && ((Studente) o).getCodFisc() == getCodFisc()) {
            return true;
        }
        return false;
    }

    protected void finalize() throws Throwable {
        try{
            numeroInstanzie--;
        } finally {
            super.finalize();
        }
    }
}
