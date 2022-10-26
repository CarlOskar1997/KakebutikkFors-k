package Kakebutikk;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public class Kunde {
    long model_kundeID;
    String model_navn;

    static ArrayList <String> kunder = new ArrayList<>(); //Lager en liste med alle kundene

    private static long kundeID = 0;
    public static synchronized String lagid() {
        return String.valueOf(kundeID ++); //Metode for å automatisk lage ny ID når ny kunde registrerer seg
    }
    //Laget metode for å oppdatere kundeID automatisk
    public Kunde(String navn){
        lagid(); //Kjører ID generator
        model_kundeID = kundeID;
        model_navn = navn;
        kunder.add(model_navn); //Legger til i listen over kunder
    }
}
