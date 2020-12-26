package java_exercises_1_SDA;

public class Exercise_8 {
    public static boolean isArithmetic(int... tab){
        if(tab.length<2){
            return false;
        }
        boolean isSeries= true;
        int diff=tab[1]-tab[0];
        for(int index=2;index<tab.length; index++){
            int diff1=tab[index]-tab[index-1];
            if(diff!=diff1){
                isSeries=false;
                break;
            }
        }
        return isSeries;
    }
}
