package kz.kaznitu.test;


import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest {
    public static void test(){
        // dates with times, e.g. 2014-02-18 19:08:37.950
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Қазіргі шақ ===> " + currentDateTime);

        // 2014-10-02 12:30
        LocalDateTime secondAug2014 = LocalDateTime.of(2014, 10, 2, 12, 30);
        System.out.println("2014 жыл Тамыздың екісі ===> " + secondAug2014);

        // 2014-12-24 12:00
        LocalDateTime christmas2014 = LocalDateTime.of(2014, Month.DECEMBER, 24, 12, 0);
        System.out.println("Жаңа жыл ===> " + christmas2014);
    }
}
