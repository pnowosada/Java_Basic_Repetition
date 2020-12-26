package java_exercises_1_SDA;

public class Exercise_7 {
    public static int[] arithmeticSequence(int firstValue, int gap, int length){
        int[]array=new int[length];
        array[0]=firstValue;
        for(int index=1;index<length;index++){
            array[index]=gap + array[index-1];
        }

        return array;
    }
/* SECOND SOLUTION:
public static int arithmeticSequence(int firstValue, int gap, int length){
        int currentValue= firstValue;
        array[0]=firstValue;
        for(int index=1;index<length;index++){
            currentValue=currentValue + gap;
        }

        return currentValue
    }
 */
}
