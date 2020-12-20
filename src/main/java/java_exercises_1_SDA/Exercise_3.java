package java_exercises_1_SDA;

public class Exercise_3 {
    public static int countSum(int x,int y) {
        int sum = 0;
        for (int i = x; i < y; i++) {
//          sum=sum+i; "THE SAME"
            sum += i;

        }
    return sum;

    }
}
