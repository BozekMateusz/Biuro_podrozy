public class Czas
{
    private int godzina;
    private int minuta;
    private int sekunda;

    /**
     * konstruktor klasy Czas
     * @param godzina - godzina typu int
     * @param minuta - minuta typu int
     * @param sekunda - sekunda typu int
     */
    public Czas(int godzina, int minuta,int sekunda)
    {
        this.godzina = godzina;
        this.minuta = minuta;
        this.sekunda = sekunda;
    }

    /**
     * getter godziny
     * @return - godzina
     */
    public int getGodzina() {
        return godzina;
    }

    /**
     * getter minuty
     * @return - minuta
     */
    public int getMinuta() {
        return minuta;
    }

    /**
     * getter sekundy
     * @return - sekunda
     */
    public int getSekunda() {
        return sekunda;
    }   
}
