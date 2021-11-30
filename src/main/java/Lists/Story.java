package Lists;

public class Story {

    public static void learnArraylist() {

        Box box1 = new Box("Büchsentomaten");
        Box box2 = new Box("Spaghetti");
        Box box3 = new Box("H-Milch");
        Box box4 = new Box("Knäckebrot");
        Box box5 = new Box("Mehl");

        Train train = new Train();

        train.simpleLoad(box1);
        train.simpleLoad(box2);
        train.simpleLoad(box3);
        train.simpleLoad(box4);
        train.simpleLoad(box5);

        System.out.println(train);

        train.unload();
        System.out.println(train);

        train.reverseLoad(box1);
        train.reverseLoad(box2);
        train.reverseLoad(box3);
        train.reverseLoad(box4);
        train.reverseLoad(box5);

        System.out.println(train);
    }

}
