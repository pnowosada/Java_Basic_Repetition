package java_exercises_3_SDA;

import java_exercises_3_SDA.Animals.*;
import java_exercises_3_SDA.Figures.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main_3SDA {
    public static void main(String[] args) {

        System.out.println("Cat 1:");
        Cat cat1 = new Cat("Tom");
        cat1.makeSound();
        System.out.println("Cat 2:");
        Cat cat2 = new Cat("Jerry");
        cat2.makeSound();
        System.out.println("\n");
        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        System.out.println("\n");
        for (Cat cat : catList) {
            cat.makeSound();
        }
        cat1.eatMouse();
        cat2.eatMouse();
        ///////////////////////////////
        System.out.println("\nDog 1:");
        Dog dog1 = new Dog("Bob");
        dog1.makeSound();
        System.out.println("\n");
        System.out.println("Dog 2:");
        Dog dog2 = new Dog("Berry");
        dog2.makeSound();
        //////////////////////////
        System.out.println("\n");
        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog1);
        animals.add(dog2);
        for (Animal animal : animals) {
            animal.makeSound();
        }
        ////////////////////
        System.out.println("\nCar 1");
        Car car1 = new Car();
        car1.move();
        ////////////////////
        System.out.println("\n");
        Vet someVet = new Vet();
        someVet.sayHello(cat1);
        ////////////////////
        System.out.println("\n");
        Vet someDog = new Vet();
        someDog.sayHello(dog1);
        ////////////////////
        System.out.println("\n");
        someVet.universalSayHello(cat1);
        someVet.universalSayHello(dog1);
        ////////////////////
        System.out.println("Exercises 11-13:");
        Rectangle rectangle=new Rectangle(1.6,6.4);
        System.out.println(rectangle.getArea()+"\n");

        Circle circle=new Circle(1.6);
        System.out.println(circle.getArea()+"\n");

        Triangle triangle=new Triangle(2.5,5.1);
        System.out.println(triangle.getArea()+"\n");
        ////////////////////
        List<Figure> figures=new LinkedList<>();
        figures.add(rectangle);
        figures.add(triangle);
        figures.add(circle);
        System.out.println("The sum of the areas is: ");
        double result =AreaCounter.countArea(figures);
        System.out.println(result);
        ////////////////////
        double Area=300.1;
        System.out.println(AreaCounter.checkArea(Area,figures));

    }
}
