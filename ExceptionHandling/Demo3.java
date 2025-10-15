package Youtube.abhishekverma.ExceptionHandling;
//CalculatorImpl3
public class Demo3 {
    public static int divide(Integer ... arr)
    {
        return arr[0]/arr[1];
    }
    public static void main(String[] args) {
        CalculatorImpl calculator=new CalculatorImpl();
        try {
            System.out.println("---SCENARIO 1---");
            System.out.println(divide(10, 2));
            System.out.println("---SCENARIO 2---");
            System.out.println(divide(10, 0));
        } catch (Exception exception) {
            System.out.println("Something went wrong : " + exception);
        }
    }
}
