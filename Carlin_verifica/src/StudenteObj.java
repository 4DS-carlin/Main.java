import java.util.Arrays;

public class StudenteObj extends Studente{

    public StudenteObj()throws Exception{
        super();
        numeroIstanze++;
    }

    public StudenteObj(Integer classe, Boolean isRipetente, String cognome, String nome, Data dataDinascita)throws Exception{
        super(classe, isRipetente, cognome, nome, dataDinascita);
        numeroIstanze++;
    }

    protected StudenteObj clone() throws CloneNotSupportedException{
        return (StudenteObj) super.clone();
    }

    public boolean equals(Object oggetto){
        if(!(oggetto instanceof StudenteObj)){
            return false;
        }

        try {
            if ((((StudenteObj) oggetto).getNome().equals(getNome())) && (((StudenteObj) oggetto).getCognome().equals(getCognome())) && (((StudenteObj) oggetto).getDataDiNascita().equals(getDataDiNascita())) && (((StudenteObj) oggetto).getClasse().equals(getClasse())) && (((StudenteObj) oggetto).getIsRipetente() == getIsRipetente())) {
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    public int hashCode() {
        int hash = 0;

        if(getNome() != null){
            hash += getNome().hashCode();
        }
        if(getCognome() != null){
            hash += getCognome().hashCode();
        }
        try {
            if (getDataDiNascita() != null) {
                hash += getDataDiNascita().hashCode();
            }
        }catch (Exception e){
            //Data non valida
        }
        if(getClasse() != null){
            hash += getClasse().hashCode();
        }

        hash += getNome().hashCode();

        if(getVoti() != null){
            hash += Arrays.hashCode(getVoti());
        }

        return hash;
    }

    public String toString(){
        String s1 = "[", s2;
        if (getVoti() == null) {
            s1 = "nessun voto presente";
        } else {
            for (int i = 0; i < getVoti().length; i++) {
                if(i == 0){
                    s1 += getVoti()[i];
                }else{
                    s1 = s1 + ", " + getVoti()[i];
                }
            }
            s1 += "]";
        }
        if (getIsRipetente()) {
            s2 = "sì";
        } else {
            s2 = "no";
        }
        return "Scuola: " + getSCUOLA() + "\nClasse: " + getClasse() + super.info() + "\nRipetente: " + s2 + "\nVoti: " + s1;
    }

    protected void finalize(){
        try{
            super.finalize();
        }catch (Throwable e){
            numeroIstanze--;
        }
    }
}
