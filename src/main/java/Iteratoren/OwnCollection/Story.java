package Iteratoren.OwnCollection;

import java.util.Iterator;

public class Story {

    public static void learnOwnIterator() {

        Iterator<Integer> it = new MyCollection().iterator();

        for(Integer i: new MyCollection()){
            System.out.println(i);

        }
    }
}
