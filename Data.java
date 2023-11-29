import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data
{
    private int dzien;
    private int miesiac;
    private int rok;

    /**
     * konstruktor klasy Data
     * @param dzien - dzien typu int
     * @param miesiac - misiac typu int
     * @param rok - rok typu int
     */
    public Data(int dzien,int miesiac,int rok)
    {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    /**
     * obliczenie różnicy dni datą wyjazdu a datą powrotu z wycieczki aby naliczyć rabat 10%
     * @param dataWyjazdu - obiekt klasy Data
     * @param dataPowrotu - obiekt klasy Data
     * @return - cena z rabatem lub bez
     */
    public static int obliczRozniceDni(Data dataWyjazdu, Data dataPowrotu)
    {
        LocalDate wyjazd = LocalDate.of(dataWyjazdu.getRok(),dataWyjazdu.getMiesiac(),dataWyjazdu.getDzien());
        LocalDate powrot = LocalDate.of(dataPowrotu.getRok(),dataPowrotu.getMiesiac(),dataPowrotu.getDzien());
        long roznicaDni = wyjazd.until(powrot,ChronoUnit.DAYS);
        return (int) roznicaDni;
    }

    /**
     * getter dnia
     * @return - dzien
     */
    public int getDzien()
    {
        return dzien;
    }

    /**
     * getter miesiąca
     * @return - miesiac
     */
    public int getMiesiac()
    {
        return miesiac;
    }

    /**
     * getter roku
     * @return - rok
     */
    public int getRok()
    {
        return rok;
    }
}
