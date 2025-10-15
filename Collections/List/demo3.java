package Youtube.abhishekverma.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(10,"ganesh"));
        list.add(new Employee(209,"madhu"));
        list.add(new Employee(33,"lohith"));
        list.add(new Employee(4,"sudhan"));
        /*Collections.sort(list,new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();

            }
        });*/
       /* Collections.sort(list,new Comparator<Employee>() {  //anonymous inner class
            public int compare (Employee o1, Employee o2){
         return o1.getName().compareTo(o2.getName());
            }
        } );*/
        Collections.sort(list,new CustomComparator());
        System.out.println(list);
        }
}
