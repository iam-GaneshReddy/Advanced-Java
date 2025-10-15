package Youtube.abhishekverma.Collections.List;
// methods of list
import java.util.*;

public class demo0 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //System.out.println(list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(list);
        //System.out.println(list.get(0));
       list.set(1,5);
        System.out.println("Before sorting");
        System.out.println(list);
        Collections.sort(list); //it uses natural ordering comparable-compare to method
        System.out.println("after sorting");
        System.out.println(list);

        //System.out.println(list.contains(1));
        list.clear();
        System.out.println(list.isEmpty());

        List<Integer> list2= Arrays.asList(10,11,12,13,14);
        list.addAll(list2);

      //  System.out.println(list);

        System.out.println(list.indexOf(1));//it takes object if element not there it gives -1

        //list.add(10,11);
        System.out.println(list);
        System.out.println(list.get(4));
    }
}
