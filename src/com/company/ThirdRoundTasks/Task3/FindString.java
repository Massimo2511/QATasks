package com.company.ThirdRoundTasks.Task3;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindString {
    public static String getNextWord(String str, String word){
        Pattern pattern = Pattern.compile(word+"\\W+(\\w+)");
        Matcher matcher = pattern.matcher(str);
        String result;
        result= matcher.find()? matcher.group(1):null;
        result=result.toUpperCase(Locale.forLanguageTag(result));
        return result;
    }
    public static void main(String[] args) {

        String sentence ="Get a modern feel  with a smudge-resistant only for $2.50, you can finish now";

        String patternString = "feel";

        String result = getNextWord(sentence,patternString);

        System.out.println("Result : "+ result);
    }
}