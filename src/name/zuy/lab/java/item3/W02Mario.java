package name.zuy.lab.java.item3;

public class W02Mario {

    private boolean isBig = false;

    private static final W02Mario INSTANCE = new W02Mario();
    private W02Mario() {}

    public static W02Mario getInstance() { return INSTANCE; }

    public void powerup() { isBig = true; }
    public void hit() {}
    public void die() {}
    public String toString() {
        return "Mario [isBig=" + String.valueOf(isBig) + "]";
    }
}
