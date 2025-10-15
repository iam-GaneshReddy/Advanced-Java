package Youtube.abhishekverma.ExceptionHandling;
//calculatorImpl
public class Demo {
    public static void main(String[] args) {
        CalculatorImpl calculator=new CalculatorImpl();
        System.out.println("---SCENARIO 1---");
        calculator.divide(10, 2);
        System.out.println("---SCENARIO 2---");
        calculator.divide(10, 0);
    }
}
