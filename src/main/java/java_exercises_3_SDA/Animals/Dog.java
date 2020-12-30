package java_exercises_3_SDA.Animals;

import lombok.Getter;
import lombok.Setter;

public class Dog extends AbstractAnimal implements Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " goes hau hau");
    }
}
