package com.farrel.javadatetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {

    @Test
    void testCreate() {
        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println(timeZoneDefault);

        TimeZone timeZoneGmt = TimeZone.getTimeZone("GMT");
        System.out.println(timeZoneGmt);

        String[] availableIDs = TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(availableIDs));
        Arrays.asList(availableIDs).forEach(System.out::println);
    }

    @Test
    void testDate() {
        Date date = new Date();

        System.out.println(date);
        System.out.println(date.toGMTString()); // DEPRECATED
    }



    @Test
    void testCalendar() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar3.get(Calendar.HOUR_OF_DAY));

        calendar2.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));
    }
}
