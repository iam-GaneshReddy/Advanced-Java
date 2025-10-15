package Youtube.abhishekverma.LambdaExpression.demo4;
import java.util.*;

//Method Refrences
public class demo {
    public static void main(String[] args) {
        List<Employee>  list=GeneratorUtill.populateEmployees();
        System.out.println("sort by name");
        //Collections.sort(list, (  CustomComparator::compareByName));

        for(Employee e:list){
            System.out.println(e);
        }

        System.out.println("Sort by marks:");
     //   Collections.sort(list, ( CustomComparator::compareByMarks));


        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
