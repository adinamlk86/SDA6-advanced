package enums;

public enum Weekdays {

    DEFAULT("No"),MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thurday"), FRIDAY("Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");

    String name;

    Weekdays(String name) {
        this.name = name;
    }

    public Weekdays getName() {
        return Weekdays.valueOf(name);
    }

    public Weekdays getDay(){

        Weekdays daysOf = Weekdays.DEFAULT.getName();
        for(Weekdays w : Weekdays.values()){
            if(w.name.equals(this.name)){
                daysOf = Weekdays.valueOf(name);
            }
        }
        return daysOf.getName();
    }
}



