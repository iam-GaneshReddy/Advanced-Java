package Youtube.abhishekverma.LambdaExpression.demo0;

public class Demo0 {
    public static void main(String[] args) {
       /* Operation operation=new OperationImpl();  //1 -way
        System.out.println(operation.increment(10));*/

       /* Operation operation=new Operation(){ //Anonymous Inner class -2nd way
            @Override
            public int increment(int num) {
                return ++num;
            }
        };
        System.out.println(operation.increment(10));*/

       /* Operation operation = (int num) -> {   //Lambda expression
            return ++num;
        };
        System.out.println(operation.increment(1));*/

        Operation operation =  num ->++num;   //Lambda expression more concise way
        System.out.println(operation.increment(5));
    }
}

