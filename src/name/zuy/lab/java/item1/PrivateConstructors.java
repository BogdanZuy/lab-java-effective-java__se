package name.zuy.lab.java.item1;

public class PrivateConstructors {
    private PrivateConstructors() {}

    public static PrivateConstructors newInstance() { return new PrivateConstructors(); };
}
