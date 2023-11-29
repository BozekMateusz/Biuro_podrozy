public class Klient
{
    private String imie;
    private String nazwisko;
    private int wiek;
    private String adres;

    /**
     * konstruktor klasy Klient
     * @param imie - imie typu String
     * @param nazwisko - nazwisko typu String
     * @param wiek - wiek typu int
     * @param adres - adres typu String
     */
    public Klient(String imie,String nazwisko,int wiek,String adres)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
    }

    /**
     * getter imienia klienta
     * @return - imie
     */
    public String getImie()
    {
        return imie;
    }

    /**
     * getter nazwiska klienta
     * @return - nazwisko
     */
    public String getNazwisko()
    {
        return nazwisko;
    }
    
    /**
     * getter adresu klienta
     * @return - adres
     */
    public String getAdres()
    {
        return adres;
    }

    /**
     * getter wieku klienta
     * @return - wiek
     */
    public int getwiek()
    {
        return wiek;
    }
}
