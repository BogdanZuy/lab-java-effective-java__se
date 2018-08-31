package name.zuy.lab.java.item7;

public class FooFG {
    private final Object finalizerGuardian = new Object() {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("---Finalizer Guardian called");
        }
    };

}
