package by.bntu.fitr.povt.justcompileit.javalabs.lab07.dop.model;


public class MyCalendar {

    private int year;
    private int month;
    private int day;

    public MyCalendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getMaxDayMonth() {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public String calculateNextDay() {

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (day == getMaxDayMonth() && month == 12) {
            nextDay = 1;
            nextMonth = 1;
            ++nextYear;
        } else if (day == getMaxDayMonth()) {
            nextDay = 1;
            ++nextMonth;
        } else {
            ++nextDay;
        }

        return String.format("%d.%d.%d", nextDay, nextMonth, nextYear);
    }

    @Override
    public String toString() {
        return String.format("Set date: %d.%d.%d", day, month, year);
    }
}
