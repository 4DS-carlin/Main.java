import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inptut=new Scanner(System.in);
        float x;
        float y;
        float z;
        String colore;
        Punto p1;
        Punto3D p2;
        PuntoColorato p3;



        System.out.println("____Inserisci coordinate punto____");
        System.out.println("Inserisci le x: ");
        x=inptut.nextFloat();
        System.out.println("Inserisci le y: ");
        y=inptut.nextFloat();
        p1=new Punto(x,y);

        System.out.println("\n____Inserisci coordinate punto3D____");
        System.out.println("Inserisci le x: ");
        x=inptut.nextFloat();
        System.out.println("Inserisci le y: ");
        y=inptut.nextFloat();
        System.out.println("Inserisci le z: ");
        z=inptut.nextFloat();
        p2=new Punto3D(x,y,z);

        System.out.println("\n____Inserisci coordinate punto colorato____");
        System.out.println("Inserisci le x: ");
        x=inptut.nextFloat();
        System.out.println("Inserisci le y: ");
        y=inptut.nextFloat();
        System.out.println("Inserisci il colore: ");
        inptut=new Scanner(System.in);
        colore=inptut.nextLine();
        p3=new PuntoColorato(x,y,colore);



        System.out.println("\n____PUNTO____");
        System.out.println(p1.toString()+"\n");

        System.out.println("\n____PUNTO3D____");
        System.out.println(p2.toString()+"\n");

        System.out.println("\n____PUNTO COLORATO____");
        System.out.println(p3.toString()+"\n");



        System.out.println("\n____TRASLIAMO IL PUNTO____");
        System.out.println("Inserisci la traslazione sulle x: ");
        x=inptut.nextFloat();
        System.out.println("Inserisci la traslazioen sulle y: ");
        y=inptut.nextFloat();
        p1.traslaPunto(x,y);

        System.out.println("\n____TRASLIAMO IL PUNTO3D____");
        System.out.println("Inserisci la traslazione sulle x: ");
        x=inptut.nextFloat();
        System.out.println("Inserisci la traslazioen sulle y: ");
        y=inptut.nextFloat();
        System.out.println("Inserisci la traslazioen sulle z: ");
        z=inptut.nextFloat();
        p2.traslaPunto3D(x,y,z);

        System.out.println("\n____TRASLIAMO IL PUNTO COLORATO____");
        System.out.println("Inserisci la traslazione sulle x: ");
        x=inptut.nextFloat();
        System.out.println("Inserisci la traslazioen sulle y: ");
        y=inptut.nextFloat();
        p3.traslaPunto(x,y);



        System.out.println("\n____PUNTO TRASLATO____");
        System.out.println(p1.toString()+"\n");

        System.out.println("\n____PUNTO3D TRASLATO____");
        System.out.println(p2.toString()+"\n");

        System.out.println("\n____PUNTO COLORATO TRASLATO____");
        System.out.println(p3.toString()+"\n");
    }
}