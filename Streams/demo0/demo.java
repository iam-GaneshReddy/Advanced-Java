package Youtube.abhishekverma.Streams.demo0;
import java.util.*;
public class demo {
    public static void main(String[] args) {
        List<Employee> list=GenratorUtil.populateEmployees();
        // Perform below tasks without using Lambda, Method Reference and Stream
        // Filter only those employees whose marks are more than equal to 60
        // Sort these employees on ascending order of their names
        // Print these employees
        List<Employee> filteredList=new ArrayList<>();
        for(Employee employee:list){
            if(employee.getMarks()>0)
                filteredList.add(employee);
        }
        /*Collections.sort(filteredList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

//By lambdas  Collections.sort(filteredList, (e1, e2)-> e1.getName().compareTo(e2.getName()));

   Collections.sort(filteredList,CustomComparator::compareByNames);

      filteredList.forEach( System.out::println);

    }
}
