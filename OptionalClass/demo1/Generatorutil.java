package Youtube.abhishekverma.OptionalClass.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Generatorutil {
    private Generatorutil() {

    }

    public static List<Employee> populateEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Abhishek", 10, Optional.of(new Address(1, "Chandigarh"))));
        employeeList.add(new Employee(177, "Sneh", 55, Optional.of(new Address(2, "Kolkata"))));
        employeeList.add(new Employee(129, "John", 60, Optional.empty()));
        employeeList.add(new Employee(101, "Abhishek", 60, Optional.of(new Address(4, "New Delhi"))));
        employeeList.add(new Employee(153, "Robert", 74, Optional.empty()));
        employeeList.add(new Employee(102, "Yuvraj", 90, Optional.of(new Address())));
        return employeeList;
    }

    public static Employee populateEmployee() {
        return new Employee();
    }

    public static Address populateAddress() {
        return new Address();
    }

    public static Optional<Employee> fetchEmployeeByMarks(int marks) {
        return populateEmployees().stream().filter(employee -> employee.getMarks() == marks).findFirst();
    }
}
