package java_exercises_1_SDA;

public class Exercise_10 extends Exercise_9 {
    public static boolean isModulo(int a, int b){
        if((a%b)==Exercise_9.myModulo(a, b)){
            return true;
        }else return false;

    }
}
