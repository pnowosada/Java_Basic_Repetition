package java_exercises_1_mz.collection;

import java.util.ArrayList;
import java.util.List;

public class Exercise_4 {
    List<String> nameList=new ArrayList<>();
    public List<String> addNameList(String... elements){
        for(String element:elements){
            nameList.add(element);
        }
        return this.nameList;
    }
    public void printNameList(){
        for(String element:nameList){
            System.out.print(element + " | ");
        }
        System.out.println();
        for(int i= nameList.size()-1;i>=0;i--){
            System.out.print(nameList.get(i)+" | ");
        }

    }


}
