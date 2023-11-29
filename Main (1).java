import java.util.Random;
import java.lang.reflect.Array;

public class Main 
{
    /**
     * metoda która rozszerza tablice i rzutuje ją na konkretny typ danych
     * @param <T> - typ generyczny, obsługa różnych typów danych
     * @param tablica - tablica do rozszerzenia
     * @param nowyElement - element który zostanie dodany do nowej tablicy
     * @param typ - obiekt klasy który reprezentuje typ elementów  tablicy
     * @return - nowa rozszerzona tablica
     */
    public static <T> T[] rozszerzTablice(T[] poprzedniaTablica, T nowyElement, Class<T> typ) {
        int rozszerzenie = poprzedniaTablica.length + 1;
    
        // utworzenie nowej tablicy z nową długością i podanym typem
        @SuppressWarnings("unchecked")
        T[] nowaTablica = (T[]) Array.newInstance(typ, rozszerzenie);
    
        // kopiowanie zawartości oryginalnej tablicy do nowej
        System.arraycopy(poprzedniaTablica, 0, nowaTablica, 0, poprzedniaTablica.length);
    
        // dodanie nowego elementu na koniec tablicy
        nowaTablica[rozszerzenie - 1] = nowyElement;
    
        // zwrócenie nowej tablicy
        return nowaTablica;
    }
    public static void main(String[] args) throws Exception
    {
        Wycieczka[] wycieczki = new Wycieczka[0];

        wycieczki = rozszerzTablice(wycieczki,new Wycieczka("Praga", "Wycieczka do Pragi",new Data(8,11,2023), 
        new Data(15,11,2023), 
        new Czas(8,35,12), 
        new Czas(17,40,45),120,2590.1),Wycieczka.class);

        wycieczki = rozszerzTablice(wycieczki,new Wycieczka("Czechy", "Wycieczka do Czech",new Data(2,9,2022), 
        new Data(12,9,2022), 
        new Czas(10,0,0), 
        new Czas(17,50,25),100,2500.2),Wycieczka.class);

        wycieczki = rozszerzTablice(wycieczki,new Wycieczka("Francja", "Wycieczka do Francji",new Data(1,9,2023), 
        new Data(9,9,2023), 
        new Czas(11,15,7), 
        new Czas(17,50,25),85,2100.0),Wycieczka.class);

        wycieczki = rozszerzTablice(wycieczki,new Wycieczka("Berlin", "Wycieczka do Berlina",new Data(17,8,2023), 
        new Data(27,8,2023), 
        new Czas(9,15,23), 
        new Czas(17,20,5),155,2500.0),Wycieczka.class);

        wycieczki = rozszerzTablice(wycieczki,new Wycieczka("Tajwan", "Wycieczka do Tajwanu",new Data(1,6,2023), 
        new Data(11,6,2023), 
        new Czas(10,5,43), 
        new Czas(23,27,25),55,1550.5),Wycieczka.class);

        wycieczki = rozszerzTablice(wycieczki,new Wycieczka("Londyn", "Wycieczka do Londynu",new Data(22,5,2022), 
        new Data(29,5,2022), 
        new Czas(12,30,30), 
        new Czas(20,45,30),205,2760.2),Wycieczka.class);

        wycieczki = rozszerzTablice(wycieczki,new Wycieczka("Tokyo", "Wycieczka do Tokyo",new Data(15,3,2022), 
        new Data(22,3,2022), 
        new Czas(11,45,20), 
        new Czas(21,30,25),45,2960.3),Wycieczka.class);

        //tablica klienci (10 klientów):
        Klient[] klienci = new Klient[0];
        klienci = rozszerzTablice(klienci, new Klient("Marcin", "Borowy", 17,"Jagiellońska-13"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Witold", "Marczewski",23, "Ligota-3"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Michał", "Górski",19, "al. Zalewski 99b"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Mariusz", "Nowak", 43,"wyb. Płonka 60"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Łukasz", "Sobczak", 27,"pl. Skiba 94"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Patryk", "Krupa",26, "rynek Niedzielski 47c"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Kuba", "Brzeziński",29, "bulw. Mierzejewski 07c"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Mateusz", "Zalewski",34, "wyb. Pakuła 78c"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Kacper", "Cieślak",32, "rondo Osiński 12"),Klient.class);
        klienci = rozszerzTablice(klienci, new Klient("Szymon", "Zieliński",30, "ogród Czapla 75a"),Klient.class);

        //tablica wykupione wycieczki:
        Random random = new Random();
        int dzien = random.nextInt(1, 31);
        int miesiac = random.nextInt(1, 12);
        int rok = random.nextInt(2020,2024);
        int wypelnienieTransportu = random.nextInt(1,160);
        
        WykupionaWycieczka[] wykupioneWycieczki = { new WykupionaWycieczka(klienci[0], wycieczki[0],new Data(dzien,miesiac,rok),wypelnienieTransportu)};
        
        //wypełnienie tablicy wykupioneWycieczki dwudziestoma losowymi wycieczkami i klientami:
        for(int i = 0;i<19;i++)
        {
            int Klient = random.nextInt(0,klienci.length-1);
            int Wycieczka = random.nextInt(0,wycieczki.length-1);
           
            wykupioneWycieczki = rozszerzTablice(wykupioneWycieczki,new WykupionaWycieczka(klienci[Klient], 
            wycieczki[Wycieczka], new Data(dzien, miesiac,rok),wypelnienieTransportu),WykupionaWycieczka.class);
        }
        System.out.println("---Raporty---");
        Raporty.informacjeOWycieczkach(wycieczki);
        Raporty.sumaZakupionychWycieczek(wykupioneWycieczki);
        Raporty.wycieczkiDanegoKlienta(wykupioneWycieczki, klienci);
        Raporty.klientNajwiekszaKwota(wykupioneWycieczki, klienci);
    }
}
