package Youtube.abhishekverma.ExceptionHandling;
//CalculatorImpl3
public class Demo4 {
    public static void main(String[] args) {
        CalculatorImpl3 calculator=new CalculatorImpl3();
        try {
            System.out.println("---SCENARIO 1---");
            calculator.divide(10, 2);
            System.out.println("---SCENARIO 2---");
            calculator.divide(10, 0);
        } catch (Exception exception) {
            System.out.println("Something went wrong : " + exception);
        }
    }
}
