package Youtube.abhishekverma.ExceptionHandling;
//demo6
public class CustomResouce2 implements AutoCloseable{
    public CustomResouce2() {
        System.out.println("Custom Resource 2 started");
    }

    public void process() {
        System.out.println("Custom Resource 2 processing");
    }

    public void close() {
        System.out.println("Custom Resource 2 finished");
        }
    }

