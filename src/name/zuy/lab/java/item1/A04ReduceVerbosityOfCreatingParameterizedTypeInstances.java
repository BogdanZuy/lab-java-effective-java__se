package name.zuy.lab.java.item1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A04ReduceVerbosityOfCreatingParameterizedTypeInstances {

    public static void info() {

        // not actual for JRE over 1.6
        Map<String, List<String>> m = new HashMap<String, List<String>>();
        Map<String, List<String>> i = MyHashMap.newInstance();

        System.out.println("Not actual for JRE over 1.6, can be use <>");

    }
}
