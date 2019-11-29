package com.company.ThirdRoundTasks.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {

    public static double doubleValue_detector(String sentence) {

        Matcher matcher = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(sentence);
        double resultValue = 0;
        while (matcher.find()) {
            resultValue = Double.parseDouble(matcher.group(1));
            System.out.println(resultValue);
        }
        return resultValue;
    }
    public static double multiplication(double value) {

        value = value * 4;

        return value;
    }
    public static String string_Changer(String sentence, double local) {

        System.out.println();
        sentence = "Get a modern feel  with a smudge-resistant only for $" + local + ", you can finish now";
        return sentence;
    }
    public static void main(String[] args) {

        String sentence = "Get a modern feel  with a smudge-resistant only for $2.51, you can finish now";

        double foundValue = multiplication(doubleValue_detector(sentence));

        sentence = string_Changer(sentence, foundValue);

        System.out.println(sentence);
    }
}