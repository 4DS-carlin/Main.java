public class Ora {
    private int ore;
    private int minuti;
    private int secondi;

    public Ora(int orenew , int minutinew, int secondinew) throws Exception{
        if (orenew>=0 && orenew<=23){
            ore=orenew;
        }else{
            throw new Exception("ore inserite non valide");
        }
        if (minutinew>=0 && minutinew<=59){
            minuti=minutinew;
        }else{
            throw new Exception("minuti inserite non valide");
        }
        if (secondinew>=0 && secondinew<=59){
            secondi=secondinew;
        }else {
            throw new Exception("secondi inserite non valide");
        }
    }

    public void setOre(int orenew) throws Exception{
        if (orenew>=0 && orenew<=23){
            ore=orenew;
        }else{
            throw new Exception("ore inserite non valide");
        }
    }

    public int getOre() {
        return ore;
    }

    public void setMinuti(int minutinew) throws Exception{
        if (minutinew>=0 && minutinew<=59){
            minuti=minutinew;
        }else{
            throw new Exception("minuti inserite non valide");
        }
    }

    public int getMinuti() {
        return minuti;
    }

    public void setSecondi(int secondinew) throws Exception{
        if (secondinew>=0 && secondinew<=59){
            secondi=secondinew;
        }else {
            throw new Exception("secondi inserite non valide");
        }
    }

    public int getSecondi() {
        return secondi;
    }

    public int secfrommid(){
        int secfro;

        secfro=secondi+(minuti*60)+(ore*3600);

        return secfro;
    }

    public int minfrommid(){
        int minfro;
        minfro=minuti+(ore*60);
        return minfro;
    }

    public String toString(){
       String orario="";
       orario=orario+ore+":"+minuti+":"+secondi;
       return orario;
    }
}
