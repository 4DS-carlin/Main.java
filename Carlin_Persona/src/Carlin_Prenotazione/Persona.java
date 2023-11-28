package Carlin_Prenotazione;

import org.apache.commons.validator.routines.EmailValidator;

public class Persona {
    //attributi
    private String cognome;
    private String nome;
    private String codFisc;
    private String datanascita;
    private String email;
    protected static int numeroInstanzie;

    //metodi
    public Persona(){
        numeroInstanzie++;
    }

    public Persona(String cognome, String nome, String codFisc, String datanascita, String email)throws Exception{
        setCognome(cognome);
        setNome(nome);
        setCodFisc(codFisc);
       setDatanascita(datanascita);
       setEmail(email);
    }

    public Persona(Persona persona){
        cognome=persona.cognome;
        nome=persona.nome;
        codFisc=persona.codFisc;
        datanascita=persona.datanascita;
        email=persona.email;
        //this(); non aggiorniamo il numero di instanzie dal momento che è un costruttore copia
    }
    public boolean datavalida(String data)throws Exception{
        if(data==null){
            throw new Exception("La data non può essere null.");
        }
        if(data==""){
            throw new Exception("La data non può essere vuota.");
        }
        if(!data.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
            throw new Exception("Data non valida.");
        }
        int giorni=(data.charAt(0)-48)*10+(data.charAt(1)-48);
        int mese=(data.charAt(3)-48)*10+(data.charAt(4)-48);
        int anno=(data.charAt(6)-48)*1000+((data.charAt(7)-48)*100+((data.charAt(8)-48)*10)+((data.charAt(9)-48)));
        if(mese>0 && mese<13) {
            switch (mese) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(giorni>31 || giorni<1){
                        throw new Exception("gioni non validi");
                    }
                    break;
                case 2:
                    if(anno%4==0) {
                        if (giorni > 29 || giorni < 1) {
                            throw new Exception("gioni non validi");
                        }
                    }else{
                        if (giorni > 28 || giorni < 1) {
                            throw new Exception("gioni non validi");
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(giorni>30 || giorni<1){
                        throw new Exception("gioni non validi");
                    }
                    break;
            }
        }else{
            throw new Exception("mese non valido.");
        }

        return true;
    }

    private boolean controlloNominativi(String nominativo)throws Exception{
        try {
            if (nominativo == null) {
                throw new Exception("Il nome/cognome non può essere null.");
            }
            if (nominativo == "") {
                throw new Exception("Il nome/cognome non può essere vuoto.");
            }
            nominativo.trim();
            if (!nominativo.contains(" ")) {
                if (nominativo.charAt(0) < 65 || nominativo.charAt(0) > 90) {
                    throw new Exception("La prima lettera deve essere maiuscola. ");
                }
                for (int i = 1; i < nominativo.length(); i++) {
                    if (nominativo.charAt(i) < 97 || nominativo.charAt(i) > 122) {
                        throw new Exception("Il nome/cognome non possono contenere caratteri speciali e solo la prima lettera deve essere miuscola.");
                    }
                }
            } else {
                String[] nominativi = nominativo.split(" ");
                for (int i = 0; i < nominativi.length; i++) {
                    if (nominativi[i].charAt(0) < 65 || nominativi[i].charAt(0) > 90) {
                        throw new Exception("La prima lettera deve essere maiuscola. ");
                    }
                    for (int j = 1; j < nominativi[i].length(); j++) {
                        if (nominativi[i].charAt(j) < 97 || nominativi[i].charAt(j) > 122) {
                            throw new Exception("Il nome/cognome non possono contenere caratteri speciali e solo la prima lettera deve essere miuscola.");
                        }
                    }
                }
            }
            return true;
        }catch (NullPointerException e){
            throw new NullPointerException ("L'attributo non può essere null");
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException ("Non è consentito l'utilizzo di più di uno spazio!");
        }
    }

    public void setNome(String nome)throws Exception{
        if(controlloNominativi(nome)){
            this.nome=nome.trim();
        }
    }

    public void setCognome(String cognome)throws Exception{
        if (controlloNominativi(cognome)){
            this.cognome=cognome.trim();
        }
    }

    public void setCodFisc(String codFisc)throws Exception{

        if (codFisc==null){
            throw new Exception("Il codice fiscale non può essere null.");
        }
        if (codFisc==""){
            throw new Exception("Il codice fiscale non può essere vuoto.");
        }
        codFisc.trim();
        if(codFisc.matches("[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$")){
            this.codFisc=codFisc;
        }else{
            throw new Exception("Il codice fiscale non è valido.");
        }
    }

    public void setDatanascita(String datanascita) throws Exception{
        try {
            if(datavalida(datanascita)==true){
                this.datanascita=datanascita;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void setEmail(String email)throws Exception{
        EmailValidator e=EmailValidator.getInstance();
        if(e.isValid(email)==true){
            this.email=email;
        }else{
            throw new Exception("Email non valida");
        }
    }
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public static int getNumeroInstanzie() {
        return numeroInstanzie;
    }

    public boolean verificaOmonimia(Persona persona)throws Exception{
        try {
            if (this.cognome != null || this.nome != null || persona.cognome != null || persona.nome != null) {
                if (nome.equals(persona.nome) && cognome.equals(persona.cognome)) {
                    return true;
                }
                return false;
            } else {
                throw new Exception("Verificare che gli attributi cognome e nome non siano nulli!");
            }
        }catch (NullPointerException e){
            throw new NullPointerException("L'oggetto persona non può essere null!");
        }

    }

    public String toString(){
        return "["+cognome+", "+nome+", "+codFisc+ ", "+datanascita +", "+email+"]";
    }

    public int calcolaeta(String oggi)throws Exception{
        if(datavalida(oggi)==true) {
            int giorni=(oggi.charAt(0)-48)*10+(oggi.charAt(1)-48);
            int mese=(oggi.charAt(3)-48)*10+(oggi.charAt(4)-48);
            int anno=(oggi.charAt(6)-48)*1000+((oggi.charAt(7)-48)*100+((oggi.charAt(8)-48)*10)+((oggi.charAt(9)-48)));

            int giornin=(datanascita.charAt(0)-48)*10+(datanascita.charAt(1)-48);
            int mesen=(datanascita.charAt(3)-48)*10+(datanascita.charAt(4)-48);
            int annon=(datanascita.charAt(6)-48)*1000+((datanascita.charAt(7)-48)*100+((datanascita.charAt(8)-48)*10)+((datanascita.charAt(9)-48)));

            if(giorni>=giornin && mese>=mesen && anno>annon){
                return anno-annon;
            } else if (giornin<giornin && mese>mesen && anno>annon) {
                return anno-annon;
            } else if (mese>mesen) {
                return anno-annon;
            }else{
                return (anno-annon)-1;
            }
        }else{
            throw new Exception("Data odierna non valida");
        }
    }


}



