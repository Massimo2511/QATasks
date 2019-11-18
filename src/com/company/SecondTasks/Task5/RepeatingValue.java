package com.company.SecondTasks.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatingValue {
    static int values_definer(int array[]) {

        int counter = 0;


        ArrayList<Integer> value_list = new ArrayList<Integer>();


        for (int i = 0; i < array.length; i++) {


            if (value_list.size() < array[array.length - 1]) {
                value_list.add(array[i]);
            }
        }


        for (int i = 0; i < value_list.size(); i++) {
            for (int j = i; j < array.length; j++) {
                if (value_list.get(i).equals(array[j])) {
                    counter++;
                }
            }
            System.out.println("Value " + value_list.get(i) + " found :" + counter + " times ");
            counter = 0;
        }

        return array[array.length - 1];
    }


    public static void main(String[] args) {
        /* 5. Написать метод, который принимает в себя массив int*ов
         и выводит в консоль счётчик и значение элемента,
          который повторяется больше всего раз*/

        Scanner arraysize = new Scanner(System.in);
        Scanner array_elements = new Scanner(System.in);


        System.out.println("Enter the length of array: ");

        int array_length = arraysize.nextInt();
        int[] my_array = new int[array_length];


        System.out.println("Enter elements of  your array: ");
        for (int i = 0; i <= array_length - 1; i++) {
            my_array[i] = array_elements.nextInt();
        }


        System.out.println("Entered array is : ");
        for (int i = 0; i <= my_array.length - 1; i++) {
            System.out.print(my_array[i] + " ");

        }

        System.out.println();

        values_definer(my_array);
    }
}
