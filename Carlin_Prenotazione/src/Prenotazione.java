
public class Prenotazione {
    //attributi
    private Persona persona;
    private String data;
    private String ora;

    //metodi
    public Prenotazione(Persona persona, String data, String ora)throws Exception{
        setPersona(persona);
        setData(data);
        setOra(ora);
    }

    public void setPersona(Persona persona) throws Exception {
        if(persona != null){
            Persona temp = new Persona(persona);

            this.persona = temp;
        } else {
            throw new Exception("L'attributo data non può essere null!");
        }
    }

    public void setData(String data)throws Exception{
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

        this.data=data;
    }

    public void setOra(String ora)throws Exception{
        if(ora==null){
            throw new Exception("La ora non può essere null.");
        }
        if(ora==" "){
            throw new Exception("La ora non può essere vuota.");
        }
        if(!ora.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")){
            throw new Exception("ora non valida.");
        }
        int ore=(ora.charAt(0)-48)*10+(ora.charAt(1)-48);
        int minuti=(ora.charAt(3)-48)*10+(ora.charAt(4)-48);
        int secondi=(ora.charAt(6)-48)*10+(ora.charAt(7)-48);
        if(ore>23 || ore<0){
            throw new Exception("ore non valide.");
        }
        if(minuti>59 || minuti<0){
            throw new Exception("minuti non validi.");
        }
        if(secondi>59 || secondi<0){
            throw new Exception("secondi non validi.");
        }
        this.ora=ora;
    }

    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public Persona getPersona() {
        Persona tmp=new Persona(persona);
        return tmp;
    }

    public String toString(){
        return "["+persona.toString()+", "+data+", "+ora+"]";
    }
}





