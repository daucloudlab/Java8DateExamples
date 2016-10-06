package kz.kaznitu.test;


import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatTest {
    public static void test(){

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        String date1 = "16-Aug-2016";
        LocalDate localDate1 = LocalDate.parse(date1, formatter1);
        //default, print ISO_LOCAL_DATE
        System.out.println(localDate1);
        System.out.println(formatter1.format(localDate1));

        System.out.println("//////////////////////////////");

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date2 = "16/08/2016";
        LocalDate localDate2 = LocalDate.parse(date2, formatter2);
        System.out.println(localDate2);
        System.out.println(formatter2.format(localDate2));

        System.out.println("/////////////////////////////");

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("E, MMM d yyyy");
        String date3 = "Tue, Aug 16 2016";
        LocalDate localDate3 = LocalDate.parse(date3, formatter3);
        System.out.println(localDate3);
        System.out.println(formatter3.format(localDate3));

        System.out.println("/////////////////////////////");


        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");
        String date4 = "Tuesday, Aug 16, 2016 12:10:56 PM";
        LocalDateTime localDateTime4 = LocalDateTime.parse(date4, formatter4);
        System.out.println(localDateTime4);
        System.out.println(formatter4.format(localDateTime4));

        System.out.println("/////////////////////////////");

        String dateInString5 = "2016-08-16T15:23:01Z";
        Instant instant5 = Instant.parse(dateInString5);
        System.out.println("Instant : " + instant5);
        //get date time only
        LocalDateTime result = LocalDateTime.ofInstant(instant5, ZoneId.of(ZoneOffset.UTC.getId()));
        //get localdate
        System.out.println("LocalDate : " + result.toLocalDate());
        //get date time + timezone
        ZonedDateTime zonedDateTime = instant5.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime);
        //get date time + timezone
        ZonedDateTime zonedDateTime2 = instant5.atZone(ZoneId.of("Europe/Athens"));
        System.out.println(zonedDateTime2);

        System.out.println("/////////////////////////////");

        String date6 = "2016-08-16T10:15:30+08:00";
        ZonedDateTime result6 = ZonedDateTime.parse(date6, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ZonedDateTime : " + result6);
        System.out.println("TimeZone : " + result6.getZone());
        LocalDate localDate = result6.toLocalDate();
        System.out.println("LocalDate : " + localDate);

        System.out.println("/////////////////////////////");
    }
}
