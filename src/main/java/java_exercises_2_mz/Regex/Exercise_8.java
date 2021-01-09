package java_exercises_2_mz.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_8 {
    public static boolean checkVatNumber(String input){
        Pattern myPattern=Pattern.compile("[F][V][/][0-9]{1,4}[/][0-3]{1}[0-9]{1}[/][2][0][1][8]");
        Matcher myMatcher= myPattern.matcher(input);
        return myMatcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Write VAT number: ");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        boolean result=checkVatNumber(input);
        System.out.println("Regex is: "+result);
    }
}
