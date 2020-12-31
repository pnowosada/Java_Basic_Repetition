package java_exercises_3_SDA.Figures;

public class Circle implements Figure{
    private Double radius;

    public Circle(Double radius){
        this.radius=radius;
    }
    @Override
    public Double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
