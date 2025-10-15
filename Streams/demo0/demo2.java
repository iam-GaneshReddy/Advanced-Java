package Youtube.abhishekverma.Streams.demo0;

import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        List<Employee> list=GenratorUtil.populateEmployees();
        list.stream()
                .filter(employee->employee.getMarks()>=60)
                .sorted(( o1,  o2)-> o1.getName().compareTo(o2.getName()))
                .forEach(employee-> System.out.println(employee));

        }
}
