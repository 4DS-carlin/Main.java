import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dimfis;
        String nomec;
        String luogoc;
        int scelta;
        System.out.println("Inserisci quante opere d'arte vuoi inserire nella collezione: ");
        dimfis=input.nextInt();
        input=new Scanner(System.in);
        System.out.println("Inserisci il nome della collezione: ");
        nomec=input.nextLine();
        System.out.println("Inserisci il luogo della colleione: ");
        luogoc=input.nextLine();

        Collezione c=new Collezione(nomec, luogoc, dimfis);
        String titolo;
        String artista;
        float altezza;
        float larghezza;
        float profondita;
        for(int i=0; i < dimfis; i++){
            input=new Scanner(System.in);
            System.out.println("Inserisci: \n1.Per aggiungere un quadro alla collezione.\n2.Per isnerire una scultura nella collezione. ");
            scelta=input.nextInt();
            if(scelta==1){
                input=new Scanner(System.in);
                System.out.println("Inserisci il titolo dell'opera: ");
                titolo=input.nextLine();
                System.out.println("Inserisci il nome dell'artista dell'opera: ");
                artista=input.nextLine();
                System.out.println("Inserisci la larghezza dell'opera: ");
                larghezza=input.nextInt();
                System.out.println("Inserisci l'altezza dell'opera: ");
                altezza=input.nextInt();
                Quadro q=new Quadro(titolo, artista, altezza, larghezza);
                c.inserisci(q);
            }else{
                input=new Scanner(System.in);
                System.out.println("Inserisci il titolo dell'opera: ");
                titolo=input.nextLine();
                System.out.println("Inserisci il nome dell'artista dell'opera: ");
                artista=input.nextLine();
                System.out.println("Inserisci la larghezza dell'opera: ");
                larghezza=input.nextInt();
                System.out.println("Inserisci l'altezza dell'opera: ");
                altezza=input.nextInt();
                System.out.println("Inserisci la profondita dell'opera: ");
                profondita=input.nextInt();
                Scultura s=new Scultura(titolo, artista, altezza, larghezza, profondita);
                c.inserisci(s);
            }
        }
        System.out.println(c.stampa());
        int pos;
        System.out.println("Inserisci il numero corrispondente all'opera di cuoi vuoi sapere l'ingombro: ");
        pos=input.nextInt();
        System.out.println(c.occupazione(pos));

    }
}