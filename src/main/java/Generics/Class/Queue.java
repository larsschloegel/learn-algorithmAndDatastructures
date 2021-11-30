package Generics.Class;

import java.util.ArrayList;

//Queue without Generics accept only Typ of ArrayList
public class Queue<T> {

    ArrayList<T> queue = new ArrayList<>();

    public T dequeue(){
        return queue.remove(0);
    }

    public void enqueue(T item){
        queue.add(item);
    }
}
