package com.company.SecondTasks.Task1;

import java.util.Scanner;

public class MyArray {
    static int maximum_array_value(int array[]) {
        int maxValue = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (maxValue <= array[i])
                maxValue = array[i];
        }
        return maxValue;
    }


    public static void main(String[] args) {


        /* Task: 1.Написать метод, который принимает в себя массив int*ов и
        возвращает (return) максимальный элемент*/

        int result;

        Scanner arraySize = new Scanner(System.in);
        Scanner arrayElements = new Scanner(System.in);


        System.out.println("Enter the length of array: ");

        int arrayLength = arraySize.nextInt();
        int[] myArray = new int[arrayLength];


        System.out.println("Enter elements of  your array: ");
        for (int i = 0; i <= arrayLength - 1; i++) {
            myArray[i] = arrayElements.nextInt();
        }

        System.out.println("Entered array is : ");
        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.print(myArray[i] + " ");

        }


        result = maximum_array_value(myArray);
        System.out.println();
        System.out.println("Maximum array element is " + result);
    }
}