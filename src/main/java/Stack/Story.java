package Stack;

public class Story {

    public static void learnStacksWithGenerics(){
        // Dieser Stack muss noch angepasst werden
        Stack<String> train = new Stack();

        System.out.println(train);
        train.push("Lok");
        System.out.println(train);
        train.push("Endbahnhof-1");
        System.out.println(train);
        train.push("Endbahnhof-2");
        System.out.println(train);
        train.push("Pfadfinder-1");
        System.out.println(train);
        train.push("Pfadfinder-2");
        System.out.println(train);
        train.push("Pfadfinder-3");

        System.out.println(train);
        train.pop();
        System.out.println(train);
        train.pop();
        System.out.println(train);
        train.pop();
        System.out.println(train);
    }

}
