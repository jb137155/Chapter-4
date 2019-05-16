package animals;


import types.Reptile;

/**
 * Write a description of class Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Reptile
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Zebra
     */
    public Zebra()
    {
        super("animals.Zebra", "White and black, and nice");
        this.age = "very old";
        
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
