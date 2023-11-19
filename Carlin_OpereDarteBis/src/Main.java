import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dimfis;
        float dep;
        dep=input.nextFloat();
        try {
            Collezione coll=new Collezione("coll", "susa", 3);
            Cornice c = new Cornice(15, 15, 1);
            Quadro q = new Quadro("Notte Stellata", "Carlin",9,9,c);
            Supporto s=new Supporto(2, 5,5);
            Scultura sc=new Scultura("controller", "Ema", 10, 5,5, s);
            SculturaDeperibile sd=new SculturaDeperibile("PC", "Emanuele", 10F, 5, 5, "legno", 365, dep,s);
            System.out.println("Ingombro cornice: "+c.printIngombro());
            System.out.println("Ingombro quadro: "+q.printIngombro());
            System.out.println("Ingombro supporto: "+s.printIngombro());
            System.out.println("Ingombro scultura: "+sc.printIngombro());
            System.out.println("Ingombro scultura deperibile: "+sd.printIngombro());
            coll.inserisci(q);
            coll.inserisci(sc);
            coll.inserisci(sd);
            System.out.println(coll.stampa());
        }catch (Exception e){
            System.out.println("Problema riscontrato: "+ e.getMessage());
        }


    }
}