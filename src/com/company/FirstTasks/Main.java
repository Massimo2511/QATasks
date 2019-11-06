package com.company.FirstTasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /*Task 1
        1 . Написать метод который принимает в себя текст сезон (“summer”, “winter”...) - переменную типа String,
         и если сезон - winter выводит в консоль “It is cold”.*/


        System.out.println("Task 1 'SEASON'");
        System.out.println("Enter the name of the season that start from capital letter");


        Scanner keyboard = new Scanner(System.in);
        String width = keyboard.next();

        System.out.println("You have entered season: ");
        System.out.println(width);

        Counter ss = new Counter();
        ss.season(width);


	// write your code here
    }
}
