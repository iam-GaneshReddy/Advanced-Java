package Youtube.abhishekverma.DateandTimeApi.demo2;

import java.time.LocalTime;

public class demo1 {
    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        LocalTime birthTime=LocalTime.of(03,34,20);
        System.out.println(birthTime);

        System.out.println(localTime.isAfter(birthTime));
        System.out.println(localTime.isBefore(birthTime));

        LocalTime addHours=localTime.plusHours(10);
        System.out.println(addHours);

        LocalTime minusHours = localTime.minusHours(10);
        System.out.println(minusHours);
    }
}
