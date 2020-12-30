package java_exercises_3_SDA.Animals;

import lombok.Getter;
import lombok.Setter;

public class Cat extends AbstractAnimal implements Movable,Animal {

    private Integer mouseCounter;

    public Cat(String name) {
        super(name);
        this.name = name;
        this.mouseCounter = 0;
    }

    public Cat(String name, Integer mouseCounter) {
        super(name);
        this.name = name;
        this.mouseCounter = mouseCounter;
    }

    public void setMouseCounter() {
        this.mouseCounter = mouseCounter;
    }

    public Integer getMouseCounter() {
        return this.mouseCounter;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " goes meow");
    }

    public void eatMouse() {
        this.mouseCounter++;
        System.out.println("I ate " + mouseCounter + " mouse");
    }
    @Override
    public String move(){
        return "I am going";
    }


}
