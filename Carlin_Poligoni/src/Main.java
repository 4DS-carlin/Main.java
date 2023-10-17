import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dimFis;
        int lato;
        int nLato;
        System.out.println("Inserisci quanti poligoni vuoi gestire: ");
        dimFis=input.nextInt();
        GestionePoligoni g1=new GestionePoligoni(dimFis);

        System.out.println("Inserisci Lunghezza lato del quadrato:  ");
        lato=input.nextInt();
        Quadrato q1=new Quadrato(lato);
        g1.inserisciPoligono(q1);

        System.out.println("Inserisci Lunghezza lato dell'esagono:  ");
        lato=input.nextInt();
        Esagono e1=new Esagono(lato);
        g1.inserisciPoligono(e1);

        System.out.println("Perimetro quadrato: "+g1.perimetro(0));
        System.out.println("Perimetro esagono: "+g1.perimetro(1));

        System.out.println("Area quadrato: "+g1.perimetro(0));
    }
}