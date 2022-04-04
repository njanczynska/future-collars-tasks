package daysOfTheWeek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysOfTheWeekTest {

    @Test
    public void shouldReturnTrueIfDayIsMonday() {
        int day = 1;
        Assertions.assertEquals(DaysOfTheWeek.dayOfTheWeek(day), "Monday");
    }

    @Test
    public void shouldReturnTrueIfDayIsTuesday() {
        int day = 2;
        Assertions.assertEquals(DaysOfTheWeek.dayOfTheWeek(day), "Tuesday");
    }

    @Test
    public void shouldReturnTrueIfDayIsWednesday() {
        int day = 3;
        Assertions.assertEquals(DaysOfTheWeek.dayOfTheWeek(day), "Wednesday");
    }

    @Test
    public void shouldReturnTrueIfDayIsThursday() {
        int day = 4;
        Assertions.assertEquals(DaysOfTheWeek.dayOfTheWeek(day), "Thursday");
    }

    @Test
    public void shouldReturnTrueIfDayIsFriday() {
        int day = 5;
        Assertions.assertEquals(DaysOfTheWeek.dayOfTheWeek(day), "Friday");
    }

    @Test
    public void shouldReturnTrueIfDayIsFirstDayOfWeekend() {
        int day = 6;
        Assertions.assertEquals(DaysOfTheWeek.dayOfTheWeek(day), "Weekend");
    }

    @Test
    public void shouldReturnTrueIfDayIsSecondDayOfWeekend() {
        int day = 7;
        Assertions.assertEquals(DaysOfTheWeek.dayOfTheWeek(day), "Weekend!");
    }

    @Test
    public void shouldReturnTrueIfDayIsNotADayOfWeek() {
        int day = 8;
        Assertions.assertEquals(DaysOfTheWeek.dayOfTheWeek(day), "There is no such a day!");
    }

}