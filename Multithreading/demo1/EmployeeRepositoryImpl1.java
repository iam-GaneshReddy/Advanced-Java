package Youtube.abhishekverma.Multithreading.demo1;

import Youtube.abhishekverma.Multithreading.demo0.Employee;
import Youtube.abhishekverma.Multithreading.demo0.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl1  implements EmployeeRepository {
    private static List<Employee> list=new ArrayList<>();

    static{
        list.add(new Employee(101,"ganesh"));
        list.add(new Employee(102,"rakesh"));
        list.add(new Employee(103,"madhu"));
        list.add(new Employee(104,"suresh"));

    }
    @Override
    public void displayEmployees() {
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
        return "EmployeeRepositoryImpl1";
    }
}
