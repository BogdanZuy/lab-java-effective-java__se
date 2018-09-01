package name.zuy.lab.java.item8;

public class Info {

    public Info() {

        System.out.println("Item 8: Obey the general contract when overriding equals.\n" +
                "Each instance of the class is inherently unique\n" +
                "You don't care whether the class provides a \"logical equality\" test\n" +
                "A superclass has already overridden equals, and the superclass behavior is appropriate for this class\n" +
                "The class is private or package-private, and you are certain that its equals method will never be invoked\n" +
                "The equals method implements an equivalence relation. It is:\n" +
                "Reflexive: For any non-null reference value x, x.equals(x) must return true.\n" +
                "Symmetric: For any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true.\n" +
                "Transitive: For any non-null reference values x, y, z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) must return true.\n" +
                "Consistent: For any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.\n" +
                "For any non-null reference value x, x.equals(null) must return false.\n" +
                "Note: ho-ho, mathematics rules [Equivalence relation]");
        System.out.println("A recipe for a high-quality equals method:\n" +
                "Use the == operator to check if the argument is a reference to this object.\n" +
                "Use the instanceof operator to check if the argument has the correct type.\n" +
                "Cast the argument to the correct type.\n" +
                "For each \"significant\" field in the class, check if that field of the argument matches the corresponding field of this object.\n" +
                "At the end check Equivalence relations (use Unit tests)");
        System.out.println("Few final caveats:\n" +
                "Always override hashCode when you override equals\n" +
                "Don't try be too clever\n" +
                "Don't substitute another type for Object in the equals declaration");

        Point a = new Point(1.0f, 1.0f);
        Point b = new Point(1.0f, 1.0f);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if(a.equals(b))
            System.out.println("a equals b");
        else
            System.out.println("a not equals b");

        EPoint x = new EPoint(1.0f, 1.0f);
        EPoint y = new EPoint(1.0f, 1.0f);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        if(x.equals(y))
            System.out.println("x equals y");
        else
            System.out.println("x not equals y");

    }

    public static void main(String... args) {

        new Info();

    }

}
