package java_exercises_2_mz.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_1 {
    public static boolean checkingDigitInput(String input){
        Pattern pattern1=Pattern.compile("[0-9]+");
//      Pattern pattern2=Pattern.compile("\\d+");
        Matcher matcher1=pattern1.matcher(input);
        return matcher1.matches();

    }


    public static void main(String[] args) {
        System.out.println("Write number: ");
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        boolean result=checkingDigitInput(input);
        System.out.println("Regex is : "+result);

    }



}
