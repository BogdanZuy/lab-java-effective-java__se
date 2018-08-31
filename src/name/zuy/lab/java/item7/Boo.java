package name.zuy.lab.java.item7;

public class Boo extends Foo {

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("---Boo extended from Foo finalize");
        } finally {
            super.finalize();
        }
    }
}
