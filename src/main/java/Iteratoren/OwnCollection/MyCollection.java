package Iteratoren.OwnCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {

    private ArrayList<Integer> zahlenreihe;

    public MyCollection(){

        zahlenreihe = new ArrayList<Integer>();

        zahlenreihe.add(1);
        zahlenreihe.add(3);
        zahlenreihe.add(5);
        zahlenreihe.add(7);

    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>(){

            private int pointer = 0;

            @Override
            public boolean hasNext(){

                return pointer < zahlenreihe.size();
            }

            public Integer next(){

                return zahlenreihe.get(pointer++);
            }
        };

    }
}
