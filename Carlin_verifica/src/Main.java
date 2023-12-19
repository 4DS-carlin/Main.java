import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(System.in);
            Data data = new Data(19,8,2001);
            Persona p = new Persona("Carlin", "Emanuele", data);
            Studente s = new Studente(4, false, "Carlin", "Emanuele" , data);
            StudenteObj so = new StudenteObj(4, false, "Carlin", "Emanuele" , data);

            System.out.println("\nData: ");
            System.out.println(data.toString());

            System.out.println("\nPersona: ");
            System.out.println(p.info());

            System.out.println("aggiungi voto: ");
            float v = input.nextFloat();
            s.aggiungiVoto(v);
            System.out.println("aggiungi voto: ");
             v = input.nextFloat();
            s.aggiungiVoto(v);
            System.out.println("aggiungi voto: ");
             v = input.nextFloat();
            s.aggiungiVoto(v);

            System.out.println("\nStudente: ");
            System.out.println(s.info());

            System.out.println("\nStudenteObj: ");
            System.out.println(so.toString());
        }catch (Exception e){
            System.out.println("\nErrore: " + e.getMessage());
        }
    }
}