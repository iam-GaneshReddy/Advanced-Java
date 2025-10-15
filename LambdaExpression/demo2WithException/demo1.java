package Youtube.abhishekverma.LambdaExpression.demo2WithException;

import java.io.IOException;

public class demo1 {
    public static void main(String[] args) {
        try {
            Operation operation = (num1,  num2)->  {
                    if(num2==0) throw new IOException("cannot divide with zero");
                    else return num1/num2;
            };
            System.out.println(operation.divide(10,0));
        }
        catch(IOException exception){
            System.out.println(exception);
        }
    }
}
