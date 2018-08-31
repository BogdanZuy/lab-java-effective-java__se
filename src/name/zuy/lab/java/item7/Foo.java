package name.zuy.lab.java.item7;

import java.util.ArrayList;

public class Foo {

    private String title;
    private ArrayList<String> array;

    public Foo() {
        title = "Some text";
        array = new ArrayList<>();
    }

    public void init() {
        for(int i = 0; i < 1000000; i++)
            array.add(title);
    }

    public void terminate() {
        array = null;
    }
}
