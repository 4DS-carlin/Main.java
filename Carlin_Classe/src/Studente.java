public class Studente {
    private String nome;
    private String cognome;


    public Studente(String n, String c)throws Exception{
        setNome(n);
        setCognome(c);
    }


    public Studente(Studente stud){
        this.nome = stud.nome;
        this.cognome = stud.cognome;
    }


    public String getNome() {
        return nome;
    }


    public String getCognome() {
        return cognome;
    }


    private boolean checkString(String stringa)throws Exception {
        String[] stringaA;
        if (stringa.contains(" ")) {
            stringaA = stringa.split(" ");
            for (int i = 0; i < stringaA.length; i++) {
                if (stringaA[i].charAt(0) <= 65 || stringaA[i].charAt(0) >= 90) {
                    throw new Exception("iniziale stringa non valida");
                }
                for (int j = 1; j < stringaA[i].length(); j++) {
                    if (stringaA[i].charAt(j) < 97 || stringaA[i].charAt(j) > 122) {
                        throw new Exception("Nella stringa sono presenti caratteri speciali");
                    }
                }
            }
        } else {
            if (stringa.charAt(0) <= 65 || stringa.charAt(0) >= 90) {
                throw new Exception("iniziale stringa non valida");
            }
            for (int i = 1; i < stringa.length(); i++) {
                if (stringa.charAt(i) < 97 || stringa.charAt(i) > 122) {
                    throw new Exception("Nella stringa sono presenti caratteri speciali");
                }
            }
        }
        return true;
    }
    public void setNome(String nome)throws Exception{
        if(checkString(nome)==true) {
            this.nome=nome;
        }
    }
    public void setCognome(String cognome)throws Exception{
        if(checkString(cognome)==true) {
            this.cognome=cognome;
        }
    }
    public String toString() {
        return "Studente{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + '}';
    }
}
