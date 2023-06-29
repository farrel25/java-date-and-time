package com.farrel.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void testCreate() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2000, Month.MAY, 2); // index bulan di Month dimulai dari 1
        LocalDate localDate3 = LocalDate.parse("2001-05-02");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testWith() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(2000);
        LocalDate localDate3 = localDate1.withMonth(5);
        LocalDate localDate4 = localDate1.withYear(2000).withMonth(5);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);
    }

    @Test
    void testModify() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusYears(10);
        LocalDate localDate3 = localDate1.minusMonths(10);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testGet() {
        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonth());
        System.out.println(localDate1.getMonthValue());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.getDayOfYear());
    }
}
