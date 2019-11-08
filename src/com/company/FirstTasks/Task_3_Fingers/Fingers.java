package com.company.FirstTasks.Task_3_Fingers;

import java.util.Scanner;

public class Fingers {


    public static void main(String[] args) {

        /*Task 3
        Написать метод, используя switch, который принимает в себя номер пальца - переменную типа int
        и в зависимости от номер выводит название пальца (1-”большой” и т д)

*/

        System.out.println("Task 3 ''");
        System.out.println("Enter the number of finger : ");


        Scanner keyboard = new Scanner(System.in);
        int entered_finger = keyboard.nextInt();

        FingerDefiner mm = new FingerDefiner();
        mm.definer(entered_finger);



    }

}

