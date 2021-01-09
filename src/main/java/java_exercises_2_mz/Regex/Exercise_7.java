package java_exercises_2_mz.Regex;

import javax.script.ScriptContext;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_7 {
    public static boolean checkSerialNumber(String input){
        Pattern myPattern = Pattern.compile("[0-9A-Z|\\&]{5}-[0-9A-Z]{5}-[0-9A-Z]{5}-[0-9A-Z]{5}-[0-9A-Z]{5}");
        Matcher myMatcher= myPattern.matcher(input);
        return myMatcher.matches();
    }
    public static void main(String[] args) {
        System.out.println("Write serial number");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        boolean result=checkSerialNumber(input);
        System.out.println("Regex is: "+result);
    }

}
