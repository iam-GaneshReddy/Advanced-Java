package Youtube.abhishekverma.DateandTimeApi.demo4;

import java.time.*;

public class demo {
    public static void main(String[] args) {
        ZonedDateTime  currentDateTime = ZonedDateTime.now();
        System.out.println(currentDateTime);

        ZonedDateTime  currentDateTime2 = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println(currentDateTime2);

        ZonedDateTime  currentDateTime3 = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(currentDateTime3);

        LocalDateTime currrent = currentDateTime3.toLocalDateTime();
        System.out.println(currrent);

        LocalDate birthDate = LocalDate.of(1995,Month.NOVEMBER,28);
        LocalTime birthTime = LocalTime.of(10,10,10);

        ZonedDateTime birthdateTime = ZonedDateTime.of(birthDate,birthTime,ZoneId.of("UTC"));
        System.out.println(birthdateTime);




    }
}
