package java_exercises_1_SDA;

public class Main_1SDA {
    public static void main(String[] args) {
        System.out.println("Exercise 1 :");
        Exercise_1.multiplicationTable(5);

        System.out.println("\nExercise 2 :");
        Exercise_2.checkingPrimeNumber(11);

        System.out.println("\nExercise 3 :");
        System.out.println(Exercise_3.countSum(4, 6));

        System.out.println("\nExercise 4 :");
        int[] array = Exercise_4.swapNumbers(1, 2, 3, 4);
        TablePrinter.printTable(array);

        System.out.println("\nExercise 5 :");
        Exercise_5.findTopAndMin(55, 2, 0, 58, 1);

        System.out.println("\nExercise 6 :");
        int[] array1 = Exercise_6.minusCounter(-10, -111, 0, 44, -452);
        TablePrinter.printTable(Exercise_6.minusCounter(array1));

        System.out.println("\nExercise 7 :");
        TablePrinter.printTable(Exercise_7.arithmeticSequence(1, 2, 10));

        System.out.println("\nExercise 8 :");
        System.out.println(Exercise_8.isArithmetic(2,1,7));
    }
}
