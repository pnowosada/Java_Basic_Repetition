package java_exercises_2_mz.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_3 {
    public static boolean checkingUserLogin(String input){
        Pattern myPattern=Pattern.compile("[0-9a-zA-Z]{8,16}");
        Matcher myMatcher= myPattern.matcher(input);
        return myMatcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Write login: ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        boolean result=checkingUserLogin(input);
        System.out.println("Regex is: "+result);
        if (result!=true){
            System.out.println("Please write login again");
        }
    }
}
