package com.company.ThirdRoundTasks.Task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceDefiner {

        public static double doubleValue_detector(String sentence) {

            Matcher matcher = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(sentence);
            double resultValue = 0;
            int counter=0;
            while (matcher.find()) {
                counter++;
                if(counter>1&&counter<counter+1) {
                    resultValue = Double.parseDouble(matcher.group(1));
                }
            }
            return resultValue;
        }
        public static void main(String[] args) {

            double result;

            String sentence = "Get a modern feel  with a smudge-resistant only for $4.50 $2.50, you can finish now3.5";

            System.out.println(sentence);

            result=doubleValue_detector(sentence);

            System.out.println("Needed value is : "+result);
        }
    }

