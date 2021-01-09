package java_exercises_2_mz.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_2 {
    public static boolean checkPostCode(String inputAddressCode){
        Pattern myPatter=Pattern.compile("\\d{2}?[-]\\d{3}");
        Matcher myMatcher=myPatter.matcher(inputAddressCode);
        return myMatcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Write Post code: ");
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        boolean result=checkPostCode(input);
        System.out.println("Regex is : "+result);
    }

}
