package Youtube.abhishekverma.ExceptionHandling;

public class CalculatorImpl implements Calculator{
    @Override
    public void divide(Integer... array) {
        int quotient =0;
        try {
            quotient = array[0] / array[1];
            System.out.println("quotient of "+array[0]+" "+array[1]+" is "+quotient);
        }
        catch(ArithmeticException exception)
        {
           System.out.println(exception);
           // System.out.println(exception.getMessage());
           // exception.printStackTrace();
            System.out.println("cannot divide by zero provide another integer");

        }
    }
}
