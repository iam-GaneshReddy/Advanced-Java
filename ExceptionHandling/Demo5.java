package Youtube.abhishekverma.ExceptionHandling;

import java.io.IOException;

//checked exception
public class Demo5 {
    public static void main(String[] args)  {
        CheckedException calculator=new CheckedException();
        try {
            System.out.println("---SCENARIO 1---");
            calculator.divide(10, 2);
            System.out.println("---SCENARIO 2---");
            calculator.divide(10,0);
        } catch (Exception exception) {
            System.out.println("Something went wrong : " + exception);
        }
    }
}
