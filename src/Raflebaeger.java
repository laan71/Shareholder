import java.util.ArrayList;

public class Raflebaeger
{
    /** listen af terninger, der er i raflebaegeret */
    public ArrayList<Terning> terninger;

    public Raflebaeger(int antalTerninger)
    {
        terninger = new ArrayList<Terning>();
        for (int i=0; i<antalTerninger; i++)
        {
            Terning t;
            t = new Terning();
            terninger.add(t);
        }
    }

    /** lægger en terning i bægeret */
    public void tilfoejTerning(Terning t)
    {
        terninger.add(t);
    }

    /** ryster bægeret, så alle terningerne bliver 'kastet' og får en ny værdi */
    public void ryst()
    {
        for (Terning t : terninger)
        {
            t.kast();
        }
    }

    /** finder summen af alle terningernes værdier */
    public int sum()
    {
        int resultat;
        resultat = 0;
        for (Terning t : terninger)
        {
            int terningensVaerdi = t.getVaerdi();
            resultat = resultat +  terningensVaerdi;
        }
        return resultat;
    }

    /** finder antallet af terninger, der viser en bestemt værdi */
    public int antalDerViser(int vaerdi)
    {
        int resultat=0;
        for (Terning t : terninger)
        {
            int terningensVaerdi = t.getVaerdi();
            if (terningensVaerdi==vaerdi)
            {
                resultat = resultat + 1;
            }
        }
        return resultat;
    }

    /** beskriver bægerets indhold som en streng */
    public String toString()
    {// (listens toString() kalder toString() pÃ¥ hver terning)
        return terninger.toString();
    }
}


