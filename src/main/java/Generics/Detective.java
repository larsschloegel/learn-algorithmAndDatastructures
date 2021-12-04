package Generics;

public class Detective {
    private String name;

    public Detective(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void investigate() {
        System.out.println("investigate");
    }

}
