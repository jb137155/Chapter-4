package animals;

import types.Bird;

/**
 * Write a description of class animals.Parrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parrot extends Bird
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Parrot
     */
    public Parrot()
    {
        super("animals.Parrot", "blue and sometimes nice");
        this.age = "very young";
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * 
     */
    @Override
    public String makeNoise()
    {
        // put your code here
        return "chirping and flys.";
    }
    
    
}
