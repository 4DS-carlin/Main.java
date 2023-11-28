package Carlin_Prenotazione;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Persona p;
        Persona b;
        Prenotazione p1;
        try {
            p=new Studente("Emanuele", "Carlin", "RASMRC95M16H220R", "19/08/2006", "emanuele.carlin@gmail.om");
            b=new Studente("Emanuele", "Carlin", "RASMRC95M16H220R", "23/08/2009","emanuele.carlin@gmail.com");
            p1=new Prenotazione(p, "25/02/2034", "23:50:00");
            System.out.println(p.toString());
            System.out.println(p1.toString());
            System.out.println("Numero di instanzie: "+Persona.getNumeroInstanzie());
            System.out.println("Le persone sono uguali: "+b.equals(p));
            System.out.println("hash code oggetto p: "+p.hashCode());
            System.out.println("hash code oggetto b: "+b.hashCode());
            System.out.println("eta persona p: "+p.calcolaeta("21/11/2023"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}