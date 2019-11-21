package com.company.SecondTasks.Task4;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class ValueCounter {

    static int values_definer(int array[]) {
        int counter = 0;

        for (int i = 0; i <= array.length - 1; i++) {

            if (array[i] % 2 == 0 && array[i] % 3 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        /* Task: 4. Написать метод, который принимает в себя массив int*ов,
         подсчитывает количество элементов, которые делятся на 2,
          но не делятся на 3 (логические выражения) и возвращает (return) как int.*/
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

        result = values_definer(myArray);

        System.out.println();
        System.out.print("There are  <<" + result + ">>  values that count on 2 but not count on 3 ");
    }
}