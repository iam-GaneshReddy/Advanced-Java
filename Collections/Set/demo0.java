package Youtube.abhishekverma.Collections.Set;

import java.util.*;

public class demo0 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set.size());
        set.remove(Integer.valueOf(2));
        System.out.println(set.contains(1));
        set.clear();
        System.out.println(set.isEmpty());
        List<Integer> list=Arrays.asList(11,12,13,14);
        set.addAll(list);
        Collections.sort(list);

        for(int i=0;i<set.size();i++){
           // System.out.println(i);
        }
        for(Integer s:set){
            System.out.print(s);
        }
        Iterator<Integer> iterator= set.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next());
            }



    }
}
