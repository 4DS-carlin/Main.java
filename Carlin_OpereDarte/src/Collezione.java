public class Collezione {
    private String nome;
    private String luogo;
    private int dimLog;
    private OperaDarte[] opere;

    public Collezione(String nome, String luogo, int numOpere){
        this.nome=nome;
        this.luogo=luogo;
        this.dimLog=numOpere;
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


}
