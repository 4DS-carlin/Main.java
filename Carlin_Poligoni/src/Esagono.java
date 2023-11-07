public class Esagono extends PoligonoReg{
    public Esagono(float lato) throws Exception {
        super(lato, 6);
    }

    public float diagonale(){
        return getLato();
    }
    public float area(){
        return(super.dueP()*apotema())/2;
    }
    public float apotema(){
        return (float) (0.86*getLato());
    }
    public String toString(){
        return "ESAGONO: "+super.toString();
    }
}
