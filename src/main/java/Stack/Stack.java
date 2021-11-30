package Stack;

import java.util.ArrayList;

// Hier fehlt etwas
public class Stack<T> {

    ArrayList<T> stack = new ArrayList<>();

    public T pop() {
        // Gib das oberste Elemente zurück und entferne es vom Stack
        T lastElement = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return lastElement;
    }

    public void push(T item) {
        stack.add(item);// Füge das Element oben auf den Stack hinzu
    }

    @Override
    public String toString() {
        // Ausgabe der ArrayListe. Diese Methode muss nicht verändert werden
        return stack.toString();
    }

}
