package Youtube.abhishekverma.DateandTimeApi.demo0;
import java.util.Date;
@SuppressWarnings("deprecation")
//@Deprecated
public class demo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getMonth());
        System.out.println(date.getYear()+1900);

        Date birthDate = new Date();
        birthDate.setDate(28);
        birthDate.setMonth(11-1);
        birthDate.setYear(1995-1900);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("BirthDay:" + setBirthDate(birthDate));
    }
    public static String setBirthDate(Date date){
        int year=date.getYear()+1900;
        int month=date.getMonth()+1;
        int day=date.getDate();
        return day+"-"+month+"-"+year;

    }
}
