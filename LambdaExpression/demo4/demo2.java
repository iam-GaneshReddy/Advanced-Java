package Youtube.abhishekverma.LambdaExpression.demo4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Method Refrences-
public class demo2 {
    public static void main(String[] args) {
        List<Employee> employeeList=GeneratorUtill.populateEmployees();
        List<String> employeeNames=GeneratorUtill.populateNames(employeeList);

        Collections.sort(employeeNames, String::compareTo);
        System.out.println(employeeNames);
    }
}
