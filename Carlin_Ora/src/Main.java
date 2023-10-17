import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        input=new Scanner(System.in);
        int scelta;
        int ore;
        int minuti;
        int secondi;
        boolean fatto=false;
        Ora orario=null;

        do {
            try {
                System.out.println("Inserisci le ore: ");
                ore = input.nextInt();
                System.out.println("Inserisci i minuti: ");
                minuti = input.nextInt();
                System.out.println("Inserisci i secondi ");
                secondi = input.nextInt();
                orario = new Ora(ore, minuti, secondi);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                fatto=true;
            }
        } while (fatto==true);


        do{
            System.out.println();
            System.out.println("-----menù-----");
            System.out.println("Inserire 1 se si vuole modificare le ore;");
            System.out.println("Inserire 2 se si vuole modificare i minuti;");
            System.out.println("Inserire 3 se si vuole modificare i secondi:");
            System.out.println("Inserire 4 se si vuole sapere quanti secondi sono passati da mezzanotte;");
            System.out.println("Inserire 5 se si vuole sapere quanti minuti sono passati da mezzanotte;");
            System.out.println("Inserire 6 se si vuole sapere quante ore sono passate da mezzanotte;");
            System.out.println("Inserire 7 se si vuole visualizzare l'orario;");

            System.out.println("\nInserire l'operazione da eseguire: ");
            scelta= input.nextInt();

            if(scelta == 1){
                try {
                    System.out.println("Inserisci le ore: ");
                    ore = input.nextInt();
                    orario.setOre(ore);
                }
            catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }else if(scelta == 2){
                try {
                    System.out.println("Inserisci i minuti: ");
                    minuti = input.nextInt();
                    orario.setMinuti(minuti);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }else if(scelta == 3){
                try {
                    System.out.println("Inserisci i secondi: ");
                    secondi = input.nextInt();
                    orario.setSecondi(secondi);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }else if(scelta == 4){
                System.out.println("Sono passati: "+orario.secfrommid()+" secondi");

            }else if(scelta == 5) {
                System.out.println("Sono passati: "+orario.minfrommid()+" minuti");

            }else if(scelta == 6) {
                System.out.println(orario.getOre());

            }else if(scelta == 7) {
                System.out.println("ORARIO: \n"+orario.toString());

            }
        }while(scelta != 0);
        System.out.println("Sei uscito dal programma");

    }
}