package Schleifen;

import Schleifen.Detective;

import java.util.ArrayList;

//Duke möchte wissen, wie viele Tomaten es im Lager gibt.
//Hilf ihm und schreibe die Methode countTomatoes() in der Klasse Detective.
//Die Methode soll als Argument eine ArrayList<String> entgegen nehmen. Als Rückgabewert soll zurückgegeben werden, wie oft der String “Tomate” in der übergebenen ArrayList vorkommt.

public class Story {

    public static void learnSchleifen() {
        Detective duke = new Detective();
        ArrayList<String> items = new ArrayList<String>();
        items.add("Hammer");
        items.add("Salat");
        items.add("Tomate");
        int tomatoes = duke.countTomatoes(items);
        System.out.println("Es gibt " + tomatoes + " Tomate(n).");
    }

}
