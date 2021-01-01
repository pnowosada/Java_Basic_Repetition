package java_exercises_1_mz.collection;

import java.util.ArrayList;
import java.util.List;

public class Exercise_3 {
    ArrayList<Double> list=new ArrayList<>();
    public List<Double> addElementList(double... elements){
        for (double element : elements) {
            list.add((double) element);
        }
        return this.list;
    }
    public double additionSecondAndLast(){
        double result=this.list.get(1)+this.list.get(list.size()-1);
        return result;
    }
    public double multiplicationFirstAndLast(){
        double result=this.list.get(0)*this.list.get(list.size()-1);
        return result;
    }
    public double divideFirstAndPenultimate(){
        double result=this.list.get(1)/this.list.get(list.size()-2);
        return result;
    }
}
