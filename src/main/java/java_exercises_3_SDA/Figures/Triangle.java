package java_exercises_3_SDA.Figures;

public class Triangle implements Figure{

    private Double height;
    private Double base;

    public Triangle(Double height,Double base){
        this.base=base;
        this.height=height;
    }
    @Override
    public Double getArea(){
        return Math.abs(0.5)*this.height*this.base;
    }

}
