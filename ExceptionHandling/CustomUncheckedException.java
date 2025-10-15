package Youtube.abhishekverma.ExceptionHandling;

class DivisionByOddNumber extends RuntimeException{
   public DivisionByOddNumber(){
        super();
    }
    public DivisionByOddNumber(String msg){
        super(msg);
    }

}
public class CustomUncheckedException {
    public static int divideByEven(int number,int divisor){
        if(divisor%2!=0)
            throw new DivisionByOddNumber("divisor must be even");
        int quotient=number/divisor;
        return quotient;
    }
    public static void main(String[] args) {
        try{
           int result= divideByEven(10,5);
            System.out.println(result);

        }
        catch(DivisionByOddNumber e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
