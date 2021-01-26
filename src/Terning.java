/** En klasse der beskriver 6-sidede terninger */
public class Terning
{
    /** antallet af øjne på den side på terningen, der vender opad lige nu */
    private int vaerdi;

    /** konstruktor der opretter en terning */
    public Terning()
    {
        // vælg en tilfældig side til at starte med
        vaerdi = (int) (Math.random() * 6 + 1);
    }

    /** kaster terningen, så den får en anden værdi */
    public void kast()
    {
        // vælg en tilfældig side
        double tilfaeldigtTal = Math.random();
        vaerdi = (int) (tilfaeldigtTal * 6 + 1);
    }

    /** Aflæser terningens værdi */
    public int getVaerdi()
    {
        return vaerdi;
    }

    /** Sætter terningens værdi */
    public void setVaerdi(int nyVaerdi)
    {
        vaerdi = nyVaerdi;
    }

    /** giver en beskrivelse af terningen som en streng */
    public String toString()
    {
        String svar = ""+vaerdi;  // værdi som streng, f.eks. "4"
        return svar;
    }
}

