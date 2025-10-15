package Youtube.abhishekverma.Streams.demo3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
//Converting streams to arrays,list,set,map,Grouping By,Partioning By
public class demo {
    public static void main(String[] args) {
        System.out.println("Converting stream to array:");
        List<Employee> array=Generatorutil.populateEmployees();
//stream will cpoi the each object into array
        Employee [] e=array.stream().toArray(Employee []::new);
        for(Employee employee:e) {
            //  System.out.println(employee);
        }

        List<Employee> list=array.stream().collect(Collectors.toList());
       // list.forEach(System.out::println);

        Set<Employee> set=array.stream().collect(Collectors.toSet());
       // set.forEach(System.out::println);

        Map<Integer,Employee> map=array.stream()
                .collect(Collectors.toMap(Employee::getId, employee->employee,(e1, e2)->e2));

         //map.entrySet().forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));

         //Grouping By
        Map<Integer,List<Employee>>  map1=array.stream()
                .collect(Collectors.groupingBy(Employee::getId,Collectors.toList()));
        map1.entrySet().forEach(System.out::println);


        //partioning by
        Map<Boolean,List<Employee>>  map2=array.stream()
                .collect(Collectors.partitioningBy(employee->employee.getMarks()>=60));
        map2.entrySet().forEach(System.out::println);



    }
}
