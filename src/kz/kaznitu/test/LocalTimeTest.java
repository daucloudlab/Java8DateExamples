package kz.kaznitu.test;


import java.time.LocalTime;

public class LocalTimeTest {
    public static void test(){
        // current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Қазіргі уақыт -> " + currentTime);

        // 12:00
        LocalTime midday = LocalTime.of(12, 0);
        System.out.println("12:00 -> " + midday);

        // 13:30:15
        LocalTime afterMidday = LocalTime.of(13, 30, 15);
        System.out.println("13:30:15 -> " + afterMidday);

        // 12345th second of day (03:25:45)
        LocalTime fromSecondsOfDay = LocalTime.ofSecondOfDay(12345);
        System.out.println("Күннің 12345 секунды -> " + fromSecondsOfDay);
    }
}
