package Youtube.abhishekverma.DateandTimeApi.demo1;

import java.util.Calendar;

public class demo {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
       int year= calendar.get(Calendar.YEAR);
       int month=calendar.get(Calendar.MONTH)+1;
       int date=calendar.get(Calendar.DATE);
        System.out.println(year+"-"+month+"_"+date);

        Calendar birthDate=Calendar.getInstance();
        birthDate.set(1995,11-1,28);
        System.out.println(birthDate);
        birthDate.set(1995,Calendar.NOVEMBER,28);

        int year2 = birthDate.get(Calendar.YEAR);
        int month2=birthDate.get(Calendar.MONTH);
        int date2=birthDate.get(Calendar.DATE);
        System.out.println(year2+"-"+month2+"_"+date2);

    }
}

