package java_exercises_2_mz.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_6 {
    public static boolean checkCode(String input){
        Pattern myPattern = Pattern.compile("[A-Z]{3}+[0-9]{5}+[a-z]+[A-Z]");
        Matcher myMatcher= myPattern.matcher(input);
        return myMatcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Write code:");
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        boolean result=checkCode(input);
        System.out.println("Regex is: "+ result);
    }
}
