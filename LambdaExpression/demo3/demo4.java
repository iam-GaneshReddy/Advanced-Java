package Youtube.abhishekverma.LambdaExpression.demo3;

import java.io.IOException;
import java.util.function.BiFunction;

public class demo4 {
    public static void main(String[] args) {
        try {
            BiFunction<Integer, Integer, Integer> operation = (num1, num2) -> {
                try {
                    if (num2 == 0)
                        throw new IOException("cannot divide by zero");

                } catch (IOException exception) {
                    throw new RuntimeException(exception);
                }

                return num1 / num2;
            };
            System.out.println(operation.apply(10, 0));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
