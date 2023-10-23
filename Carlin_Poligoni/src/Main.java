import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dimFis;
        int lato;
        int nLato;
        boolean fatto=false;
        System.out.println("Inserisci quanti poligoni vuoi gestire: ");
        dimFis=input.nextInt();
        GestionePoligoni g1=new GestionePoligoni(dimFis);
        do {
            try {
                System.out.println("Inserisci Lunghezza lato del quadrato:  ");
                lato = input.nextInt();
                Quadrato q1 = new Quadrato(lato);


                System.out.println("Inserisci Lunghezza lato dell'esagono:  ");
                lato = input.nextInt();
                Esagono e1 = new Esagono(lato);
                g1.inserisciPoligono(e1);
                g1.inserisciPoligono(q1);
                fatto=true;
            }catch (InputMismatchException e){
                System.out.println("Errore: Input non valido");
                input=new Scanner(System.in);
            }catch (Exception e){
                System.out.println("Errore: "+e.getMessage());
            }

        }while (!fatto);

        System.out.println("Perimetro quadrato: "+g1.perimetro(0));
        System.out.println("Perimetro esagono: "+g1.perimetro(1));
        System.out.println("Lato piu lungo: "+g1.poligonoConLatoPiuLungo().toString());
        System.out.println("Poligoni:\n"+g1.toString());
    }
}