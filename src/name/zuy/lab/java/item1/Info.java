package name.zuy.lab.java.item1;

public class Info {
    public static void main(String... args) {
        System.out.println("Item 1: Consider static factory methods instead of constructors");

        A01HaveNames.info();
        A02NotRequiredCreateNewObject.info();
        A03ReturnObjectOfAnySubtype.info();

        D01BeSubclassed.info();
        D02AreNotReadilyDistinguishableFromOtherStaticMethods.info();

    }
}
