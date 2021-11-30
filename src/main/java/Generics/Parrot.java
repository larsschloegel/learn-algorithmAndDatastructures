package Generics;

public class Parrot {
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void quack() {
        System.out.println("CraCra");
    }
}
