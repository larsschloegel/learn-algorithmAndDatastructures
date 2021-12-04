package Iteratoren;

import java.util.ArrayList;

//Um neuen Platz zu schaffen, sollen alle alten Tomaten aus dem Lager gebracht werden. Dazu möchte Duke aus der vorhandenen ArrayList alle enthaltenen Tomaten entfernen. Hilf ihm dabei und ergänze die Methode removeTomatoes.
//Die Methode soll als Argument eine ArrayList<String> entgegen nehmen. Diese soll dabei so abgeändert werden, dass alle Strings mit dem Wert “Tomate” aus der übergebenen Liste entfernt werden.
public class Story {

    public static void learnIterator() {
        Detective duke = new Detective();
        ArrayList<String> items = new ArrayList<String>();
        items.add("Hammer");
        items.add("Salat");
        items.add("Tomate");
        duke.removeTomatoes(items);
        System.out.println(items);
    }
}
