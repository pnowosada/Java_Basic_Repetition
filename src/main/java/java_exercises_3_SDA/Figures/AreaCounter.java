package java_exercises_3_SDA.Figures;

import java.util.List;

public class AreaCounter {
    public static Double countArea(List<Figure> figures){
        Double sumArea = 0.0;
        for(Figure figure:figures){
            sumArea=sumArea+figure.getArea();
        }
        return sumArea;
    }
    public static boolean checkArea(double Area,List<Figure>figures){
        Double result= countArea(figures);
        return result<=Area;

    }
}
