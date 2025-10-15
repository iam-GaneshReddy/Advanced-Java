package Youtube.abhishekverma.ExceptionHandling;

import java.io.IOException;

//demo6
public class CalculatorImpl4 implements Calculator{
    @Override
    public void divide(Integer... array) throws IOException {
        int quotient=0;
        CustomResource customResource=new CustomResource();
        CustomResouce2 customResouce2=new CustomResouce2();
        try(customResource;customResouce2) {     //try-with-resources
            if (array[1] == 0) {
                throw new ArithmeticException("cannot divide by zero");
            }
            quotient=array[0]/array[1];
            System.out.println(quotient);
            customResource.process();
        }
        catch(Exception exception){
            System.out.println("Exception handled in " + this.getClass() + " is " + exception.getMessage());
            throw exception;
        }//finally {
          //  System.out.println("Print this always");}
        //customResource.close();
        }

    }


