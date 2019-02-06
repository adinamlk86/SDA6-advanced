package enums;

import org.junit.Test;

public class TestDayOfTheWeek {

    @Test
    public void testIfDayOfTheWeekWorks(){

        DayOfTheWeek day = new DayOfTheWeek();
        Weekdays anotherDay = Weekdays.MONDAY;

        day.whichDayIsIt(anotherDay);



    }
}
