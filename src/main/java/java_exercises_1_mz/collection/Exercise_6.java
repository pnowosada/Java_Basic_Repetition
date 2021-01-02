package java_exercises_1_mz.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Exercise_6 {
    private int inPutNumber, randomNumber;
    private String numberInString;
    Scanner scanner = new Scanner(System.in);
    Random randomGenerator = new Random();
    PriorityQueue<Integer> test = new PriorityQueue<>();

    public Exercise_6() {
        enterNumberAndRandom();
    }

    public void enterNumberAndRandom() {
        System.out.println("Write numbers:");
        numberInString = scanner.nextLine();
        inPutNumber = Integer.parseInt(numberInString);
        System.out.println("Added numbers: " + inPutNumber);

        System.out.println("It's time to choose " + inPutNumber + " numbers: ");
        for (int i = 0; i < inPutNumber; i++) {
            randomNumber=randomGenerator.nextInt(100)+1;
            test.add(randomNumber);
            System.out.println("Add to priority queue new number: "+randomNumber);
        }

        System.out.println("Queue number: ");
        int iterator =1;
        while (!test.isEmpty()){
            System.out.println(iterator+". in line "+test.poll());
            iterator++;
        }
    }
}
