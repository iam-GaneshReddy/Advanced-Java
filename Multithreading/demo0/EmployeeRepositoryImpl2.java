package Youtube.abhishekverma.Multithreading.demo0;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl2 implements EmployeeRepository {

    private static List<Employee> list=new ArrayList<>();

    static{
        list.add(new Employee(201,"Mahesh"));
        list.add(new Employee(202,"Budatha"));
        list.add(new Employee(203,"madhu"));
        list.add(new Employee(204,"Balli"));

    }
    @Override
    public void displayEmployees() {
        for(Employee employeeDetails:list){
            System.out.println(employeeDetails);
        }
    }
    public String toString(){
        return "EmployeeRepositoryImpl2";
    }

    }

