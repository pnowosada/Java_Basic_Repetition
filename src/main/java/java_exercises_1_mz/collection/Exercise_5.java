package java_exercises_1_mz.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Exercise_5 {
    ArrayList<String> nameList2=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public void writeNames(){
        String tempName;
        for(int i=0;i<=5;i++){
            tempName= scanner.nextLine();
            nameList2.add(tempName);
        }
        System.out.println();
    }
    public void printTable(){
        int j=0;
        while(j<nameList2.size()-1){
            System.out.print(nameList2.get(j)+" | ");
            j++;
        }
    }

}
