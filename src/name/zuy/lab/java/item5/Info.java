package name.zuy.lab.java.item5;

public class Info {

    public Info() {

        System.out.println("Item 5: Avoid creating unnecessary objects");
        System.out.println("Reuse objects if it possible");

        // Boxed primitives
        long startTime = System.nanoTime();
        Long sum = 0L;
//        for (long i = 0; i < Integer.MAX_VALUE; i++) {
//            sum += i;
//        }
        long endTime   = System.nanoTime();
        long totalTime1 = endTime - startTime;
        System.out.println(totalTime1);
        System.out.println(sum);

        // Primitives
        startTime = System.nanoTime();
        long sumlong = 0L;
//        for (long i = 0; i < Integer.MAX_VALUE; i++) {
//            sumlong += i;
//        }
        endTime   = System.nanoTime();
        long totalTime2 = endTime - startTime;
        System.out.println(totalTime2);
        System.out.println(sumlong);
        System.out.println("Primitives faste boxed primitives in " + totalTime1/totalTime2 + "");
        System.out.println("Prefer primitives to boxed primitives, and watch out for unintentional autoboxing");


    }

    public static void main(String... args) {

        new Info();

    }

}
