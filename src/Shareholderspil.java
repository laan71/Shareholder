import java.util.ArrayList;

public class Shareholderspil
{
    ArrayList<Felt> felter = new ArrayList<Felt>(); // indeholder alle felter

    ArrayList<Spiller> spillere = new ArrayList<Spiller>();  // alle spillere

    int spillersTur = 0;

    public Shareholderspil()
    {
        felter.add(new Start(25000));
        felter.add(new Gade("Nærsk", 50000, 5000));
        felter.add(new Gade("Farsberg",60000, 6000));
        felter.add(new Gade("Bank",0, 0));   // "Du må handle med aktier" - funktion mangler
        felter.add(new Start(50000));   // + "valgfri aktie" - funktion mangler
        //    felter.add(new GazellePris(50000 + "valgfri aktie"));
        //    felter.add(new BetalSkat("Betal 25% af alle dine rede penge"));
        //    felter.add(new P_Kort("Træk et P Kort og følg instruksen"));
        //    felter.add(new Blindgyde("Du bliver frarøvet dine rede penge. Se reglerne i vejledningen"));
        felter.add(new Gade("Pang & Oluf", 40000, 4000));
        //    felter.add(new Bank("Du må handle med aktier"));
        felter.add(new Gade("Tabt tur", 0, 0));
        felter.add(new Gade("Danske Sank", 10000, 1000));
        //    felter.add(new Arv("Du arver 50000 fra din rige onkel"));
        felter.add(new Gade("Niels Fisker", 20000, 2000));
        //    felter.add(new Hvidvaskeriet("Modtag alle penge indbetalt til Skat));
        //    felter.add(new Y_Kort("Træk et Y Kort og følg instruksen"));
        felter.add(new Gade("Pear", 100000,10000));
        felter.add(new Gade("Microft",      90000,9000));
        //    felter.add(new Skattefusk("Du bliver taget i skattefusk. Betal halvdelen af dine rede penge"));
        felter.add(new Gade("Utryg", 30000,3000));
        felter.add(new Gade("Festas",      70000,7000));
        //    felter.add(new Bank("Du må handle med aktier"));
        felter.add(new Gade("ToyYoda",      10000,1000));
        //    felter.add(new BetalSkat("Betal 25% af alle dine rede penge"));
        //    felter.add(new P_Kort("Træk et P Kort og følg instruksen"));
        //   felter.add(new Blindgyde("Du bliver frarøvet dine rede penge. Se reglerne i vejledningen"));
        felter.add(new Gade("Kusine Ea",      70000,7000));
        //    felter.add(new Bank("Du må handle med aktier"));
        //    felter.add(new Arv("Ryk 4 felter tilbage"));
        felter.add(new Gade("WooKEA",      80000,8000));
        //    felter.add(new Arv("Tillykke med fødselsdagen. Modtag 5000 fra hver spiller"));
        felter.add(new Gade("Scandal", 20000,2000));
        felter.add(new Gade("Tæveli",      30000,3000));
        //    felter.add(new Y_Kort("Træk et Y Kort og følg instruksen"));
        felter.add(new Gade("Movo Mordisk", 110000,10000));
        felter.add(new Gade("S.E.S",      10000,1000));

    }
}
