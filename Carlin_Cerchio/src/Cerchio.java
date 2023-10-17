public class Cerchio {
        private Point centro;
        private float raggio;

        public Cerchio(Point c, float r)throws Exception{
            centro=new Point(c.getX(), c.getY());
            if(raggio>0) {
                raggio = r;
            }else{
                throw new Exception("Valore raggio non valido!!!");
            }
        }

        public Point getCentro(){
            Point centronew=new Point(centro.getX(), centro.getY());
            return centronew;
        }

        public float getRaggio(){
            return raggio;
        }

        public void setCentro(Point c){
            centro.setX(c.getX());
            centro.setY(c.getY());
        }

        public void setRaggio(float r){
            raggio=r;
        }

        public double area(){
            double area;
            area=(raggio*raggio)*3.1415;
            return area;
        }

        public double circonferenza(){
            double circonferenza;
            circonferenza=(2*3.1415)*raggio;
            return circonferenza;
        }

        public void aumenta(float aum){
            raggio=raggio*aum;
        }

        public void trasla(float x, float y){
            centro.trasla(x,y);
        }
}
