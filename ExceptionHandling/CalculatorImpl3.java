package Youtube.abhishekverma.ExceptionHandling;

public class CalculatorImpl3 implements Calculator{
    @Override
    public void divide(Integer... array) {
        if(array[1]==0) {
            throw new NullPointerException();
        }
        int quotient=array[0]/array[1];
        System.out.println(quotient);

    }
}
