package name.zuy.lab.java.item14;

public class Info {

    public Info() {

        System.out.println("Item 14: In public classes, use accessor methods, not public fields.\n" +
                "If a class is accessible outside its package, provide accessor methods.\n" +
                "If a class is package-private or is a private nested class, there is nothing inherently wrong wit exposing its data fields");

        Time time = new Time(23, 59);

        System.out.println("Hour: " + time.hour);
        System.out.println("Minute: " + time.minute);

    }

    public static void main(String... args) {

        new Info();

    }

}
