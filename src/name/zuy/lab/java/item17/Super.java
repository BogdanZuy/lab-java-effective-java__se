package name.zuy.lab.java.item17;

public class Super {
    // Broken - constructor invokes an overridable method
    public Super() {
        System.out.println("Super->constructor");
        overrideMe();
    }

    /**
     * Example of <b>super</b> class method desc<br />
     */
    public void overrideMe() {
        System.out.println("Super->overrideMe");
    }
}
