import java.lang.Math;

public class Pentagono extends PoligonoReg{
    public Pentagono(float lato) throws Exception {
        super(lato, 5);
    }

    public float area(){
        return (float) (Math.pow(super.getLato(), 2) * 1.72);
    }
    public float diagonale(){
        return (float) ((super.getLato()*(Math.sqrt(5) + 1))/2);
    }
    public float apotema(){
        return (float) (super.getLato() * 0.688);
    }
}
