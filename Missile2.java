import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MIssile2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile2 extends Missile
{
    /**
     * Act - do whatever the MIssile2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        // Add your action code here
        drop();
    }    
    public Missile2()
    {
        
       super(2);
    }
    public void drop()
    {
        if(isAtEdge())
        {
           getWorld().removeObject(this) ;
        }
        else
        {
            gravity++;
            setLocation(getX(),getY()+gravity);
        }
    }

}
