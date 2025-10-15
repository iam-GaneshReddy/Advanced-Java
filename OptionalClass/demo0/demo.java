package Youtube.abhishekverma.OptionalClass.demo0;

import java.util.Optional;
//get,orElse,orElseGet,orElseThrow
public class demo {
    public static void main(String[] args) {
        Optional<Employee> optional=GeneratorUtil.fetchEmployeeByMarks(60);
        System.out.println(optional);
       System.out.println(optional.orElse(new Employee()));
       // System.out.println(optional.orElse(GeneratorUtil.populateEmployee2()));
       // System.out.println(optional.orElseGet(()->GeneratorUtil.populateEmployee2()));
       // System.out.println(optional.get());

        try{
          Employee employee=  optional.orElseThrow(()->new RuntimeException("not found"));
            System.out.println(employee);

        }
        catch(Exception e) {
            System.out.println(e);
        }
        if(optional.isPresent())
            System.out.println(optional.get());
        
        if(optional.isEmpty())
          System.out.println("provide some value");

        optional.ifPresentOrElse(System.out::println,()-> System.out.println("not present"));

        Optional<Employee> employee =Optional.ofNullable(GeneratorUtil.populateEmployee2());
        employee.ifPresentOrElse(System.out::println,()-> System.out.println("not present"));

        Optional<Employee> employee2 =Optional.empty();
        employee2.ifPresentOrElse(System.out::println,()-> System.out.println("not present"));

    }
}
