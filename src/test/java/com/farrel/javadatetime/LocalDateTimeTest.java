package com.farrel.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

    @Test
    void testCreate() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2000, Month.MAY, 2, 8, 30, 2, 250);
        LocalDateTime localDateTime3 = LocalDateTime.parse("2000-02-22T06:15:49.140");

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void testWith() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.withYear(2000).withMonth(5);
        LocalDateTime localDateTime3 = localDateTime1.withYear(2000).withMinute(9);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void testModify() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusYears(5).minusHours(5);
        LocalDateTime localDateTime3 = localDateTime1.minusYears(5).plusHours(5);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void testGet() {
        LocalDateTime localDateTime1 = LocalDateTime.now();

        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime1.getMonth());
        System.out.println(localDateTime1.getDayOfYear());
        System.out.println(localDateTime1.getDayOfMonth());
        System.out.println(localDateTime1.getDayOfWeek());
        System.out.println(localDateTime1.getHour());
        System.out.println(localDateTime1.getMinute());
        System.out.println(localDateTime1.getSecond());
        System.out.println(localDateTime1.getNano());
    }

    @Test
    void testDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime localDateTime2 = localDate.atTime(10, 10, 10, 10);
        System.out.println(localDateTime2);
    }

    @Test
    void testTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime localDateTime2 = localTime.atDate(LocalDate.of(2000, Month.MAY, 2));
        System.out.println(localDateTime2);
    }
}
