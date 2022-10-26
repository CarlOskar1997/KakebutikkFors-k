package Kakebutikk;

import java.util.List;

public class Kake {
    String model_typeKake;
    String model_leveringsTid;
    String model_kundeID;
    public void kake(String typeKake, String leveringsTid, String kundeID){
        //List <String> kaketyper = new List<>();
        //kaketyper.add("Sjokolade");
        //kaketyper.add("Bløtkake");
        //kaketyper.add("Kransekake"); // Vil lage en sjekk på om kunder bestiller riktig type kake
        //for (i:kaketyper){
           // if i not in kaketyper{ //Feil logikk for Java
             //   System.out.println("Selger ikke denne type kake");
            //}
           // else{
              //  System.out.println("Bestillingen din er lagt til");
           // }
        //}
        model_kundeID = kundeID; //Lager kundeID for å kunne knytte kaken opp mot den som bestiller.
        model_leveringsTid = leveringsTid;
        model_typeKake = typeKake;
        //Vil lage noen attributter som viser hvilke egenskaper kaken har.
    }
}
