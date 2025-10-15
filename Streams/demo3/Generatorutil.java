package Youtube.abhishekverma.Streams.demo3;



import java.util.ArrayList;
import java.util.List;

public class Generatorutil {
    private Generatorutil() {

    }

    public static List<Employee> populateEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Abhishek", 10));
        employeeList.add(new Employee(177, "Sneh", 55));
        employeeList.add(new Employee(129, "John", 60));
        employeeList.add(new Employee(101, "Abhishek", 60));
        employeeList.add(new Employee(153, "Robert", 44));
        employeeList.add(new Employee(102, "Yuvraj", 90));
        return employeeList;
    }
}
