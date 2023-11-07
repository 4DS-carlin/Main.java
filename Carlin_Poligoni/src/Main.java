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
        Quadrato q1=null;
        Rombo r1=null;
        do {
            try {
                System.out.println("Inserisci Lunghezza lato del quadrato:  ");
                lato = input.nextInt();
                q1 = new Quadrato(lato);


                System.out.println("Inserisci Lunghezza lato dell'esagono:  ");
                lato = input.nextInt();
                Esagono e1 = new Esagono(lato);
                g1.inserisciPoligono(q1);
                g1.inserisciPoligono(e1);
                r1=new Rombo(101,3,4);
                fatto=true;
            }catch (InputMismatchException e){
                System.out.println("Errore: Input non valido");
                input=new Scanner(System.in);
            }catch (Exception e){
                System.out.println("Errore: "+e.getMessage());
            }

        }while (!fatto);

        System.out.println("\nPerimetro quadrato: "+g1.perimetro(0));
        System.out.println("\nPerimetro esagono: "+g1.perimetro(1));
        System.out.println("\nArea quadrato: "+g1.getPoligono(0).area());
        System.out.println("\nArea esagono: "+g1.getPoligono(1).area());
        System.out.println("\nPoligono con il lato piu lungo: \n"+g1.poligonoConLatoPiuLungo().toString());
        System.out.println("\n\nPoligoni:\n"+g1.toString());

        System.out.println("\nDISEGNO DEL QUADRATO:\n"+q1.disegna('x'));
        System.out.println("\nDISEGNO DEL ROMBO:\n"+r1.disegna('x'));
    }
}