package com.company.SecondTasks.Task5;



import java.util.Arrays;
import java.util.Scanner;

public class RepeatingValue {
    static int valueDefiner(int array[]) {

        Arrays.sort(array);
        int result = 0;
        int count = 1, checkCount;
        int popular = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            int check = array[i];
            checkCount = 0;
            for (int j = 1; j < array.length; j++){
                if (check == array[j]) {
                    checkCount++;

                    if (checkCount > count) {
                        popular = check;
                        count = checkCount;
                        result = checkCount;
                    }
                    if (checkCount == count) {
                        count = checkCount;
                        result = checkCount;
                    }

                }
            }
        }
        System.out.println(" ");
        System.out.print("Popular :" +popular+ " is repeated "+ result + " times,");
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

        valueDefiner(myArray);
    }
}
