package name.zuy.lab.java.item15;

public class Info {

    public Info() {

        System.out.println("Item 15: Minimize mutability.\n" +
                "Rules to make a class immutable:\n" +
                "1. Don't provide any methods that modify the object's state (mutators)\n" +
                "2. Ensure that the class can't be extended.\n" +
                "3. Make all fields final.\n" +
                "4. Make all fields private.\n" +
                "5. Ensure exclusive access to nay mutable components. (Make defensive copies in constructors, accessors, and readObject methods)\n" +
                "Main disadvantage of immutable classes is that they require a separate object for each distinct value.\n" +
                "If a class cannot be made immutable, limit its mutability as much as possible.");

        Complex test = Complex.I.multiply(Complex.I);

        System.out.println("i*i=" + test);

    }

    public static void main(String... args) {

        new Info();

    }

}

