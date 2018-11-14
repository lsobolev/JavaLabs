package by.bntu.fitr.povt.justcompileit.javalabs.lab07.dop.model;


public class MyCalendar {

    private final int MIN_YEAR = 0;
    private final int MIN_MOTH = 1;
    private final int MAX_MONTH = 12;
    private final int MIN_DAY = 1;

    private int year;
    private int month;
    private int day;

    public MyCalendar(int year, int month, int day) {
        this.year = validateYear(year);
        this.month = validateMonth(month);
        this.day = validateDay(day);
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

    private int validateYear(int year) {
        if (year >= MIN_YEAR) {
            return year;
        } else {
            return MIN_YEAR;
        }
    }

    private int validateMonth(int month) {
        if (month >= MIN_MOTH && month <= MAX_MONTH) {
            return month;
        } else {
            return MIN_MOTH;
        }
    }

    private int validateDay(int day) {
        if (day >= MIN_DAY && day <= getMaxDayMonth()) {
            return day;
        } else {
            return MIN_DAY;
        }
    }

    public int getMaxDayMonth() {

        int maxDay;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    maxDay = 29;
                    break;
                } else {
                    maxDay = 28;
                    break;
                }
            default:
                maxDay = 0;
        }

        return maxDay;
    }

    public String calculateNextDay() {

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (day == getMaxDayMonth() && month == MAX_MONTH) {
            nextDay = MIN_DAY;
            nextMonth = MIN_MOTH;
            ++nextYear;
        } else if (day == getMaxDayMonth()) {
            nextDay = MIN_DAY;
            ++nextMonth;
        } else {
            ++nextDay;
        }

        return String.format("%02d.%02d.%d", nextDay, nextMonth, nextYear);
    }

    @Override
    public String toString() {
        return String.format("Set date: %02d.%02d.%02d", day, month, year);
    }
}
