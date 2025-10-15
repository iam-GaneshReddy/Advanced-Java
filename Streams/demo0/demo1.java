package Youtube.abhishekverma.Streams.demo0;

//using forEach Method
import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        List<Employee> employeeList = GenratorUtil.populateEmployees();
        System.out.println("---INPUT---");
        employeeList.forEach( System.out::println);

        System.out.println("---OUTPUT---");
        // Perform below tasks using Lambda but without using Method Reference and Stream
        // Filter only those employees whose marks are more than equal to 60
        // Sort these employees on ascending order of their names
        // Print these employees
        List<Employee> filteredList = new ArrayList<>();
        employeeList.forEach(employee -> {
            if (employee.getMarks() >= 60) {
                filteredList.add(employee);
            }
        });
        Collections.sort(filteredList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        filteredList.forEach( System.out::println);
    }
}
