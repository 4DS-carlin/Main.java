public class GiornataRaccolta {
    private Data data;
    private double qqRaccolti;

    public GiornataRaccolta(Data gg, double qq){
        data = new Data(gg.getDay(),gg.getMonth(),gg.getYear());
        qqRaccolti = qq;
    }

    public Data getData () {
        return data;
    }

    public double getQuintaliRaccolti () {
        return qqRaccolti;
    }
}
