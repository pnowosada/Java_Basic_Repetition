package java_exercises_1_mz.collection;

public class Main {
    public static void main(String[] args) {
/**************************************************************************************/
        System.out.println("Exercise 1");
        Exercise_1 myArray=new Exercise_1(25);
        myArray.addToArray();
        myArray.printArray();
        System.out.println(myArray.getArraySize());
        myArray.printArraySize();
        myArray.multiplication(35);
        myArray.printArray();
/**************************************************************************************/
        System.out.println("Exercise 2");
        Exercise_2 myList=new Exercise_2();
        myList.addElemList(1,22,53,4);
        System.out.println(myList.listLength());
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        myList.printList();
/****************************************************************************************/
        System.out.println("Exercise 3");
        Exercise_3 myList2=new Exercise_3();
        myList2.addElementList(1.1,2.1,1.1,1.1,3.3,4.4,1.1,1.1,3.3);
        System.out.println("Adding the first and penultimate expression: "+myList2.additionSecondAndLast());
        System.out.println("Multiply the first and last expressions: "+myList2.multiplicationFirstAndLast());
        System.out.println("Dividing the first and penultimate expressions: "+myList2.divideFirstAndPenultimate());
/****************************************************************************************/
        System.out.println("Exercise 4");
        Exercise_4 myList3=new Exercise_4();
        myList3.addNameList("Jan","Tim","Jim","Tom","Jimmy");
        myList3.printNameList();
/****************************************************************************************/
        Exercise_5 myList4= new Exercise_5();
        System.out.println("\nExercise 5:");
        //names:
        // Jim
        // John
        // Tim
        // Tom
        // ED
        myList4.writeNames();
        myList4.printTable();
/****************************************************************************************/
        Exercise_6 myList5=new Exercise_6();
        System.out.println("\nExercise 6:");
        myList5.enterNumberAndRandom();
    }


}
