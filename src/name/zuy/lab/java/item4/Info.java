package name.zuy.lab.java.item4;

public class Info {

    public Info() {

        System.out.println("Item 4: Enforce noninstantiability with a private constructor");
        System.out.println("See java.lang.Math");
        System.out.println("    /**\n" +
                "     * Don't let anyone instantiate this class.\n" +
                "     */\n" +
                "    private Math() {}");
        System.out.println("Also it can \"throw\" be placed in constructor to prevent \"Accessible\" use");

    }

    public static void main(String... args) {

        new Info();

    }

}
