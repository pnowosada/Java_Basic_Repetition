package java_exercises_3_SDA.Figures;

public class Rectangle implements Figure{
    private Double height;
    private Double width;

    public Rectangle(Double height,Double width){
        this.width=width;
        this.height=height;
    }
    @Override
    public Double getArea(){
        return this.height*this.width;
    }
}
