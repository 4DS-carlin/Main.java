import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        boolean flag = false;
        int scelta;
        int durata=0;

        System.out.print("\nInserire numero giorni periodo: ");
        durata = input.nextInt();
        RaccoltaMele m1;
        Data d1 = null;
        m1 = new RaccoltaMele(durata);
        GiornataRaccolta m2 = null;




        flag = true;



        flag = false;

        while(!flag){
            System.out.println(" ");
            System.out.println("Cosa vuoi fare? ");
            System.out.println("1) Aggiungere giornata; ");
            System.out.println("2) Totale raccolto; ");
            System.out.println("3) Media giornaliera; ");
            System.out.println("4) Giornata con più quintali raccolti;");
            System.out.println("5) Date sopra soglia;");
            System.out.println("6) Quintali in data;");
            System.out.println("0) Se vuoi si vuole uscire dal programma.");
            System.out.print(": ");
            scelta = input.nextInt();
            while (scelta < 0 || scelta > 6) {
                System.out.println("La scelta deve essere compresa tra 0 e 6");
                scelta = input.nextInt();
            }
            switch (scelta){
                case 0:
                    flag = true;
                    System.out.println("Arrivederci");
                    break;
                case 1:
                    System.out.println("Inserire giorno: ");
                    int giorno = input.nextInt();
                    System.out.println("Inserire mese: ");
                    int mese = input.nextInt();
                    System.out.println("Inserire anno: ");
                    int anno = input.nextInt();

                    d1 = new Data(giorno, mese, anno);

                    System.out.println("Inserire quintali: ");
                    double qq = input.nextDouble();

                    m2 = new GiornataRaccolta(d1, qq);
                    m1.aggiungiGiornata(m2);

                    System.out.println("Inserimento avvenuto con successo");
                    break;

                case 2:
                    System.out.println("Il totale del raccolto è: " + m1.totaleRaccolto());
                    break;

                case 3:
                    System.out.println("La media del raccolto è: " + m1.mediaGiornaliera());
                    break;

                case 4:
                    Data datamax;
                    double maxqq;
                    GiornataRaccolta gg;
                    gg = m1.massimaRaccolta();
                    datamax=gg.getData();
                    maxqq=gg.getQuintaliRaccolti();
                    System.out.println("La gionata: "+ datamax.toString()+" e sono stati raccolti: "+ maxqq);
                    break;

                case 5:
                    double soglia;
                    System.out.print("Inserire soglia: ");
                    soglia = input.nextDouble();
                    int gG, mm, aa;
                    gG = 0;
                    mm = 0;
                    aa = 0;

                    d1 = new Data(gG, mm, aa);
                    Data[]  array = new Data[m1.getnRaccolte()];
                    int dimLogArray = m1.dateSopraSoglia(soglia, array);
                    String output="-";
                    for(int i=0;i < dimLogArray;i++){
                        output = output+array[i].toString()+"-";
                    }
                    System.out.print(output);
                    break;

                case 6:
                    System.out.println("Inserire giorno: ");
                    int gior = input.nextInt();
                    System.out.println("Inserire mese: ");
                    int mes = input.nextInt();
                    System.out.println("Inserire anno: ");
                    int ann = input.nextInt();

                    double quintali;
                    d1 = new Data(gior, mes, ann);
                    quintali = m1.quintaliInData(d1);
                    System.out.print("I quintali nella data inserita sono: "+ quintali);
            }
        }
    }
}
