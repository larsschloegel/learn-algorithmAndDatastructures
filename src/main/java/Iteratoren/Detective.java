package Iteratoren;

import java.util.ArrayList;
import java.util.Iterator;

public class Detective {
    public void removeTomatoes(ArrayList<String> items) {

        Iterator<String> it = items.iterator();
        while(it.hasNext()){
            String item = it.next();
            if (item.equals("Tomate")){
                it.remove();
            }
        }
    }
}
