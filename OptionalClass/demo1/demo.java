package Youtube.abhishekverma.OptionalClass.demo1;

import java.util.Optional;

public class demo {
    public static void main(String[] args) {
        Optional<Employee> optionalEmployee = Generatorutil.fetchEmployeeByMarks(10);
          System.out.println(optionalEmployee);

    //    optionalEmployee.filter(employee -> employee.getAddress().isPresent())
              //  .stream().findAny()
               // .ifPresentOrElse(System.out::println, () -> System.out.println("no match found"));

     //   optionalEmployee.map(Employee::getName).
           //     ifPresentOrElse(System.out::println, () -> System.out.println("no match found"));

        /*Optional<Optional<Address>> optionalOptionalAddress = optionalEmployee.map(Employee::getAddress);
        System.out.println(optionalOptionalAddress);

        Optional<Address> optionalAddress = optionalOptionalAddress.map(Optional::get);
        System.out.println(optionalAddress);

        Optional<String> optionalCity = optionalAddress.map(Address::getCity);
        optionalCity.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));

         */

        optionalEmployee.flatMap(Employee::getAddress)
                .or(()->Optional.of(Generatorutil.populateAddress()))
         .map(Address::getCity).
                ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));


        optionalEmployee.stream().forEach(System.out::println);
    }
}
