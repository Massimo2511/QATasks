package com.company.SecondTasks.Task4;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Amountofelements {


    static int values_definer(int array[]) {
        int counter = 0;

        for (int i = 0; i <= array.length - 1; i++) {


            if (array[i] == 0) {
                continue;
            } else {

                if (array[i] % 2 == 0 && array[i] % 3 != 0) {
                    counter = counter + 1;
                } else {

                }

            }

        }
        System.out.println();
        System.out.print("There are  <<" + counter + ">>  values that count on 2 but not count on 3 ");

        return array[array.length - 1];
    }

    public static void main(String[] args) {


        /* 4. Написать метод, который принимает в себя массив int*ов,
         подсчитывает количество элементов, которые делятся на 2,
          но не делятся на 3 (логические выражения) и возвращает (return) как int.*/

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

        values_definer(my_array);
    }
}