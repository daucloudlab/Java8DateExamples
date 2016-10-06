package kz.kaznitu.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void test(){
        // the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Қазіргі уақыт: " + currentDate);

        // 2014-02-10
        LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
        System.out.println("2014 Ақпанның 10: " + tenthFeb2014);

        // months values start at 1 (2014-08-01)
        LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);
        System.out.println("2014 Тамыздың бірі: " + firstAug2014);

        // the 65th day of 2010 (2010-03-06)
        LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);
        System.out.println("2010 жылдың 65-ші күні: " + sixtyFifthDayOf2010);


    }
}
