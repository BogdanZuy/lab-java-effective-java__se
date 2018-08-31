package name.zuy.lab.java.item7;

public class Info {

    public Info() {

        System.out.println("Item 7: Avoid finalizers");
        System.out.println("Finalizers are unpredictable, often dangerous, and generally unnecessary.");
        System.out.println("It can take arbitrarily long between the time that an object becomes unreachable and the time that its finalizer is executed.");
        System.out.println("A severe performance penalty for using finalizers");
        System.out.println("Provide and explicit termination method");
        System.out.println("Explicit termination methods are typically used in combination with the try-finally construct to ensure termination.");

        Foo foo = new Foo();
        try {
            foo.init();
        } finally {
            foo.terminate();
        }

        System.out.println("If a subclass implementor overrides a superclass finalizer but forgets to invoke it, hte superclass finalizer will never be invoked.");
        System.out.println("Some other method is Finalizer Guardian idiom");

        Boo boo = new Boo();
        boo.init();
        boo = null;
        System.gc();

        FooFG fooFG = new FooFG();
        fooFG = null;
        System.gc();

        System.out.println("...");

    }
}
