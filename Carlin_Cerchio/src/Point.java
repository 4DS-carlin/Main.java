public class Point {
    private float x;
    private float y;

    public Point(float x, float y){
        setX(x);
        setY(y);
    }

    public float getX(){

        return x;
    }

    public float getY(){

        return y;
    }

    public void setX(float x){

        this.x = x;
    }

    public void setY(float y){

        this.y = y;
    }

    public void trasla(float addx, float addy){
        this.x=this.x+addx;
        this.y=this.y+addy;

    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
