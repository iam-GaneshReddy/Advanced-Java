package Youtube.abhishekverma.Streams.demo2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
//distinct,skip,limit,sorted-natural,custom(Comparator),map,flatmap
public class demo {
    public static void main(String[] args) {
        List<Employee> list=GeneratorUtil.populateEmployees();
        List<Employee> listEmployee=GeneratorUtil.populateEmployees2();

        //distinct->list.stream().distinct().forEach(System.out::println);
        //limit->list.stream().limit(2).forEach(System.out::println);
        //skip->list.stream().skip(2).forEach(System.out::println);

        listEmployee.stream().sorted().forEach(System.out::println);
        listEmployee.stream()
                .sorted( (e1, e2)->
                         e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);


        list.stream().map(employee->employee.getName()).forEach(System.out::println);

       Stream<List<Employee>> stream= Stream.of(list,listEmployee);
       stream.flatMap(list2->list2.stream())
               .map(employee->employee.getName())
               .forEach(System.out::println);

    }
}
