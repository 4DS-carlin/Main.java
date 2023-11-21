package Carlin_Prenotazione.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Persona p;
        Persona b;
        Prenotazione p1;
        try {
            p=new Persona("Carlin", "Emanuele", "RASMRC95M16H224R", "19/08/2006", "emanuele.carlin@gmail.om");
            b=new Persona("Carlin", "Emanuele", "RBSMRC95M16H220R", "23/08/2009","emanuele.carlin@gmail.com");
            p1=new Prenotazione(p, "25/02/2034", "23:50:00");
            System.out.println(p.toString());
            System.out.println(p1.toString());
            System.out.println(Persona.getNumeroInstanzie());
            System.out.println(b.verificaOmonimia(p));
            System.out.println(p.calcolaeta("21/11/2023"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}