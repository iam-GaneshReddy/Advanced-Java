package Youtube.abhishekverma.LambdaExpression.demo0;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Functional Interface -which takes always an parameter and return something
public class demo1 {
   /* public static void main(String[] args) {
        Function<Integer,Integer> operation = num->++num;
        int result=operation.apply(10);
        System.out.println(result);
    }*/

//Predicate Functional Interface which always return boolean.
    public static void main(String[] args) {
       /* Predicate<Integer> operation=num->num>0;
        System.out.println(operation.test(0));*/

        //Consumer Functional Interface-which takes an parameter return void
        /*Consumer<Integer> operation=num-> System.out.println("java version "+num);
        operation.accept(21);*/

        //Supplier Functional Interface -which returns something but takes no paramters
        Supplier<LocalDateTime> operation=()->LocalDateTime.now();
        LocalDateTime result=operation.get();
        System.out.println(result);
    }
}
