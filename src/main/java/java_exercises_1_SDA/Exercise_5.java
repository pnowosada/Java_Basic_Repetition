package java_exercises_1_SDA;

public class Exercise_5 {
    public static void findTopAndMin(int... table) {
        if(table.length<1){
            System.out.println("Array is too short");
            return;
        }
        int minimum =table[0];
        int maximum =table[0];
        for(int element:table){
            if(element>maximum){
                maximum=element;
            }else if(element<minimum){
                minimum=element;
            }
        }
        System.out.println("Minimum value: "+minimum);
        System.out.println("Maximum value: "+maximum);
    }

}
