import java.lang.Math;

public class Quadrato extends PoligonoReg{
    public Quadrato (float l){
        super(l, 4);
    }

    public float area(){
        return getLato()*getLato();
    }

    public double diagonale(){
        return Math.sqrt((getLato()*getLato())*2);
    }
}
