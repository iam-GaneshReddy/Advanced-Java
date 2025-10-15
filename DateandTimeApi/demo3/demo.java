package Youtube.abhishekverma.DateandTimeApi.demo3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class demo {
    public static void main(String[] args) {
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDate localDate = LocalDate.of(1995, Month.NOVEMBER,28);
        LocalTime localTime = LocalTime.of(10,11,12);
        LocalDateTime birthDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println(birthDateTime);

        //convert to Local Date
        LocalDate date = currentDateTime.toLocalDate();
        System.out.println(date);

        //Convert to Local Time
       LocalTime time = currentDateTime.toLocalTime();
        System.out.println(time);


        System.out.println(currentDateTime.isAfter(birthDateTime));
        System.out.println(currentDateTime.isBefore(birthDateTime));

        LocalDateTime addYears = currentDateTime.plusYears(10);
        LocalDateTime addMonths = currentDateTime.plusMonths(2);




    }
}
