import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile1 extends Missile
{
    /**
     * Act - do whatever the missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    private int currentWidth;
    private int currentHeight;
    
    
    public void drop()
    {
        gravity++;
        setLocation(getX(), getY()+gravity);
    }
    public Missile1()
    {
        super(3);
       
    }
   
    public void act() 
    {
        
        
        
        dissapear();
        move(4);
        if(gravity<=8)
        {
        drop();
    }
    
        // Add your action code here.
    }  
    
     
    
    public void dissapear()
    {
        if(isAtEdge())  
        {
           getWorld().removeObject(this); 
            
        }
    }
   
    
}
