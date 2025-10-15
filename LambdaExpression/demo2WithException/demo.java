package Youtube.abhishekverma.LambdaExpression.demo2WithException;

public class demo {
    public static void main(String[] args) {
        Operation operation=new Operationalmpl();
        try{
          int result =  operation.divide(10,0);
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("cannot divide with zero");

        }
    }
}
