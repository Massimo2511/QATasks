package com.company.FirstTasks.Task_4_WeekDay;

import com.company.FirstTasks.Task_3_Fingers.FingerDefiner;

import java.util.Scanner;

public class Day_Of_Week {


    public static void main(String[] args) {

        /*Task 4
        Написать метод который принимает на вход String - день недели,
         и если это будний день, то выводит “будний”, если выходной - “выходной” (используя иф-елс и логические выражения)
*/
        System.out.println("Task 4 ''");
        System.out.println("Enter the day of the week : ");


        Scanner keyboard = new Scanner(System.in);
        String day = keyboard.next();


        DayDefiner mm = new DayDefiner();

        mm.definer(day);
    }
}