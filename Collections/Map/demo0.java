package Youtube.abhishekverma.Collections.Map;
import java.util.*;
public class demo0 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"c");
        map.put(2,"python");
        map.put(3,"java");
        System.out.println(map.size());
        System.out.println(map.get(2));//keys are passed
        System.out.println(map.containsKey(2));
        map.remove(2,"python");
        System.out.println(map);
        System.out.println(map.isEmpty());

    }
}
