package com.company.SecondTasks.Task2;

import java.util.Scanner;

public class RevertArray {

    static int revert_Array(int array[]) {

        System.out.println();
        System.out.println("Reverted array is : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");


        }

        return array[array.length - 1];
    }


    public static void main(String[] args) {

        /* Task: 2. Написать метод, который переворачивает массив*/


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

        revert_Array(my_array);

    }
}