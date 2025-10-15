package Youtube.abhishekverma.Multithreading.demo1;

import Youtube.abhishekverma.Multithreading.demo0.EmployeeRepository;
import Youtube.abhishekverma.Multithreading.demo0.EmployeeRepositoryImpl2;
import Youtube.abhishekverma.Multithreading.demo0.EmployeeRespositoryImpl3;

public class demo2 {
    public static void main(String[] args) {
        EmployeeService employeeService=null;
        EmployeeRepository [] employeeRepositories={new EmployeeRepositoryImpl1(),new EmployeeRepositoryImpl2(),new EmployeeRespositoryImpl3()};
        Thread [] employeeServices=new Thread[employeeRepositories.length];

        long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+" started fetching");
        for (int i = 0; i < employeeRepositories.length; i++) {
            employeeService = new EmployeeService(employeeRepositories[i]);
            employeeServices[i] = employeeService;
            employeeServices[i].start();
        }

        for (int i = 0; i < employeeServices.length; i++) {
            try {
                employeeServices[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
        System.out.println(Thread.currentThread().getName() + " finished fetching");
    }
}
