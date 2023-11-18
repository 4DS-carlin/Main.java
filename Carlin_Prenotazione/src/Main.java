import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Persona p;
        Persona b;
        Prenotazione p1;
        try {
            p=new Persona("Carlin", "Emanuele", "RASMRC95M16H224R");
            b=new Persona("Carlin", "Emanuele", "RBSMRC95M16H220R");
            p1=new Prenotazione(p, "29/02/2000", "23:50:00");
            System.out.println(p.toString());
            System.out.println(p1.toString());
            System.out.println(Persona.getNumeroInstanzie());
            System.out.println(b.verificaOmonimia(p));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}