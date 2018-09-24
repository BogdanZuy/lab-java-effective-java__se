package name.zuy.lab.java.item17;

public class Info {
    public Info() {

        System.out.println("Item 17: Design and document for inheritance or else prohibit it.\n");
        System.out.println("Test your class by writing subclasses\n" +
                "Constructors must not invoke overridable methods\n" +
                "neither clone nor readObject may invoke an overridable method, directly or indirectly.\n" +
                "Prohibit subclassing in classes that are not designed and documented to be safely subclassed.\n" +
                "Ways:\n" +
                "1) Declare the class final\n" +
                "2) Make all constructors privare or package-private and add public static factories in place of the constructors");

        Sub sub = new Sub();
        sub.overrideMe();

    }

    public static void main(String... args) {

        new Info();

    }
}
