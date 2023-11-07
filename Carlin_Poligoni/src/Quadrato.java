import java.lang.Math;

public class Quadrato extends PoligonoReg{
    public Quadrato (float l) throws Exception {
        super(l, 4);
    }

    public float area(){
        return getLato()*getLato();
    }

    public double diagonale(){
        return Math.sqrt((getLato()*getLato())*2);
    }

    public String toString(){
        return "QUADRATO: "+super.toString();
    }

    public String disegna(char s){
        String disegno="";
        float l=getLato();
        for(int i=0; i<l; i++){
            if(i==0||i==l-1){
                for(int j=0; j<l; j++){
                    disegno=disegno+s;
                }
                disegno=disegno+"\n";
            }
            else{
                disegno=disegno+s;
                for(int r=0; r<l-2; r++){
                    disegno=disegno+" ";
                }
                disegno=disegno+s+"\n";
            }
        }
        return disegno;
    }
}

