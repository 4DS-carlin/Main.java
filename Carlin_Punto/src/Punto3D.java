class Punto3D extends Punto{
    private float z;

    public Punto3D(float newX, float newY, float newZ){
        super(newX, newY);
        z = newZ;
    }

    public float getZ(){
        return z;
    }

    public void setY(float newZ){
        z = newZ;
    }

    public void traslaPunto3D(float tX, float tY, float tZ){
        super.traslaPunto(tX, tY);
        z += tZ;
    }

    public String toString(){
        String punto;
        punto="(x: "+ super.getX() +", y: "+super.getY()+", z:"+z+")";
        return punto;
    }
}
