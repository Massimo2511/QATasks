package com.company.ThirdRoundTasks.Task1;

import java.util.Arrays;

public class RevertedString {
    public static String revert_String(String sentence) {

        byte[] stringByteArray = sentence.getBytes();

        byte[] resultArray = new byte[stringByteArray.length];

        for (int i = 0; i < stringByteArray.length; i++) {
            resultArray[i] = stringByteArray[stringByteArray.length - i - 1];
        }
        sentence = new String(resultArray);

        return sentence;
    }
    public static void main(String[] args) {
        String sentence = "Everything is perfect:=)";

        System.out.println("Sentence before revert :");
        System.out.println(sentence);
        sentence = revert_String(sentence);
        System.out.println();

        System.out.println("Sentence before revert :");
        System.out.println(sentence);

    }
}