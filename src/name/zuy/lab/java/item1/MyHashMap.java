package name.zuy.lab.java.item1;

import java.util.HashMap;

public class MyHashMap<K, V> extends HashMap {
    public static <K, V> MyHashMap<K, V> newInstance() {
        return new MyHashMap<K, V>();
    }
}
