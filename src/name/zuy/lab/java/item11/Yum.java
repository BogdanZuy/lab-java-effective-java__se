package name.zuy.lab.java.item11;

public class Yum implements Cloneable {

    private class Yummy {

        public int level = 0;

        Yummy(int level) {
            this.level = level;
        }

        @Override
        public String toString() {
            return "Yummy{" +
                    "level=" + level +
                    '}';
        }
    }

    private int size = 0;
    private Yummy yummy = null;

    public Yum() {
    }

    public Yum(int size, int level) {
        this.size = size;
        this.yummy = new Yummy(level);
    }

    public Yum(Yum yum) {
        this.size = yum.size;
    }

    public void setLevel(int level) {
        if (yummy != null)
            yummy.level = level;
    }


    @Override
    public Yum clone() {
        try {
            return (Yum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static Yum newInstance(Yum yum) {
        Yum result = new Yum();
        result.size = yum.size;
        return result;
    }

    @Override
    public String toString() {
        return "Yum{" +
                "size=" + size +
                ", yummy=" + yummy +
                '}';
    }
}
