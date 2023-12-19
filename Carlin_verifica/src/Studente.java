public class Studente extends Persona{
    private final String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

    public Studente()throws Exception{
        super();
        numeroIstanze++;
    }

    public Studente(Integer classe, boolean isRipetente, String cognome, String nome, Data dataDiNascita)throws Exception{
        super(nome, cognome, dataDiNascita);
        setClasse(classe);
        setIsRipetente(isRipetente);
        voti = new Float[0];
        numeroIstanze++;
    }


    public void setClasse(Integer classe)throws Exception {
        if(classe!=null) {
            this.classe = classe;
        }else{
            throw new Exception("La classe non può essere null!!!");
        }
    }

    public void setIsRipetente(boolean ripetente)throws Exception {

        this.isRipetente = ripetente;
    }

    public void setVoti(Float[] voti){
        this.voti = voti.clone();
    }

    public String getSCUOLA() {
        return SCUOLA;
    }

    public Integer getClasse() {
        return classe;
    }

    public boolean getIsRipetente() {
        return isRipetente;
    }

    public Float[] getVoti(){
        if(voti.length == 0){
            return null;
        }
        return voti.clone();
    }

    public boolean verificaOmonimia(Studente studente) {
        if(studente.getNome().equals(getNome()) && studente.getCognome().equals(getCognome())){
            return true;
        }
        return false;
    }

    public void aggiungiVoto(Float voto)throws Exception{
        if(voto <= 0 || voto > 10 && voto%0.25!=0){
            throw new Exception("Voto invalido!");
        }

        Float[] voti = this.voti.clone();


        this.voti = new Float[voti.length+1];

        for (int i = 0; i < voti.length; i++) {
            this.voti[i] = voti[i];
        }
        this.voti[voti.length] = voto;
    }

    public void rimuoviVoto(Integer posizione)throws Exception{
        if(posizione < 0 || posizione > voti.length){
            throw new Exception("Posizione Invalida!");
        }
        for (int i = posizione; i < voti.length - 1; i++) {
            voti[i] = voti[i+1];
        }
        voti[voti.length-1] = null;
    }

    public boolean promuovi(){
        if(classe + 1 > 5){
            return false;
        }
        classe++;
        isRipetente = false;
        return true;
    }

    public boolean promuovi(Integer numeroClassi){
        if(classe + numeroClassi > 5 || numeroClassi <= 0){
            return false;
        }
        classe++;
        isRipetente = false;
        return true;
    }

    @Override
    public String info() {
        String s1 = "[", s2;
        if (voti == null) {
            s1 = "nessun voto presente";
        } else {
            for (int i = 0; i < voti.length; i++) {
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
}
