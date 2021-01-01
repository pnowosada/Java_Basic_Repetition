package java_exercises_1_mz.collection;

import java.util.ArrayList;
import java.util.List;

public class Exercise_2 {
    private List<Integer> exList = new ArrayList<>();

    public List<Integer> addElemList(int... elements) {
        for (int element : elements) {
            exList.add(element);
        }
        return this.exList;
    }

    public int listLength() {
        return exList.size();
    }

    public Integer getFirst() {
        return exList.get(0);
    }

    public Integer getLast() {
        return exList.get(exList.size() - 1);
    }

    public void printList() {
        for (int i = 0; i < exList.size(); i++) {
            System.out.print(exList.get(i) + " ");
        }
        System.out.println();
    }

}
