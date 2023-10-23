public class GestionePoligoni {
    private PoligonoReg[] arrPoligoni;
    private int dimLogica;

    public GestionePoligoni(int lunghezza){
        arrPoligoni = new PoligonoReg[lunghezza];
        dimLogica = 0;
    }

    public void inserisciPoligono(PoligonoReg pol){
        arrPoligoni[dimLogica] = pol;
        dimLogica++;
    }

    public PoligonoReg poligonoConLatoPiuLungo() {
        PoligonoReg max = arrPoligoni[0];
        for (int i = 1; i < dimLogica; i++) {
            if (arrPoligoni[i].getLato() > max.getLato()) {
                max = arrPoligoni[i];
            }
        }
        return max;
    }

    public float perimetro(int i){
        return arrPoligoni[i].dueP();
    }
    

    public String toString() {
        String s = "";
        for (int i = 0; i < dimLogica; i++) {
            s += arrPoligoni[i].toString()+"\n";
        }
        return s;
    }

    public String toString(int i){
        return arrPoligoni[i].toString();
    }
}
