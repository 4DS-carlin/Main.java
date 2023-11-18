public class Persona {
    //attributi
    private String cognome;
    private String nome;
    private String codFisc;
    private static int numeroInstanzie;

    //metodi
    public Persona(){
        numeroInstanzie++;
    }

    public Persona(String cognome, String nome, String codFisc)throws Exception{
        this(); //dobbiamo utilizzarlo per aggiornare il numero di instanzie, non vedo una ragione per non utlizzarlo
        setCognome(cognome);
        setNome(nome);
        setCodFisc(codFisc);
    }

    public Persona(Persona persona){
        cognome=persona.cognome;
        nome=persona.nome;
        codFisc=persona.codFisc;
        //this(); non aggiorniamo il numeor di instanzie dal momento che è un costruttore copia
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
        return "["+cognome+", "+nome+", "+codFisc+"]";
    }



}



//-----------------------------------
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

