package java_exersises_2_SDA;

import java.util.Scanner;

public class Exersise_1 {
    public static void weekName(int numberOfWeekDay) {

        switch (numberOfWeekDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Write number of day week again : ");
                break;
        }

    }

    }

