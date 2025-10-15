package Youtube.abhishekverma.LambdaExpression.demo4;
import java.util.*;
public class demo1 {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtill.populateEmployees();
        CustomComparator customComparator=new CustomComparator();

        System.out.println("Sort by name:");
        Collections.sort(employeeList, customComparator::compareByName);


        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println("Sort by marks:");
        Collections.sort(employeeList, customComparator::compareByMarks);


        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
