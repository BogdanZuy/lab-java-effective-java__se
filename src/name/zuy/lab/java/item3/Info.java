package name.zuy.lab.java.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Info {

    class SomeClass {
        public W01Mario w01Mario;
        public W02Mario w02Mario;

        public SomeClass(W01Mario mario) {
            w01Mario = mario;
        }

        public SomeClass(W02Mario mario) {
            w02Mario = mario;
        }
    }

    public Info() {

        System.out.println("Item 3: Enforce the singleton property with a private constructor or an enum type");


        System.out.println("Use public static final field or static factory method");

        SomeClass someClass = new SomeClass(W01Mario.INSTANCE);
        someClass.w01Mario.powerup();

        System.out.println(someClass.w01Mario.toString());
        System.out.println(W01Mario.INSTANCE.toString());

        someClass = null;

        System.gc();

        System.out.println(W01Mario.INSTANCE.toString());

        Constructor[] constructors = W01Mario.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        try {
            someClass = new SomeClass((W01Mario) constructor.newInstance(null));
            System.out.println(someClass.w01Mario.toString());
            System.out.println(W01Mario.INSTANCE.toString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("Use enum");
        System.out.println(W03Mario.INSTANCE.toString());
        W03Mario.INSTANCE.powerup();
        System.out.println(W03Mario.INSTANCE.toString());

        // TODO: What about serialization
        System.out.println("TODO: What about serialization");


    }

    public static void main(String... args) {

        new Info();

    }
}