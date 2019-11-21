package com.company.SecondTasks.Task5;

import java.util.Scanner;

public class RepeatingValue {
    static int values_definer(int[] array) {

        int popular=0;
        int temp = 0;

        int count = 0;
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] == array[k]) {
                    count++;
                    temp++;
                }
            }
            if (count == 1) {
                popular = array[j];
            }
            count = 0;
        }
        System.out.println("Popular value:" + popular + " times:" + temp);

        return popular;
    }
    public static void main(String[] args) {
        /* Task: 5. Написать метод, который принимает в себя массив int*ов
         и выводит в консоль счётчик и значение элемента,
          который повторяется больше всего раз*/

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

        System.out.println();

        values_definer(myArray);
    }
}
