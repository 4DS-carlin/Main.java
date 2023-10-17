import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        Classe classe1 = null;
        Studente capoclasse = null;
        int lunghezza = 0;


        System.out.print("\nInserire il numero di studenti: ");
        input = new Scanner(System.in);
        lunghezza = input.nextInt();


        Studente[] arrayStudenti = new Studente[lunghezza];
        boolean checkArray = false;


        do{
            try {
                for(int i = 0; i < lunghezza; i++){
                    System.out.print("\nInserire il nome dello studente: ");
                    input = new Scanner(System.in);
                    String nome = input.nextLine();


                    System.out.print("\nInserire il cognome dello studente: ");
                    input = new Scanner(System.in);
                    String cognome = input.nextLine();
                    arrayStudenti[i]=new Studente(nome, cognome);
                }


                System.out.print("\nInserire il nome dello studente che fara` da capo classe: ");
                input = new Scanner(System.in);
                String nome = input.nextLine();


                System.out.print("\nInserire il cognome dello studente che fara` da capo classe: ");
                input = new Scanner(System.in);
                String cognome = input.nextLine();
                capoclasse=new Studente(nome, cognome);


                classe1 = new Classe(capoclasse, arrayStudenti);
                checkArray = true;
            }
            catch (ArithmeticException e){
                System.out.println("\nerrore" + e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println("\nInserire solo lettere!");
            }
            catch(Exception e) {
                System.out.println("\nNon va bene: " + e.getMessage());
            }
        }while(!checkArray);




        System.out.println("La classe al momento attuale e`: " + Arrays.toString(arrayStudenti));
        System.out.println("Il capoclasse e`: " + classe1.getCapoClasse());


        classe1.invertiAttributi();
        System.out.println("\nLa classe sistemata e con nomi e cognomi invertitie`: " + classe1.toString());
    }
}
