package java_exercises_1_mz.collection;

public class Main {
    public static void main(String[] args) {

        Exercise_1 myArray=new Exercise_1(25);
        myArray.addToArray();
        myArray.printArray();
        System.out.println(myArray.getArraySize());
        myArray.printArraySize();
        myArray.multiplication(35);
        myArray.printArray();
    }
}
