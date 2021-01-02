package java_exercises_1_mz.OPP;

import lombok.Getter;
import lombok.Setter;

public class Person {
    @Getter
    @Setter
    private String name, surname;
    @Getter
    @Setter
    private int age;
    @Getter
    @Setter
    Address address;

    public Person() {

    }

    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(String name, String surname, int age,Address InPutAddress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address=InPutAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public void introduce() {
        System.out.println("Name: " + this.name + "\nSurname:" + this.surname + "\nAge:" + this.age+"\n"+address);
    }
}
