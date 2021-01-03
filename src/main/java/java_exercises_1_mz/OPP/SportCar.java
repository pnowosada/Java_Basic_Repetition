package java_exercises_1_mz.OPP;

import lombok.Setter;

public class SportCar extends Car {

    public SportCar(String producer, String model, String color, int seatsNumber, String engine){
        this.getProducer();
        this.getModel();
        this.getColor();
        this.getSeatNumber();
        this.getEngine();
    }
    public SportCar(String producer, String model, String color, int seatsNumber){
        super(producer, model, color);
        this.getSeatNumber();
    }
}
