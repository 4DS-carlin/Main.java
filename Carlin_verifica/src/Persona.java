import java.time.LocalDate;

public class Persona {
    private String nome;
    private String cognome;
    private Data dataDiNascita;
    protected static int numeroIstanze;

    public Persona()throws Exception{
        numeroIstanze++;
    }

    public Persona(String cognome, String nome, Data data)throws Exception{
        setCognome(cognome);
        setNome(nome);
        setData(data);
    }

    public void setNome(String nome)throws Exception{
        if(nome!=null) {
            this.nome = nome;
        }else{
            throw new Exception("Il nome non può essere null!!!");
        }
    }

    public void setCognome(String cognome)throws Exception {
        if(cognome!=null) {
            this.cognome = cognome;
        }else{
            throw new Exception("Il cognome non può essere null!!!");
        }
    }

    public void setData(Data data) throws Exception{
        if(data!=null) {
            if (Data.differenzaInAnni(dataDiNascita, new Data()) >= 0){
                dataDiNascita = new Data(data.getGiorno(), data.getMese(), data.getAnno());
            }else{
                throw new Exception("la data di nascita non può essere una data futura!!!");
            }
        }else{
            throw new Exception("La data non può essere null!!!");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Data getDataDiNascita() throws Exception{
        return new Data(dataDiNascita.getGiorno(), dataDiNascita.getMese(), dataDiNascita.getAnno());
    }

    public int getNumeroIstanze() {
        return numeroIstanze;
    }

    public boolean verificaOmonimia(Persona persona){
        if(persona.getNome().equals(nome) && persona.getCognome().equals(cognome)){
            return true;
        }
        return false;
    }

    public Integer calcolaEta()throws Exception{
        return Data.differenzaInAnni(dataDiNascita, new Data());
    }

    public String info(){
        return "\nCognome: " + cognome + "\nNome: " + nome + "\nData Di nascita: " + dataDiNascita.toString();
    }
}
