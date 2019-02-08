package enums;

public class DayOfTheWeek {

    public void whichDayIsIt(Weekdays days){

        switch(days){

            case MONDAY:
                System.out.println(days.MONDAY);
                break;

            case TUESDAY:
                System.out.println(days.TUESDAY);
                break;

            case WEDNESDAY:
                System.out.println(days.WEDNESDAY);
                break;

            case THURSDAY:
                System.out.println(days.THURSDAY);
                break;

            case FRIDAY:
                System.out.println(days.FRIDAY);
                break;

            case SATURDAY:
                System.out.println(days.SATURDAY);
                break;

            case SUNDAY:
                System.out.println(days.SUNDAY);
                break;
        }
    }


}
