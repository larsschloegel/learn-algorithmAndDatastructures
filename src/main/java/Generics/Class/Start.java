package Generics.Class;

public class Start {

    public static void learnGenericsWitClasses(){
        Queue stringQueue = new Queue();
        Queue<String> myQueue = new Queue<>();
        Queue<Integer> myIntQueue = new Queue<>();

        System.out.println(myQueue);
        System.out.println(myIntQueue);
    }
}
