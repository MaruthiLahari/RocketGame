import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static  Rocket rocket;
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        rocket=new Rocket(2);
        addObject(rocket, getWidth()/2,getHeight()/2);
      prepare();
        addObject(new Asteriods(), 202,120);
         addObject(new Asteriods(3,3,1),170,110);
         addObject(new Asteriods(2,2,1),119,235);
         addObject(new Asteriods(),58,58);
         
         
         
       
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    public void act()
    {
        showText("Score:"+Space.rocket.score,100,50);
        youWin();
         /* game over */
        showText("Lives:"+Space.rocket.lives,200,50);
        /* calling a game over method*/
        gameOver();
    }
    /* ypu win only code*/
    public void youWin()
    {
        if(Space.rocket.score==5)
        {
            addObject(new YouWin(),getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
    }
    /* game over code and in rocket also*/
    public void gameOver()
    {
       if(Space.rocket.lives==0)
       {
         addObject(new GameOver(), getWidth()/2, getHeight()/2);
         Greenfoot.stop();
         
         
        }
    }
    
}
