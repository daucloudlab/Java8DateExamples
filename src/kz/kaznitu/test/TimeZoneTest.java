package kz.kaznitu.test;


import java.time.LocalTime;
import java.time.ZoneId;

public class TimeZoneTest {
    public static void test(){
        // current (local) time in Los Angeles
        LocalTime currentTimeInLosAngeles =
                LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Лос Анджелістегі қазіргі уақыт: " + currentTimeInLosAngeles) ;
    }
}
