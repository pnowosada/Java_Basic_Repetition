package java_exercises_3_SDA.Animals;

public abstract class AbstractAnimal {
    protected String name;
    public AbstractAnimal(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
