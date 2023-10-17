import java.util.Arrays;


public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;


    public Classe(Studente capo, Studente[] stud) throws Exception{
        capoClasse = new Studente(capo.getNome(), capo.getCognome());
        studenti = new Studente[stud.length];
        for(int i = 0; i < stud.length; i++){
            studenti[i] = new Studente(stud[i]);
        }
    }


    public Studente getCapoClasse() {
        Studente cClas=null;
        try {
            cClas = new Studente(capoClasse.getNome(), capoClasse.getCognome());
            return cClas;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return cClas;
    }


    public void setCapoClasse(Studente capoClasse) {
        try {
            this.capoClasse = new Studente(capoClasse.getNome(), capoClasse.getCognome());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void invertiAttributi()throws Exception{
        for (int i = 0; i < studenti.length; i++) {
            String temp = studenti[i].getNome();
            studenti[i].setNome(studenti[i].getCognome());
            studenti[i].setCognome(temp);
        }
    }


    public String toString() {
        return "Classe{" + "capoClasse=" + capoClasse + ", studenti=" + Arrays.toString(studenti) + '}';
    }
}




