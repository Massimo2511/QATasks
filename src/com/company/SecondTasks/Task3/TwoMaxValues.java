package com.company.SecondTasks.Task3;

import java.util.Scanner;

public class TwoMaxValues {

    static int[] two_max_array_values(int[] array) {


        int max1_value = array[0];
        int max2_value = array[0];
        for (int i = 0; i <= array.length - 1; i++) {

            if (max1_value < array[i]) {
                max2_value = max1_value;
                max1_value = array[i];
            } else if (max2_value <= array[i]) {
                max2_value = array[i];
            }


        }

        System.out.println();
        System.out.println("Maximum First Element is : " + max1_value);
        System.out.println("Maximum Second Element is : " + max2_value);


        return new int[] {max1_value, max2_value};


    }


    public static void main(String[] args) {

        /* Task:3. Написать метод, который принимает в себя массив int*ов,
        находит 2 максимальных значения и возвращает их как массив из 2-x int*ов.*/


        Scanner arraysize = new Scanner(System.in);
        Scanner array_elements = new Scanner(System.in);


        System.out.println("Enter the length of arrays: ");

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

        two_max_array_values(my_array);




    }
}