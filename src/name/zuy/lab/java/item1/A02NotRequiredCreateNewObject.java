package name.zuy.lab.java.item1;

public class A02NotRequiredCreateNewObject {

    public static void info() {

        // Boolean valueOf return only TRUE or FALSE where
        // TRUE is static final new Boolean(true) and
        // FALSE is static final new Boolean(false)
        // so it's create only two objects at all
        // and Boolean.valueOf(true) == Boolean.valueOf("true")
        Boolean boolFromB = Boolean.valueOf(true);
        Boolean boolFromS = Boolean.valueOf("true");

        if (boolFromB == boolFromS) {
            System.out.println("Boolean.valueOf(true) == Boolean.valueOf(\"true\") Always equal!");
        } else {
            System.out.println("This code never used");
        }

    }

}
