import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  abstract class Missile extends Actor
{
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int gravity;
    abstract public void drop();
    public Missile(int imageSize)
    {
      getImage().scale(getImage().getWidth()/imageSize,getImage().getHeight()/imageSize);  
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
