package com.company.SecondTasks.Task2;

import java.util.Scanner;

public class RevertArray {

   public static void revert_Array(int [] array) {

       int[] reversed = new int[array.length];
       for (int i = 0; i < array.length; i++) {
           reversed[i] = array[array.length - 1 - i];
       }
       System.arraycopy(reversed, 0, array, 0, array.length);
   }
    public static void main(String[] args) {

        /* Task: 2. Написать метод, который переворачивает массив*/

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

        revert_Array(myArray);

        System.out.println("Reverted array : ");
        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
