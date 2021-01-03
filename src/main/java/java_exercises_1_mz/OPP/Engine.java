package java_exercises_1_mz.OPP;

import lombok.Getter;
import lombok.Setter;

public class Engine {
    @Getter
    @Setter
    private double capacity,horsePower,fuelConsumption;

    public Engine(double capacity,double horsePower,double fuelConsumption){
        this.capacity=capacity;
        this.fuelConsumption=fuelConsumption;
        this.horsePower=horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "capacity=" + capacity +
                ", horsePower=" + horsePower +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public void showDatabase(){
        System.out.println("Capacity = "+this.capacity+"\nHorse Power = "+this.horsePower+
                "\nFuel comsumption = "+this.fuelConsumption);
    }
}
