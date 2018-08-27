package name.zuy.lab.java.item2;

public class Info {

    public Info() {
        System.out.println("Item 2: Consider a builder when faced with many constructor parameters");

        BuilderPattern.info();

    }

    public static void main(String... args) {

        new Info();

    }
}
