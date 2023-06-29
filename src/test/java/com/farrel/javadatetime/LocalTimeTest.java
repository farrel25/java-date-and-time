package com.farrel.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void testCreate() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(10, 10, 10);
        LocalTime localTime3 = LocalTime.parse("08:59");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void testChange() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.withHour(10);
        LocalTime localTime3 = localTime1.withHour(5).withMinute(10).withSecond(0);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void testModify() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.plusHours(10);
        LocalTime localTime3 = localTime1.plusHours(5).minusMinutes(10).minusSeconds(5);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void testGet() {
        LocalTime localTime1 = LocalTime.now();

        System.out.println(localTime1.getHour());
        System.out.println(localTime1.getMinute());
        System.out.println(localTime1.getSecond());
        System.out.println(localTime1.getNano());
    }
}
