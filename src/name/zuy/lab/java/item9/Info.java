package name.zuy.lab.java.item9;

public class Info {

    public Info() {

        System.out.println("Item 9: Always override hashCode when you override equals.\n" +
                "You MUST override hashCode in every class that overrides equals.\n" +
                "Equal objects must have equal hash codes." +
                "A recipe for hashCode:\n" +
                "1. Store some constant nonzero value, say, 17, in an int variable called result.\n" +
                "2. For each significant field f in your object (each field taken into account by the equals method, that is), do the following:\n" +
                "a. Compute an int hash code c for the field:\n" +
                "i. If the field is a boolean, compute (f?1:0).\n" +
                "ii. If the field is a byte, char, short, or int, compute (int) f.\n" +
                "iii. If the field is a long, compute (int) (f ^ (f>>>32)).\n" +
                "iv. If the field is a float, compute Float.floatToIntBits(f).\n" +
                "v. If the fields is a double, compute Double.doubleToLongBits(f), and then do step 2.a.iii.\n" +
                "vi. If the field is an object reference and this class's equals method " +
                "compares the field by recursively invoking equals, recursively " +
                "invoke hashCode on the field. If a more complex comparison is " +
                "required, compute a \"canonical representation\" for this field and " +
                "invoke hashCode on the canonical representation. If the value of the " +
                "field is null, return 0 ( or some other constant, but 0 is traditional).\n" +
                "vii. If the field is an array, treat it as if each element were a separate field." +
                "That is, compute a hash code for each significant element by applying" +
                "these rules recursively, and combine these values per step 2.b. If every" +
                "element in an array field is significant, you can use one of the " +
                "Arrays.hashCode methods added in release 1.5.\n" +
                "b. Combine the hash code c computed in step 2.a into result as follows:\n" +
                "result = 31 * result + c;\n" +
                "3. Return result.\n" +
                "4. When you are finished writing the hashCode method, ask yourself whether" +
                "equal instances have equal hash codes. Write unit tests to verify your intuition!" +
                "If equal instances have unequal hash codes, figure out why and fix the problem.\n" +
                "-\n" +
                "Do not be tempted to exclude significant parts of an object from the hash code computation to improve performance.");
    }

    public static void main(String... args) {

        new Info();

    }

}
