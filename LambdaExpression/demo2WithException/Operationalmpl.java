package Youtube.abhishekverma.LambdaExpression.demo2WithException;

import java.io.IOException;

public class Operationalmpl implements Operation{
    @Override
    public int divide(int num1, int num2) throws IOException {
       if(num2==0)
           //throw new NullPointerException(); //runtime exceptions are handled by using Try-catch-finally blocks
           throw new IOException();
       else
           return num1/num2;
    }
}
