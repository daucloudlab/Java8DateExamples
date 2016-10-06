package kz.kaznitu.test;


import java.time.*;

public class FromInstantToLocalDateTest {
    public static void test(){
        // Parse a ISO 8601 Date directly
        //Instant instant = Instant.parse("2016-08-18T06:17:10.225Z");
        Instant instant1 = Instant.now();
        System.out.println("Instant : " + instant1);
        //Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0
        LocalDateTime ldt = LocalDateTime.ofInstant(instant1, ZoneOffset.UTC); // ZoneOffset.of("+6")
        System.out.println("LocalDateTime : " + ldt);

        System.out.println("!!!!!!!!!!!!!!!!!!!!");

        // Hard code a date time
        LocalDateTime dateTime2 = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 17, 10);
        System.out.println("LocalDateTime : " + dateTime2);
        // Convert LocalDateTime to Instant, UTC+0
        Instant instant2 = dateTime2.toInstant(ZoneOffset.UTC);
        System.out.println("Instant : " + instant2);

        System.out.println("!!!!!!!!!!!!!!!!!!!!");

        Instant instant3 = Instant.now();
        System.out.println("Instant : " + instant3);
        // Japan = UTC+9
        ZonedDateTime jpTime3 = instant3.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("ZonedDateTime : " + jpTime3);
        System.out.println("OffSet : " + jpTime3.getOffset());

        System.out.println("!!!!!!!!!!!!!!!!!!!!");

        LocalDateTime dateTime4 = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 57, 38);
        // UTC+9
        ZonedDateTime jpTime4 = dateTime4.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("ZonedDateTime : " + jpTime4);
        // Convert to instant UTC+0/Z , java.time helps to reduce 9 hours
        Instant instant4 = jpTime4.toInstant();
        System.out.println("Instant : " + instant4);

        System.out.println("!!!!!!!!!!!!!!!!!!!!");
    }
}
