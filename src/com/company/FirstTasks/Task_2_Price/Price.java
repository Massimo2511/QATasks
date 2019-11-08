package com.company.FirstTasks.Task_2_Price;

import java.util.Scanner;

public class Price {

    public static void main(String[] args) {

        /*Task 2
        1 . Написать метод который принимает в себя цену  - переменную типа int,
        и если  цена меньше 1000, то выводит в консоль “цена нормальная”,
        если больше или равно 1000, то выводит в консоль “цена завышена”
*/

        System.out.println("Task 2 'PRICE'");
        System.out.println("Enter your price : ");
        Scanner keyboard = new Scanner(System.in);
        int entered_price = keyboard.nextInt();

        PriceDefiner ss = new PriceDefiner();
        ss.price_define(entered_price);



    }
}