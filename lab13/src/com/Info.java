package com;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.*;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Info {
    //pentru weekdays nu am realizat exact ce functie trebuie folosita
    //asa ca am facut o functie care face  direct printarea ok
    public static void printWeekdays(Locale loc) {
        WeekFields wf = WeekFields.of(loc);
        DayOfWeek day = wf.getFirstDayOfWeek();
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            System.out.print(day.getDisplayName(TextStyle.FULL, loc));
            System.out.print(", ");
            day = day.plus(1);
        }
        System.out.println(" ");
    }

    // aici se face afisare datelor Locale pentru Locala data ca argument
    // am folosit functii default din Locale pentru majoritatea,
    // cu bibliotecti specifice unde trebuia (Date,format - pentru varii obtiuni de formatare)
    public static void printDetails(Locale loc) {

        //Am declarat cateva variabile pentru a facilita afisarea tuturor datelor:
        Double currencyAmount = new Double(1111111.555);
        DateFormat full = DateFormat.getDateInstance(DateFormat.LONG, loc);
        Currency currentCurrency = Currency.getInstance(loc);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(loc);
        DateFormatSymbols dfs = new DateFormatSymbols(loc);
        String[] months = dfs.getMonths();



        //Afisarea e destul de directa, am printat fiecare element, cu o eticheta adaugata in fata
        System.out.print("Country: ");
        System.out.println(loc.getCountry());
        System.out.print("Language: ");
        System.out.println(loc.getDisplayLanguage());
        System.out.print("Language + Country: ");
        System.out.println(loc.getDisplayName());
        System.out.print("Currency: ");
        System.out.println(currencyFormatter.format(currencyAmount));
        System.out.print("Weekdays: ");
        Info.printWeekdays(loc);
        System.out.print("Months: ");
        System.out.println(Arrays.toString(months));
        System.out.print("Date: ");
        System.out.println(full.format(new Date()));

        System.out.println(" ");
    }

}
