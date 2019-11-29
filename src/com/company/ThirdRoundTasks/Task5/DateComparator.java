package com.company.ThirdRoundTasks.Task5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparator {
    public static long date_Comparator(String dateStart, String dateStop) throws ParseException {

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        Date date1 = format.parse(dateStart);
        Date date2 = format.parse(dateStop);

        long difference = date2.getTime() - date1.getTime();

        return difference/1000;
    }
    public static void main(String[] args) throws ParseException {

        String dateStart = "2012-11-17T09:10:10";
        String dateStop = "2012-11-17T10:10:10";

        long result = date_Comparator(dateStart,dateStop);

        System.out.println("Current date difference is : "+result+" second(s)" );
}
}