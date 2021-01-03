package java_exercises_1_mz.OPP;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class Car {

    @Getter
    @Setter
    private String producer,model,color;
    private short seatNumber;

    String engine;

    public Car(){
        this.seatNumber=2;
    }

    public Car(String producer,String model,String color){
        this.producer=producer;
        this.model=model;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatNumber=" + seatNumber +
                ", engine='" + engine + '\'' +
                '}';
    }
}
