package name.zuy.lab.java.item13;

import java.util.Arrays;

public class Info {

    public Info() {

        System.out.println("Item 13: Minimize the accessibility of classes and members.\n" +
                "Main rule is: make each class or member as inaccessible as possible.\n" +
                "private - the member is accessible only from the top-level class where it is declared.\n" +
                "package-private - the member is accessible from any class in the package where it is declared. Technically known as default access, this is the access level you get if no access modifier is specified.\n" +
                "protected - the member is accessible from subclasses of the class where it is declared and from any class in the package where it is declared.\n" +
                "public - the member is accessible from anywhere.\n" +
                "Instance fields should never be public; classes with public mutable fields are not thread-safe.\n" +
                "It is wrong for a class to have public static final array field, or an accessor that returns such a field.");

        System.out.println(Arrays.toString(SomeClass.ACTIONS));

        SomeClass.ACTIONS[1] = "Hacked";

        System.out.println(Arrays.toString(SomeClass.ACTIONS));

        System.out.println(Arrays.toString(SomeClass.getAbilities()));

        System.out.println(SomeClass.abilities.toString());

    }

    public static void main(String... args) {

        new Info();

    }

}
