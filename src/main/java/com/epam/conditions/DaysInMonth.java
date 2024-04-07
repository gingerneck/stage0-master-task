package com.epam.conditions;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0
                || month < 0 || month > 12) {
            System.out.println("invalid date");
        } else {
            Calendar calendar = new GregorianCalendar(year, month - 1, 1);
            System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        }
    }
}
