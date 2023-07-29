package com.farrel.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {

    @Test
    void create() {
        Year year1 = Year.now();
        Year year2 = Year.of(1980);
        Year year3 = Year.parse("2020");

        System.out.println("year1 : " + year1);
        System.out.println("year2 : " + year2);
        System.out.println("year3 : " + year3);

        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(1980, 10);
        YearMonth yearMonth3 = YearMonth.of(1980, Month.MAY);
        YearMonth yearMonth4 = YearMonth.parse("2020-09");

        System.out.println("yearMonth1 : " + yearMonth1);
        System.out.println("yearMonth2 : " + yearMonth2);
        System.out.println("yearMonth3 : " + yearMonth3);
        System.out.println("yearMonth4 : " + yearMonth4);

        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(Month.APRIL, 12);
        MonthDay monthDay3 = MonthDay.of(5, 2);
        MonthDay monthDay4 = MonthDay.parse("--03-09");

        System.out.println("monthDay1 : " + monthDay1);
        System.out.println("monthDay2 : " + monthDay2);
        System.out.println("monthDay3 : " + monthDay3);
        System.out.println("monthDay4 : " + monthDay4);
    }

    @Test
    void convert() {
        Year year = Year.now();
        YearMonth yearMonth = year.atMonth(Month.MAY);
        LocalDate localDate = yearMonth.atDay(2);
        MonthDay monthDay = MonthDay.from(localDate);

        System.out.println("year : " + year);
        System.out.println("yearMonth : " + yearMonth);
        System.out.println("localDate : " + localDate);
        System.out.println("monthDay : " + monthDay);
    }

    @Test
    void get() {
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println("year.getValue() : " + year.getValue());
        System.out.println("yearMonth.getYear() : " + yearMonth.getYear());
        System.out.println("yearMonth.getMonth() : " + yearMonth.getMonth());
        System.out.println("yearMonth.getMonthValue() : " + yearMonth.getMonthValue());
        System.out.println("monthDay.getMonth() : " + monthDay.getMonth());
        System.out.println("monthDay.getMonthValue() : " + monthDay.getMonthValue());
        System.out.println("monthDay.getDayOfMonth() : " + monthDay.getDayOfMonth());
    }
}
