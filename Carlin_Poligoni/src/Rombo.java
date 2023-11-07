public class Rombo extends PoligonoReg{

    private float dMag;
    private float dMin;

    public Rombo(float l, float dm, float dM) throws Exception {
        super(l, 4);
        dMag=dM;
        dMin=dm;
    }

    public float getdMag() {
        return dMag;
    }

    public float getdMin() {
        return dMin;
    }

    public float area(){
        return (dMin*dMag)/2;
    }

    public String toString(){
        return "ROMBO: "+super.toString()+" diagonale minore: "+dMin+" diagonale maggiore: "+dMag;
    }

    public String disegna(char s){
        float l=super.getLato();
        String disegno= "";
        for(int i = 0; i < l; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                disegno = disegno + " ";
            }
            disegno = disegno + s;

            for (int j = 0; j < i * 2; j++) {
                disegno = disegno +  " ";
            }
            if (i != 0) {
                disegno = disegno + s;
            }

            // Move to the next line
            disegno = disegno + "\n";
        }

        for (float i = l - 2; i >= 0; i--) {

            for (int j = 0; j < l - i - 1; j++) {
                disegno = disegno +  " ";
            }

            disegno = disegno + s;
            for (int j = 0; j < i * 2; j++) {
                disegno = disegno + " ";
            }

            if (i != 0) {
                disegno = disegno + s;
            }
            disegno = disegno + "\n";
        }

        return disegno;
    }
}

