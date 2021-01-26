/** En gade, der kan købes af en spiller og bebygges */
public class Gade extends Felt
{
    Spiller ejer;
    double aktiepris;
    double aktieudbytte;


    public Gade(String navn, double aktiepris, double aktieudbytte)
    {
        this.navn = navn;
        this.aktiepris = aktiepris;
        this.aktieudbytte = aktieudbytte;

    }

    public void landet(Spiller sp)
    {
        sp.besked("Du er landet på "+ navn);

        if (sp==ejer)
        {	                                        // eget felt
            sp.besked("Det er din egen grund");

        }
        else if (ejer==null)
        {	                                        // ingen ejer grunden, køb den?
            if (sp.konto > aktiepris)
            {
                if (sp.spørgsmål("købe "+ navn+ " for "+ aktiepris))
                {
                    sp.transaktion( -aktiepris);
                    ejer=sp;
                }
            }
            else sp.besked("Du har ikke penge nok til at købe "+ navn);
        }
        else
        {	                                        // felt ejes af anden spiller
            double aktieudbytte = this.aktieudbytte;
            sp.besked("Betal aktieudbytte til ejere: "+aktieudbytte);
            sp.betal(ejer, aktieudbytte);                   // spiller betaler til ejeren
        }
    }
}
