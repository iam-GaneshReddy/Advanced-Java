package Youtube.abhishekverma.Collections.Map;

import java.util.HashMap;
import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Java");
        map.put(2, "Python");
        map.put(45, "C");

        Set<Integer> key=map.keySet(); //function which returns only keys
        for(Integer k:key)
            System.out.print(map.get(k)+" ");

        Collection<String> values = map.values();
        for (String value : values)
            System.out.println("Value of element is: " + value);
    }
}
