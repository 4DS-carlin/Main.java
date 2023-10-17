class RaccoltaMele {
    private GiornataRaccolta[]  giornateRaccolta;
    private int  nRaccolte;//dimLogica

    public RaccoltaMele(int nGiorni){ //eccezioni giorni <=0
        giornateRaccolta = new GiornataRaccolta[nGiorni];
        nRaccolte= 0;
    }

    public int getnRaccolte() {
        return nRaccolte;
    }

    public void aggiungiGiornata(GiornataRaccolta giornata){
        giornateRaccolta[nRaccolte] = giornata;
        nRaccolte++;
    }

    public double totaleRaccolto(){
        double sum = 0;
        for(int i = 0; i<nRaccolte; i++){
            sum += giornateRaccolta[i].getQuintaliRaccolti();
        }
        return sum;
    }

    public double mediaGiornaliera(){ //nRaccolte=0
        return totaleRaccolto()/nRaccolte;
    }

    public GiornataRaccolta massimaRaccolta(){ //array vuoto
        GiornataRaccolta max = giornateRaccolta[0];
        for(int i = 1; i<nRaccolte; i++){
            if(giornateRaccolta[i].getQuintaliRaccolti()>max.getQuintaliRaccolti()){
                max = giornateRaccolta[i];
            }
        }
        return max;
    }

    public int dateSopraSoglia(double soglia, Data[] arr){
        int j = 0;
        for(int i = 0; i<nRaccolte; i++){
            if(giornateRaccolta[i].getQuintaliRaccolti()>soglia){
                arr[j]= giornateRaccolta[i].getData();
                j++;
            }
        }
        return j;
    }

    public double quintaliInData(Data data){ //array vuoto
        int i = 0;
        while(!data.compare(this.giornateRaccolta[i].getData(), data)){
            i++; //modificare condizioni e ciclo
        }
        return giornateRaccolta[i].getQuintaliRaccolti();
    }
}