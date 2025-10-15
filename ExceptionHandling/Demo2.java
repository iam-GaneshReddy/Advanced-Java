package Youtube.abhishekverma.ExceptionHandling;
//calculatorImpl2
public class Demo2 {
    public static void main(String[] args) {
        CalculatorImpl2 calculator=new CalculatorImpl2();

        System.out.println("---SCENARIO 1---");
        calculator.divide(10, 0);
        System.out.println("---SCENARIO 2---");
        calculator.divide(10);
    }
}
