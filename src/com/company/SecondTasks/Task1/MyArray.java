package com.company.SecondTasks.Task1;

import java.util.Scanner;

public class MyArray {
    static int maximum_array_value(int array[]) {
        int max_value = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (max_value <= array[i])
                max_value = array[i];
        }
        return max_value;
    }


    public static void main(String[] args) {


        /* Task: 1.Написать метод, который принимает в себя массив int*ов и
        возвращает (return) максимальный элемент*/

        int result;

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


        result = maximum_array_value(my_array);
        System.out.println();
        System.out.println("Maximum array element is " + result);
    }
}