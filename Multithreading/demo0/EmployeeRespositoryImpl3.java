package Youtube.abhishekverma.Multithreading.demo0;

import java.util.ArrayList;
import java.util.*;

public class EmployeeRespositoryImpl3 implements EmployeeRepository {
    private static List<Employee> list=new ArrayList<>();
    static{
        list.add(new Employee(301,"mahesh"));
        list.add(new Employee(302,"suresh"));
        list.add(new Employee(303,"ramesh"));
        list.add(new Employee(304,"nagesh"));
    }
    public void displayEmployees(){
        for(Employee employeeDetails:list){
            System.out.println(employeeDetails);
        }
    }
    public String toString(){
        return "EmployeeRepositoryImpl3";
    }
}
