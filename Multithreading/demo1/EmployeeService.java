package Youtube.abhishekverma.Multithreading.demo1;

import Youtube.abhishekverma.Multithreading.demo0.EmployeeRepository;

public class EmployeeService extends Thread{
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started fetching from : " + employeeRepository);
        employeeRepository.displayEmployees();
        System.out.println(Thread.currentThread().getName() + " finished fetching from : " + employeeRepository);
    }
}
