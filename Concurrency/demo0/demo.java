package Youtube.abhishekverma.Concurrency.demo0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started fetching");
              EmployeeService employeeService;
              EmployeeRepository [] employeeRepositories={new EmployeeRepositoryImpl1(),
                      new EmployeeRepositoryImpl2(),new EmployeeRepositoryImpl3()};

        long startTime = System.currentTimeMillis();
        //ExecutorService executorService = Executors.newSingleThreadExecutor();//single thread allocated
        //ExecutorService executorService=Executors.newFixedThreadPool(3);//dynamic thread allocation
        ExecutorService executorService=Executors.newCachedThreadPool();//threads will allocate automatically based
        //upon program
        for (int i = 0; i < employeeRepositories.length; i++) {
            employeeService = new EmployeeService(employeeRepositories[i]);
            executorService.execute(employeeService);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
        System.out.println(Thread.currentThread().getName() + " finished fetching");
    }

    }

