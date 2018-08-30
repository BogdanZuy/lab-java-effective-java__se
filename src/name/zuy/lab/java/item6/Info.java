package name.zuy.lab.java.item6;

import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class Info {

    public Info() {

        System.out.println("Item 6: Eliminate obsolete object references");
        System.out.println("Nulling out object references should be the exception rather than the norm.");
        System.out.println("Whenever a class manages its own memory, the programmer should be alert for memory leaks.");
        System.out.println("Another common source of memory leaks is caches.");

        LinkedHashMap linkedHashMap = new LinkedHashMap() {
            private static final int MAX_ENTRIES = 2;

            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > MAX_ENTRIES;
            }

        };

        linkedHashMap.put("somekey", 1);
        System.out.println(linkedHashMap);
        linkedHashMap.put("somekey2", 2);
        System.out.println(linkedHashMap);
        linkedHashMap.put("somekey3", 3);
        System.out.println(linkedHashMap);
        linkedHashMap.put("somekey4", 4);
        System.out.println(linkedHashMap);

        System.out.println("Third common source of memory leaks is listeners and other callbacks.");
        // TODO: add examples fot listeners and callbacks

        ListDataListener ldl = new ListDataListener() {
            public void intervalAdded(ListDataEvent e) {
                System.out.println("Added: " + e);
            }
            public void intervalRemoved(ListDataEvent e) {
                System.out.println("Removed: " + e);
            }
            public void contentsChanged(ListDataEvent e) {
                System.out.println("Changed: " + e);
            }
        };
        WeakListModel model = new WeakListModel();
        model.addListDataListener(ldl);
        model.addElement("Steve Bobs");
        model.addElement("Will Jates");
        model.addElement("Mr. Smith");
        model.addElement("Anna Polson");
        model.removeElement("Mr. Smith");
        ldl = null;
        System.gc();
        model.addElement("Scoty");
        System.out.println(model);


    }

    public static void main(String... args) {

        new Info();

    }

}
