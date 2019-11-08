package com.company.FirstTasks.Task_1_Season;

public class Season {

    public void season(String season) {

        if (season.equals("winter")) {
            System.out.print("Message: ");
            System.out.println("It is cold");
        } else {
            if (season.equals("summer")) {
                System.out.print("Message: ");
                System.out.println("It is warm in summer");
            }
            System.out.println("Incorrect input. Please try again =) ");

        }
    }


}
