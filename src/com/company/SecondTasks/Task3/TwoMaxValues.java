package com.company.SecondTasks.Task3;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Scanner;

public class TwoMaxValues {

    public static int[] max_array_values(int[] array) {

        int maxValue1 = array[0];
        int maxValue2 = array[0];

        for (int i = 0; i <= array.length - 1; i++) {
            if (maxValue1 < array[i]) {
                maxValue2 = maxValue1;
                maxValue1 = array[i];
            } else if (maxValue2 <= array[i]) {
                maxValue2 = array[i];
            } else {
                maxValue2 = maxValue1;
            }
        }
        System.out.println();
        System.out.println("Maximum First Element is : " + maxValue1);
        System.out.println("Maximum Second Element is : " + maxValue2);
        return array;
    }
    public static void main(String[] args) {

        /* Task:3. Написать метод, который принимает в себя массив int*ов,
        находит 2 максимальных значения и возвращает их как массив из 2-x int*ов.*/

        Scanner arraySize = new Scanner(System.in);
        Scanner arrayElements = new Scanner(System.in);

        System.out.println("Enter the length of arrays: ");
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
        max_array_values(myArray);
    }
}