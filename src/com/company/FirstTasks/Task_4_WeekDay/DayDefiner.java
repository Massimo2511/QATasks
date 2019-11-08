package com.company.FirstTasks.Task_4_WeekDay;

public class DayDefiner {

    public void definer(String day) {

        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday")
                || day.equalsIgnoreCase("Wednesday") ||
                day.equalsIgnoreCase("Thursday") ||
                day.equalsIgnoreCase("Friday")) {
            System.out.println("Your day : " + day);
            System.out.println("It is WEEKDAY");

        } else {
            if ((day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))) {
                System.out.println("Your day : " + day);
                System.out.println("It is WEEKEND");
            } else {
                System.out.println("Incorrect input. TRY Again");
            }
        }

    }
}
