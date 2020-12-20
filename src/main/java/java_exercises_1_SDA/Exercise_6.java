package java_exercises_1_SDA;

public class Exercise_6 {
    public static int[] minusCounter(int... numbers) {
        int counter=0;
        for(int element:numbers){
            if(element<0) counter++;
        }
        int[]array=new int[counter];
        int index=0;
        for(int element:numbers){
            if(element<0){
                array[index]=element;
                index++;
            }
        }
        return array;

    }

}
