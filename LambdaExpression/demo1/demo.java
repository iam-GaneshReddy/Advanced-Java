package Youtube.abhishekverma.LambdaExpression.demo1;

public class demo {
    public static void main(String[] args) {
       /* Operation operation=new Operation(){  //anonymous Inner class
            @Override
            public boolean isPositive(int num) {
                return num>0;
            }
        };*/

       /* Operation operation=num ->{ //lambda expression
                return num>0;
            };*/

        Operation operation=num ->num>0;    // Concise lambda expression
        System.out.println(operation.isPositive(0));

    }
}
