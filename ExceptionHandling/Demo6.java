package Youtube.abhishekverma.ExceptionHandling;
//custom Resource
public class Demo6 {
    public static void main(String[] args) {
        Calculator calculatorService = new CalculatorImpl4();

        try {
            System.out.println("---SCENARIO 1---");
            calculatorService.divide(10, 2);
            System.out.println("---SCENARIO 2---");
            calculatorService.divide(10, 0);
        } catch (Exception exception) {
            System.out.println("Something went wrong : " + exception);
        }
    }
}
