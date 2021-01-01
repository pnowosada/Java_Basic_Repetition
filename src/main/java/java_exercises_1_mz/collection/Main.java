package java_exercises_1_mz.collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        Exercise_1 myArray=new Exercise_1(25);
        myArray.addToArray();
        myArray.printArray();
        System.out.println(myArray.getArraySize());
        myArray.printArraySize();
        myArray.multiplication(35);
        myArray.printArray();
        System.out.println("Exercise 2");
        Exercise_2 myList=new Exercise_2();
        myList.addElemList(1,22,53,4);
        System.out.println(myList.listLength());
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        myList.printList();

    }
}
