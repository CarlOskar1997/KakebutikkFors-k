package Kakebutikk;

public class kakebutikk {
    public static void main (String[] args){
        Kunde kunde1 = new Kunde("Frode");
        Kunde kunde2 = new Kunde("Carl");
        Kunde kunde3 = new Kunde("Knut");
        System.out.println(kunde1.model_kundeID);
        System.out.println(kunde2.model_kundeID);
        System.out.println(Kunde.kunder); //Liten sjekk på om ID generator fungerer som ønsket
        //new Bestillinger("Frode", "Sjokoladekake");
        Bestillinger.kundeBestillinger(Bestillinger.listeoverbestillinger);
    }
}
