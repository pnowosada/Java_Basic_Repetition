package java_exercises_1_mz.OPP;

public class Main {
    public static void main(String[] args) {
        Engine engine1= new Engine(650.0,200.0,25.0);
        Person person1 = new Person("Mike","MacPherson",12);
        Address address1=new Address("Cicha","Gdansk","Poland",11,1);
        person1.introduce();
        Car car=new Car("Ford","Mondeo","Black");
        System.out.println(car.getColor());
        System.out.println(car.getEngine());


    }


}
