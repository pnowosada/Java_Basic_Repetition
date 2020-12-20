package java_exercises_1_SDA;

public class Exercise_4 {
    public static int[] swapNumbers(int ... array) {
        if(array.length<2){
            System.out.println("Array is to short");
            return array;
        }
        int tmp=array[0];
        array[0]=array[array.length-1];
        array[array.length-1]=array[0];
        return array;
    }
    public static void printTable(int... table){
        for(int element:table){
            System.out.print("["+element+"]");
        }
        System.out.println();
    }
}
