package name.zuy.lab.java.item10;

public class Info {

    public Info() {

        System.out.println("Item 10: Always override toString.\n" +
                "Providing a good toString implementation makes your class much more pleasant to use.");

        System.out.println("New point: " + new name.zuy.lab.java.item9.EPoint(1.0f, 2.0f));

        System.out.println("Whether or not you decide to specify the formant, you should clearly document your intentions.");
        System.out.println("Provide programmatic access to all of the information contained in the value returned by toString.");

        Character character = new Character("Severus");
        character.beMage();

        System.out.println("New character: " + character);
        System.out.println("Name: " + character.getName());
        System.out.println("Class: " + character.getCurrent_class());
        System.out.println("Level: " + character.getLevel());
    }

    public static void main(String... args) {

        new Info();

    }

}
