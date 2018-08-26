package name.zuy.lab.java.item1;

import java.math.BigInteger;
import java.util.Random;

// Factory Method have names
public class A01HaveNames {

    public static void info() {

        // all constructors of BigInteger are private (1.8)
        // two Factory Methods available with names
        BigInteger bigIntegerF = BigInteger.probablePrime(10, new Random());
        BigInteger bigIntegerC = BigInteger.valueOf(10);

        System.out.println("You can use smart names of constructors, BigInteger.probablePrime or BigInteger.valueOf from BigInteger");

    }


}
