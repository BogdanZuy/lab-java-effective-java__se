package name.zuy.lab.java.item16;

import java.util.*;

public class Info {
    public Info() {

        System.out.println("Item 16: Favor composition over inheritance.\n");

        InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<>();
        instrumentedHashSet.add("Apple");
        System.out.println("Count after add 1 element: " + instrumentedHashSet.getAddCount());
        instrumentedHashSet.addAll(Arrays.asList("Blueberry", "Blackberry", "Cherry"));
        System.out.println("Count after addAll 3 elements: " + instrumentedHashSet.getAddCount());

        InstrumentedSet<String> instrumentedSet = new InstrumentedSet<>(new HashSet<>());
        instrumentedSet.add("Apple");
        System.out.println("Count after add 1 element: " + instrumentedSet.getAddCount());
        instrumentedSet.addAll(Arrays.asList("Blueberry", "Blackberry", "Cherry"));
        System.out.println("Count after addAll 3 elements: " + instrumentedSet.getAddCount());

    }

    public static void main(String... args) {

        new Info();

    }
}
