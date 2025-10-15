package Youtube.abhishekverma.DateandTimeApi.demo3;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class demo1 {
    public static void main(String[] args) {
        OffsetDateTime currentDateTime = OffsetDateTime.now();
        System.out.println(currentDateTime);

        OffsetDateTime currentDateTime2 = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println(currentDateTime2);

        OffsetDateTime currentDateTime3 = OffsetDateTime.now(ZoneOffset.MAX);
        System.out.println(currentDateTime3);

        OffsetDateTime currentDateTime4 = OffsetDateTime.now(ZoneOffset.MIN);
        System.out.println(currentDateTime4);

        LocalDateTime birthDate = LocalDateTime.of(1995,11,28,10,10,10);

        OffsetDateTime birthDate2 = OffsetDateTime.of( birthDate,ZoneOffset.ofHours(10));
        OffsetDateTime birthDate3 = OffsetDateTime.of( birthDate,ZoneOffset.ofHoursMinutes(10,10));
        System.out.println(birthDate2);

        LocalDateTime localDateTime = currentDateTime2.toLocalDateTime();
        System.out.println("Current OffsetLocalDateTime: " + localDateTime);



    }
}
