package java_exercises_1_SDA;

public class TablePrinter {
    public static void printTable(int...table) {
        for (int element:table){
            System.out.print("["+element+"]");
        }
        System.out.println();
    }
}
