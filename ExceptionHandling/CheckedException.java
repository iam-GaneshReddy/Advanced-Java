package Youtube.abhishekverma.ExceptionHandling;

import java.io.IOException;
//demo 5
public class CheckedException implements Calculator{
    @Override
    public void divide(Integer... array) throws IOException {
/*
        if(array[1]==0)
            throw new IOException("cannot divide by zero");
         int quotient=array[0]/array[1];
        System.out.println(quotient);
        */
        if (array[1] == 0) {
            throw new NullPointerException("Cannot divide " + array[0] + " by " + array[1]);
        }
      int quotient = array[0] / array[1];
        System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);

    }
}
