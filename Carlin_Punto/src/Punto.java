
class Punto{
    private float x;
    private float y;
    public Punto(float newX, float newY){
        x = newX;
        y = newY;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void setX(float newX){
        x = newX;
    }

    public void setY(float newY){
        y = newY;
    }

    public void traslaPunto(float tX, float tY){
        x += tX;
        y += tY;
    }

    private float sommacoordinate(){
        return x+y;
    }


    public String toString(){
       String punto;
       punto="(x: "+ x +", y: "+y+")";
       return punto;
    }

}

