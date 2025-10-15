package Youtube.abhishekverma.LambdaExpression.demo4;

public class CustomComparator {
     public int compareByName(Employee e1,Employee e2){
         return e1.getName().compareTo(e2.getName());
     }
     public  int compareByMarks(Employee o1,Employee o2){
         return o1.getMarks()-o2.getMarks();
     }

}
