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
        return super.toString()+" diagonale minore: "+dMin+" diagonale maggiore: "+dMag;
    }

}
