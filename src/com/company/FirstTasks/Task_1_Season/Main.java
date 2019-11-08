package com.company.FirstTasks.Task_1_Season;

import com.company.FirstTasks.Task_1_Season.Season;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /*Task 1
        1 . Написать метод который принимает в себя текст сезон (“summer”, “winter”...) - переменную типа String,
         и если сезон - winter выводит в консоль “It is cold”.*/


        System.out.println("Task 1 'SEASON'");
        System.out.println("Enter the name of the season that starts from  small letter");


        Scanner keyboard = new Scanner(System.in);
        String season_name = keyboard.next();

        System.out.println("You have entered season: ");
        System.out.println(season_name);

        Season ss = new Season();
        ss.season(season_name);


    }
}
