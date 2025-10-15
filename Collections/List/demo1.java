package Youtube.abhishekverma.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        //Iterating through lists
        for(int i=0;i<list.size();i++){
            //System.out.println(i + list.get(i));
        }
        for(Integer l:list) {
            //  System.out.println(l);
        }
        Iterator<Integer> listIterator= list.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }

        /*while (listIterator.hasPrevious())
            System.out.println("Value of element is: " + listIterator.previous());
            */

    }
}
