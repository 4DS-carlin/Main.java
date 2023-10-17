import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float x;
        float y;
        float raggio;
        boolean fatto=false;
        Cerchio c1=null;
        Point centro=null;
        do {
            try {
                System.out.println("Inserisci le x del centro: ");
                x = input.nextFloat();
                System.out.println("Inserisci le y del centro: ");
                y = input.nextFloat();
                centro = new Point(x, y);
                System.out.println("Inserisci la lunghezza del raggio: ");
                raggio = input.nextFloat();
                c1 = new Cerchio(centro, raggio);
            }catch (Exception e){
                System.out.println("Errore riscontrato: "+ e.getMessage());
                fatto=true;
            }
        }while(fatto==false);

        System.out.println("L'area del cerchio è: "+c1.area());
        System.out.println("La circonferenza del cerchio è: "+c1.circonferenza());

        System.out.println("Inserisci di quanto vuoi ingrandire il tuo cerchio: ");
        float aumenta;
        aumenta=input.nextFloat();
        c1.aumenta(aumenta);
        System.out.println("Il raggio del cerchio dopo l'ingrandimento è di: "+ c1.getRaggio());

        System.out.println("Inserisci di quanro vuoi traslare il cerchio sull'asse delle x: ");
        float traslax;
        traslax=input.nextFloat();
        System.out.println("Inserisci di quanro vuoi traslare il cerchio sull'asse delle y: ");
        float traslay;
        traslay=input.nextFloat();
        c1.trasla(traslax,traslay);
        centro=c1.getCentro();
       System.out.println("Le cordinate del nuovo centro sono: "+ centro.toString());
    }
}