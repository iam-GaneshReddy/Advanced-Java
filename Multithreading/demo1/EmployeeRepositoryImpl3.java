package Youtube.abhishekverma.Multithreading.demo1;

import Youtube.abhishekverma.Multithreading.demo0.Employee;
import Youtube.abhishekverma.Multithreading.demo0.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl3 implements EmployeeRepository {
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
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public String toString(){
        return "EmployeeRepositoryImpl3";
    }
}
