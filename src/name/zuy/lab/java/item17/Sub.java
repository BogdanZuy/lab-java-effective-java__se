package name.zuy.lab.java.item17;

import java.util.Date;

public class Sub extends Super {
    private final Date date; // Blank final, set by constructor
    Sub() {
        System.out.println("Sub->constructor");
        date = new Date();
    }

    /**
     * {@inheritDoc}
     *
     * Overriding method invoked by superclass constructor
     */
    @Override
    public void overrideMe() {
        System.out.println("Sub->overrideMe");
        System.out.println(date);
    }
}
