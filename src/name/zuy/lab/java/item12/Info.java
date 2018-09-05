package name.zuy.lab.java.item12;

import java.util.ArrayList;
import java.util.Collections;

public class Info {

    public Info() {

        System.out.println("Item 12: Consider implementing Comparable.\n" +
                "The general contract of the compareTo method:\n" +
                "1) sgn(x.compareTo(y)) == -sgn(y.compareTo(x))\n" +
                "2) x.compareTo(y)>0&&y.compareTo(z)>0 then x.compareTo(z)>0\n" +
                "3) x.compareTo(y)==0 then sgn(x.compareTo(z)) == sgn(y.compareTo(z)) for all z\n" +
                "4) (x.compareTo(y)==0)==(x.equals(y))");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Character("Steve", 3));
        characters.add(new Character("Olivia", 2));
        characters.add(new Character("Bart", 8));

        System.out.println(characters.toString());

        Collections.sort(characters);

        System.out.println(characters.toString());



    }

    public static void main(String... args) {

        new Info();

    }

}
