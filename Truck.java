import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Actor
{
    private int speed;
    
    /**
     * Initialize the speed for the Truck.
     */
    public Truck(int setSpeed)
    {
        speed = setSpeed;
    }
    /**
     * Act - do whatever the Truck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        
        if(isAtEdge())
        {
            setLocation( 0, getY());
        }
    }    
}
