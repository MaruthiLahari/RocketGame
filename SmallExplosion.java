import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallExplosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallExplosion extends Explosion
{
    /**
     * Act - do whatever the SmallExplosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        delay();
    }  
    public SmallExplosion()
    {
        getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2);
    }
}
