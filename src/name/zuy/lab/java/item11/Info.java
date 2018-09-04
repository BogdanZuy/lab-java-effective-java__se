package name.zuy.lab.java.item11;

public class Info {

    public Info() {

        System.out.println("Item 11: Override clone judiciously.\n" +
                "If you override the clone method in a nonfinal class, you should return an object obtained by invoking super.clone.\n" +
                "In practice, a class that implements Cloneable is expected to provide a properly functioning public clone method.\n" +
                "Never make the client do anything the library can do for the client\n" +
                "The clone architecture is incompatible with normal use of final fields referring to mutable objects.\n" +
                "Fine approach to object copying is to provide a copy constructor or copy factory");

        Yum yum = new Yum(5, 9);
        Yum yum_clone1 = new Yum(yum);
        Yum yum_clone2 = Yum.newInstance(yum);
        Yum yum_clone3 = yum.clone();

        System.out.println("Original: " + yum);
        System.out.println("Copy constructor: " + yum_clone1);
        System.out.println("Copy factory : " + yum_clone2);
        System.out.println("Clone : " + yum_clone3);

        yum.setLevel(13);

        System.out.println("Level change in original");

        System.out.println("Original: " + yum);
        System.out.println("Copy constructor: " + yum_clone1);
        System.out.println("Copy factory : " + yum_clone2);
        System.out.println("Clone : " + yum_clone3);

    }

    public static void main(String... args) {

        new Info();

    }

}
