package com.company.FirstTasks.Task_3_Fingers;

public class FingerDefiner {

    public static void definer(int finger) {

        switch (finger) {
            case 1:
                System.out.println("Thumb finger");
                break;

            case 2:
                System.out.println("Pointer finger");
                break;
            case 3:
                System.out.println("Middle finger");
                break;
            case 4:
                System.out.println("Ring finger");
                break;
            case 5:
                System.out.println("Small finger");
                break;
            default:
                System.out.println("Incorrect input: Try again");

        }
    }
}