public class BenytShareholderspil {

    public static void main(String[] arg)
    {
        Shareholderspil spil = new Shareholderspil();
        spil.spillere.add(new Spiller("Søren",500000));   // opret spiller Søren
        spil.spillere.add(new Spiller("Gitte",500000));   // opret spiller Gitte
        spil.spillere.add(new Spiller("Mads",500000));   // opret spiller Mads
        spil.spillere.add(new Spiller("Mette",500000));   // opret spiller Mette

        // løb gennem 20 runder (40 ture)
        for (spil.spillersTur=0; spil.spillersTur<50; spil.spillersTur++)
        {
            // tag skiftevis Søren, Gitte, Mads og Mette (% er forklaret i afsnit Fejl: Henvisningskilde ikke fundet)
            Spiller sp = spil.spillere.get(spil.spillersTur % spil.spillere.size());
            int slag = (int)(Math.random()*6)+1;     // og slå et terningkast (1-6)
            System.out.println("***** "+ sp.navn +" på felt "+ sp.feltnr +" slår "+ slag);

            for (int i=1; i<=slag; i=i+1)                  // nu rykkes der
            {
                // gå til næste felt. Hvis vi når over antal felter så tæl fra 0
                sp.feltnr = sp.feltnr + 1;
                if (sp.feltnr == spil.felter.size()) sp.feltnr=0;
                Felt felt = spil.felter.get(sp.feltnr);

                if (i<slag) felt.passeret(sp); // kald passeret() på passerede felter
                else felt.landet(sp);          // kald landet() på sidste felt
                try { Thread.sleep(300); } catch (Exception e) {} // vent 0.3 sek
            }
            try { Thread.sleep(3000); } catch (Exception e) {} // tur slut, vent 3 sek
        }
    }
}


