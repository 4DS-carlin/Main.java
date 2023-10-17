
class PuntoColorato extends Punto{
    private String color;

    public PuntoColorato(float newX, float newY, String newC){
        super(newX, newY);
        color = newC;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newC){
        color = newC;
    }

    public String toString(){
        String punto;
        punto=super.toString()+" colore: "+color;
        return punto;
    }


}