public class Esagono extends PoligonoReg{
    public Esagono(float lato){
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
}
