package Youtube.abhishekverma.Collections.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class demo3 {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>();
        set.add(new Employee(20, "Harry"));
        set.add(new Employee(10, "Tom"));
        set.add(new Employee(50, "Dick"));

        System.out.println("---DEFAULT---");
        System.out.println("Contents of set are: " + set);

        System.out.println("---SORT BY NAME---");
        Set<Employee> set2 = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        set2.addAll(set);
        System.out.println("Contents of set are: " + set2);
    }
}
