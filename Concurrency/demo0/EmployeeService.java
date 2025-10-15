package Youtube.abhishekverma.Concurrency.demo0;

public class EmployeeService implements Runnable{
    private EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository)
    {
        super();
        this.employeeRepository=employeeRepository;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" started Fetching");
        employeeRepository.displayEmployees();
        System.out.println(Thread.currentThread().getName()+" Finished Fetching");
    }
}
