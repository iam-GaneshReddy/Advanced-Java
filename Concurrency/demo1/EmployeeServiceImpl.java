package Youtube.abhishekverma.Concurrency.demo1;

import java.util.List;

public class EmployeeServiceImpl implements Runnable{
      private EmployeeRepository employeeRepository=null;
      public EmployeeServiceImpl(EmployeeRepository employeeRepository){
          super();
          this.employeeRepository=employeeRepository;
      }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" started fetching");
        List<Employee> employeeList=employeeRepository.fetchEmployees();
        System.out.println(Thread.currentThread().getName() +" finished fetching");

    }
}
