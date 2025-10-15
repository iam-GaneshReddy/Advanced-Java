package Youtube.abhishekverma.LambdaExpression.demo3;
import java.util.function.*;
public class Demo {
    public static void main(String[] args) {
        //BiFunction Functional Interface
      /*  BiFunction<Integer,Integer,String> operation=(num1,num2)-> {
            if (num1 > num2)
                return "Bigger";
            else return "sammler";
        };
        System.out.println(operation.apply(10,5));*/

        //BiPredicate Functional Interface
      /*  BiPredicate<Integer,Integer> operation=(num1,num2)->num1>num2;
        System.out.println(operation.test(10,5));*/

        //BiConsumer Functional Interface
        BiConsumer<Integer,String> operation=(num,str)->System.out.println(str+num);
        operation.accept(21,"Java current Version ");

    }
}
