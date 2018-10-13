package com.vpt.pw.demo.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {


    public static LocalDate convertStringToLocatDate(String date) {
        LocalDate dateObj = null;

        if (date == null) return null;
        try {
            dateObj = LocalDate.parse(date, DateTimeFormatter.ofPattern("d-M-yyyy"));
        } catch (Exception ex) {
            dateObj = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }

        return dateObj;
    }

    public static String getNextDate(String date, Integer daysToAdd) {
        LocalDate localDate = null;
        String dateToReturn = null;

        try {
            localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            localDate = localDate.plusDays(daysToAdd);
            dateToReturn = localDate.format(DateTimeFormatter.ofPattern("d-M-yyyy"));
        } catch (Exception ex) {
            localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("d-M-yyyy"));
            localDate = localDate.plusDays(daysToAdd);
            dateToReturn = localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }

        return dateToReturn;
    }

}
