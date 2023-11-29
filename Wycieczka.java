public class Wycieczka 
{
    private Data dataWyjazdu;
    private Data dataPrzyjazdu;

    private Czas czasWyjazdu;
    private Czas czasPrzyjazdu;

    private String cel;
    private String opis;

    private int liczbaMiejsc;
    private double cena;  

    /**
     * konstruktorm klasy Wycieczka
     * @param cel - cel wycieczki typu String
     * @param opis - opis wycieczki typu String
     * @param dataWyjazdu - data wyjazdu typu Data
     * @param dataPrzyjazdu - data przyjazdu typu Data
     * @param czasWyjazdu - czas wyjazdu typu Czas
     * @param czasPrzyjazdu - czas przyjazdu typu Czas
     * @param liczbaMiejsc - liczba miejsc typu int
     * @param cena - cena typu double
     */
    public Wycieczka(String cel,String opis,Data dataWyjazdu,Data dataPrzyjazdu,Czas czasWyjazdu,Czas czasPrzyjazdu,int liczbaMiejsc,double cena)
    {
        this.dataWyjazdu = dataWyjazdu;
        this.dataPrzyjazdu = dataPrzyjazdu;
        this.czasWyjazdu = czasWyjazdu;
        this.czasPrzyjazdu = czasPrzyjazdu;
        this.cel = cel;
        this.opis = opis;
        this.liczbaMiejsc = liczbaMiejsc;
        this.cena = cena;
    }

    /**
     * getter daty wyjazdu
     * @return - dataWyjazdu
     */
    public Data getDataWyjazdu()
    {
        return dataWyjazdu;
    }

    /**
     * getter daty przyjazdu
     * @return - dataPrzyjazdu
     */
    public Data getDataPrzyjazdu()
    {
        return dataPrzyjazdu;
    }

    /**
     * getter czasu wyjazdu
     * @return - czasWyjazdu
     */
    public Czas getCzasWyjazdu()
    {
        return czasWyjazdu;
    }

    /**
     * getter czasu przyjazdu
     * @return - czasPrzyjazdu
     */
    public Czas getCzasPrzyjazdu()
    {
        return czasPrzyjazdu;
    }

    /**
     * getter celu wycieczki
     * @return - cel wycieczki
     */
    public String getCel()
    {
        return cel;
    }

    /**
     * getter opisu wycieczki
     * @return - opis wycieczki
     */
    public String getOpis()
    {
        return opis;
    }

    /**
     * getter liczby miejsc
     * @return - liczbaMiejsc 
     */
    public int getLiczbaMiejsc()
    {
        return liczbaMiejsc;
    }
    
    /**
     * getter ceny wycieczki
     * @return - cena wycieczki
     */
    public double getCena()
    {
        return cena;
    }
}
