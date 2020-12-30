package java_exercises_3_SDA.Animals;

public class Vet {
    public void sayHello(Cat someCat){
        System.out.println("Hello cat "+someCat.getName());
    }
    public void sayHello(Dog someDog){
        System.out.println("Hello cat "+someDog.getName());
    }
    public void universalSayHello(AbstractAnimal animal){
        System.out.println("Hello "+animal.getName());
    }
}
