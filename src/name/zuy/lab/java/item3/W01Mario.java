package name.zuy.lab.java.item3;

public class W01Mario {

    private boolean isBig = false;

    public static final W01Mario INSTANCE = new W01Mario();
    private W01Mario() {
        // place here check to prevent new object creation
        System.out.println("new W01Mario");
    }

    public void powerup() { isBig = true; }
    public void hit() {}
    public void die() {}
    public String toString() {
        return "Mario [isBig=" + String.valueOf(isBig) + "]";
    }
}
