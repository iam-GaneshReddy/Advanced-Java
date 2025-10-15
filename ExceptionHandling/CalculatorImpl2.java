package Youtube.abhishekverma.ExceptionHandling;

public class CalculatorImpl2 implements Calculator {
    @Override
    public void divide(Integer... array) {
        int quotient = 0;
       /* try {
            quotient = array[0] / array[1];
            System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Minimum 2 arguments are needed");
        }*/
       /* try {
            quotient = array[0] / array[1];
            System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
        }  catch (ArithmeticException exception) {
            System.out.println("Cannot divide " + array[0] + " by " + array[1]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Minimum 2 arguments are needed");
        } catch(Exception exception) {
            System.out.println("Something went wrong : " + exception.getMessage());
        }*/

        //Multi Catch Block
        try {
            quotient = array[0] / array[1];
            System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("Either arithmetic or array index exception");}
    catch (Exception exception) {
            System.out.println("Something went wrong : " + exception.getMessage());
        }
    }
}
