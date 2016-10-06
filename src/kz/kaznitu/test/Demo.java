package kz.kaznitu.test;

import java.time.LocalDate;
import java.time.Month;

public class Demo {
    public static void main(String[] args) {
        LocalDateTest.test();
        System.out.println("-------------------------");
        LocalTimeTest.test();
        System.out.println("-------------------------");
        LocalDateTimeTest.test();
        System.out.println("-------------------------");
        TimeZoneTest.test();
        System.out.println("-------------------------");
        LocalDateFormatTest.test();
        System.out.println("-------------------------");
        FromInstantToLocalDateTest.test();

    }
}
