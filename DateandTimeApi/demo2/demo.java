package Youtube.abhishekverma.DateandTimeApi.demo2;
//LocalDateTime API
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class demo {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalDate birthDate=LocalDate.of(1995,11,28);
        System.out.println(birthDate);
        LocalDate birthDate2 = LocalDate.of(1995, Month.NOVEMBER, 28);

        System.out.println(localDate.isAfter(birthDate));
        System.out.println(localDate.isBefore(birthDate));
        System.out.println(localDate.isEqual(birthDate));

        LocalDate addYears=localDate.plusYears(10);
        System.out.println(addYears);
        LocalDate addMonths=localDate.plusMonths(12);
        System.out.println(addMonths);
        LocalDate addDays = localDate.plusDays(10);
        System.out.println(addDays);

        LocalDate minusYears=localDate.minusYears(10);
        System.out.println(minusYears);
        LocalDate minusMonths=localDate.minusMonths(10);
        System.out.println(minusMonths);
        LocalDate minusDays=localDate.minusDays(10);
        System.out.println(minusDays);


    }
}
