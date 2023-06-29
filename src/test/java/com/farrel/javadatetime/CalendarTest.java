package com.farrel.javadatetime;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    @Test
    void testCreate() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void testModifyCalendar() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.MAY); // index bulan di Calendar dimulai dari 0
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 50);
        calendar.set(Calendar.SECOND, 30);
        calendar.set(Calendar.MILLISECOND, 150);

        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
    }

    @Test
    void testGetCalendar() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println("YEAR : " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH : " + calendar.get(Calendar.MONTH));
        System.out.println("WEEK_OF_MONTH : " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR : " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("DAY_OF_WEEK : " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_WEEK_IN_MONTH : " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("DAY_OF_MONTH : " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR : " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("HOUR_OF_DAY : " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("HOUR : " + calendar.get(Calendar.HOUR));
        System.out.println("MINUTE : " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND : " + calendar.get(Calendar.SECOND));
        System.out.println("MILLISECOND : " + calendar.get(Calendar.MILLISECOND));
        System.out.println("ZONE_OFFSET : " + calendar.get(Calendar.ZONE_OFFSET));
    }
}
