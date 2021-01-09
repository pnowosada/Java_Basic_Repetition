package java_exercises_2_mz.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_4 {
    public static boolean checkRegex(String input) {
        Pattern myPattern = Pattern.compile(".*ala.*");
        Matcher myMatcher = myPattern.matcher(input);
        return myMatcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Write sentence: ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        boolean result=checkRegex(input);
        System.out.println("Regex is: "+result);
        if (result!=true){
            System.out.println("Please write sentence again");
        }
    }


}
