public class Collezione {
    private String nome;
    private String luogo;
    private int dimLog;
    private OperaDarte[] opere;

    public Collezione(String nome, String luogo, int numOpere){
        this.nome=nome;
        this.luogo=luogo;
        this.dimLog=-1;
        opere=new OperaDarte[numOpere];
    }
    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }
    public String getNome() {
        return nome;
    }
    public int getDimLog() {
        return dimLog;
    }
    public String getLuogo() {
        return luogo;
    }
    public OperaDarte getOpera(int pos){
        return opere[pos];
    }
    public void inserisci(OperaDarte o){
        dimLog++;
        opere[dimLog]=o;
    }
    public String stampa(){
        String collezione="_____COLLEZIONE_____\n";
        collezione=collezione+"nome: "+nome+" luogo: "+luogo+"\n";
        for(int i=0; i<dimLog+1; i++){
            collezione=collezione+i+". "+opere[i].toString()+"\n";
        }
        return collezione;
    }
    public double occupazione(int pos){
        return opere[pos].printIngombro();
    }

}
