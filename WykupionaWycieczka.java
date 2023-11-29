public class WykupionaWycieczka
{
    private Data dataZakupu;
    private Klient klient;
    private Wycieczka wycieczka;

    private int wypelnienieTransportu;
    private double cena;

    /**
     * konstruktor klasy WykupionaWycieczka
     * @param klient - klient wycieczki typu Klient
     * @param wycieczka - wycieczka typu Wycieczka
     * @param dataZakupu -dataZakupu typu Data
     * @param wypelnienieTransportu - wypelnienieTransportu typu int
     */
    public WykupionaWycieczka(Klient klient,Wycieczka wycieczka,Data dataZakupu,int wypelnienieTransportu)
    {
        this.dataZakupu = dataZakupu;
        this.klient = klient;
        this.wycieczka = wycieczka;
        this.wypelnienieTransportu = wypelnienieTransportu;
        obliczRabat();
    }

    private void obliczRabat()
    {
        int roznicaDni = Data.obliczRozniceDni(wycieczka.getDataPrzyjazdu(), wycieczka.getDataWyjazdu());
        double rabat = wycieczka.getCena() * 0.1;
        if(roznicaDni<=30)
        {
            cena = wycieczka.getCena()-rabat;
        }
        else
        {
            cena = wycieczka.getCena();
        }
    }

    /**
     * getter daty zakupu wycieczki
     * @return - dataZakupu
     */
    public Data getDataZakupu()
    {
        return dataZakupu;
    }

    /**
     * getter klienta
     * @return - klient
     */
    public Klient getKlient()
    {
        return klient;
    }

    /**
     * getter wycieczki
     * @return - wycieczka
     */
    public Wycieczka getWycieczka()
    {
        return wycieczka;
    }

    /**
     * getter wypełnienia transportu
     * @return - wypelnienieTransportu
     */
    public int getWypelnienieTransportu()
    {
        return wypelnienieTransportu;
    }

    /**
     * getter ceny wycieczki
     * @return - cena
     */
    public double getCena()
    {
        return cena;
    }
}
