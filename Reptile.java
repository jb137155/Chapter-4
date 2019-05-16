package types;

import animal_qualities.Swimming;
import main.Animal;

public class Reptile extends Animal implements Swimming {

    public Reptile(){
        super("Reptiles", "They swim around in the water");
    }
    public Reptile(String name, String desc){
        super(name, desc);
    }
    public String makeNoise()
    {
        return "roaring noises";
    }
    public String eat()
    {
        return "meat";
    }
    public String swim() {
        return "Swim around with ease";}

}

