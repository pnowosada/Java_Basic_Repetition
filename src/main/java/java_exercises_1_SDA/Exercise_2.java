package java_exercises_1_SDA;

public class Exercise_2 {
    public static void checkingPrimeNumber(int number) {
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0) {
                isPrime = false;
                break;
            }

        }
        if(isPrime){
            System.out.println("This is prime number");
        }
        else {
            System.out.println("This is NOT prime number");
        }

    }
}
