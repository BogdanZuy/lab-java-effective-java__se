package name.zuy.lab.java.item3;

public enum W03Mario {

    INSTANCE;

    private boolean isBig = false;

    public void powerup() { isBig = true; }
    public void hit() {}
    public void die() {}
    public String toString() {
        return "Mario [isBig=" + String.valueOf(isBig) + "]";
    }

}
