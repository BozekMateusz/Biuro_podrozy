public class Raporty
{
    /**
     * wyświetlanie sumy zakupionych wycieczek poprzez zsumowanie ich cen
     * @param wykupioneWycieczki - tablica WykupionaWycieczka z wykupionymi wycieczkami
     */
    public static void sumaZakupionychWycieczek(WykupionaWycieczka[] wykupioneWycieczki)
    {
        double suma = 0;
        for(WykupionaWycieczka wycieczka:wykupioneWycieczki)
        {
            suma += wycieczka.getCena();
        }
        System.out.println("Suma zakupionych wycieczek: " + suma);
        System.out.println("----------------");
    }

    /**
     * wyświwetlenie informacji o wycieczkach poprzez pobranie informacji o nich
     * @param wycieczki - tablica Wycieczka z wycieczkami
     */
    public static void informacjeOWycieczkach(Wycieczka[] wycieczki)
    {
        System.out.println("-----Informacje o wycieczkach-----");
        for(Wycieczka wycieczka:wycieczki)
        {
            System.out.println("Cel: " + wycieczka.getCel());
            System.out.println("Opis: " + wycieczka.getOpis());
            System.out.println("Cena: " + wycieczka.getCena());

            System.out.println("Data wyjazdu: " + wycieczka.getDataWyjazdu().getDzien() + "/" + wycieczka.getDataWyjazdu().getMiesiac() + "/" + wycieczka.getDataWyjazdu().getRok());
            System.out.println("Data przyjazdu: " + wycieczka.getDataPrzyjazdu().getDzien() + "/" + wycieczka.getDataPrzyjazdu().getMiesiac() + "/" + wycieczka.getDataPrzyjazdu().getRok());
            
            System.out.println("Czas wyjazdu: " + wycieczka.getCzasWyjazdu().getGodzina() + ":" + wycieczka.getCzasWyjazdu().getMinuta() + ":" + wycieczka.getCzasWyjazdu().getSekunda());
            System.out.println("Czas przyjazdu: " + wycieczka.getCzasPrzyjazdu().getGodzina() + ":" + wycieczka.getCzasPrzyjazdu().getMinuta() + ":" + wycieczka.getCzasWyjazdu().getSekunda());
            
            System.out.println("----------------------");
        }
    }

    /**
     * wyświwietlanie wycieczek danego klienta
     * @param wykupioneWycieczki - tablica WykupionaWycieczka z wykupionymi wycieczkami
     * @param klienci  - tablica Klient z klientami
     */
    public static void wycieczkiDanegoKlienta(WykupionaWycieczka[] wykupioneWycieczki,Klient[] klienci)
    {
        //tablica typu double która będzie przechowywać kwoty wycieczek
        double[] kwotyWykupionychWycieczek = new double[wykupioneWycieczki.length];

        System.out.println("-----Wycieczki dla danego klienta-----");
        for (int i = 0; i < wykupioneWycieczki.length; i++) {
            //pobranie klienta i kwoty dla każdej wykupionej wycieczki
            WykupionaWycieczka wycieczka = wykupioneWycieczki[i];
            Klient klient = wycieczka.getKlient();
            double kwota = wycieczka.getCena();
            
            //dodanie kwoty wycieczki do tablicy kwotyWykupionychWycieczek
            kwotyWykupionychWycieczek[i] = kwota;

            System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko() + ":");
            System.out.println("Wszystkie wycieczki: " + kwota);
            System.out.println("----------------");
        }
    }

    /**
     * wyświetlenie klienta z największą wydaną kwotą
     * @param wykupioneWycieczki - tablica WykupionaWycieczka z wykupionymi wycieczkami
     * @param klienci - tablica Klient z klientami
     */
    public static void klientNajwiekszaKwota(WykupionaWycieczka[] wykupioneWycieczki,Klient[] klienci)
    {
        //tablica obiektów Klient która przyjmuje jako rozmiar dlugosc tablicy wykupioneWycieczki
        Klient[] wycieczkiKlienta = new Klient[wykupioneWycieczki.length];
        //tablica typu double która przyjmuje jako rozmiar dlugosc tablicy wykupioneWycieczki
        double[] kwotyWycieczek = new double[wykupioneWycieczki.length];
        //tablica typu double która przyjmuje jako rozmiar dlugosc tablicy wykupioneWycieczki
        double[] maksymalnaKwota = new double[wykupioneWycieczki.length];
        //zmienna typu Klient która będzie przechowywać klienta z największą kwotą
        Klient klientZNajwiekszaKwota = null;
        //przejście przez tablice wykupioneWycieczki
        for (int i = 0; i < wykupioneWycieczki.length; i++) {
            //pobranie klienta i kwoty dla każdej wycieczki
            WykupionaWycieczka wycieczka = wykupioneWycieczki[i];
            Klient klient = wycieczka.getKlient();
            double kwota = wycieczka.getCena();
            //wycieczki klienta
            wycieczkiKlienta[i] = klient;
            //kwota wycieczek
            kwotyWycieczek[i] = kwota;
            //sprawdzenie czy kwota wycieczki jest większa od dotychczasowej maksymalnej kwoty dla danej pozycji w tablicy
            //jeśli tak to aktualizowana jest wartość maksymalnaKwota[i], a klient (klientZNajwiekszaKwota) ustawiany jest na szukanego klienta
            if (kwota > maksymalnaKwota[i]) {
                maksymalnaKwota[i] = kwota;
                klientZNajwiekszaKwota = klient; 
            }
        }
        //przejście przez tablice wykupioneWycieczki
        for (int i = 0; i < wykupioneWycieczki.length; i++) {
            Klient klient = wycieczkiKlienta[i];
            //jeśli klient w danej iteracji tej pętli jest równy klientZNajwiekszaKwota, wypisywane są imię i nazwisko tego klienta,
            if (klient == klientZNajwiekszaKwota) {
                System.out.println("Klient z największą zapłaconą kwotą: " + klient.getImie() + " " + klient.getNazwisko());
                break;
            }
        }
        System.out.println("----------------");
    }
}