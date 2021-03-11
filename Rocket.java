import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (Lahari Maruthi) 
 * @version (rocket e rsion 1.0 or 24 th 12 2020)
 */
public class Rocket extends Actor
{
    /*non sattic varibale speed which controls speed of my rocket object*/
    private int speed;
    
    
   private int reloadTime;
   /* to get score when missile hits astriods*/
   public  int score;
    /* for lives in game  over */
   public int lives=5;
    /*below constructor intailize speed of the rocket object*/
    public Rocket(int speed)
    {
        this.speed=speed;
    }
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*act as main method*/
    public void act() 
    {
        move(this.speed);
        moveAround();
        wrapAround();
        rotate();
        reloadTime++;

        if(reloadTime>=30)

        {

         fire();
         dropMissile2();

        }
       
       
      
        hitByAsteriod();
    } 
    /*for rocket contro*/
    public void moveAround()
    {
        setImage("rocketWithoutBooster.png");
           this.speed=3;
       if(Greenfoot.isKeyDown("right"))
       {
           setImage("rocketWithBooster (1).png");
           this.speed=5;
           setRotation(0);
        }
        if(Greenfoot.isKeyDown("left"))
       {
           setImage("rocketWithBooster (1).png");
           this.speed=5;
           setRotation(180);
        }
        if(Greenfoot.isKeyDown("up"))
       {
           setImage("rocketWithBooster (1).png");
           this.speed=5;
           setRotation(270);
        }
        if(Greenfoot.isKeyDown("down"))
       {
           setImage("rocketWithBooster (1).png");
           this.speed=5;
           setRotation(90);
        }
        
    }
    public void wrapAround()
{
    int rx=getX();
    int ry=getY();
    /* world is super class and getWorld creates an object of world class and store in w variable*/
            World w=getWorld();
            /* we create an object because get width is in another class called world class so acceseed through object*/
            int width=w.getWidth()-1;
            int height=w.getHeight()-1;
            /* rx and ry gives current location of object*/
            if(rx==width)
            {
                setLocation(0,ry);
            }
            if (rx==0)
            {
                setLocation(width,ry);
                
            }
            if(ry==0)
            {
                setLocation(rx,height);
            }
            if(ry==height)
            {
                setLocation(rx,0);
            }
            
    
}
public void rotate()
{
    if(Greenfoot.isKeyDown("a"))
    {
    turn(5);
}
if(Greenfoot.isKeyDown("s"))
    {
    turn(-5);
    }
}

    public void fire()
    {
        
            
           if(Greenfoot.isKeyDown("f"))
           {
             addMissile(new Missile1());  
            }
            if(Greenfoot.isKeyDown("d"))
           {
             addMissile(new Missile2());  
            }
          
        }
        public void addMissile(Missile m)
        {
            getWorld().addObject(m,getX(),getY());
            reloadTime=0;
            if(m instanceof Missile1)
            {
                m.setRotation(getRotation());
            }
            
        }

  

public void dropMissile2()
{
    if(Greenfoot.isKeyDown("c"))
    {
        Missile2 m3=new Missile2();
        getWorld().addObject(m3,getX(),getY());
        reloadTime=0;
        
    }
}
/*Big Explosion and game over code*/
public void hitByAsteriod()
{
    if(isTouching(Asteriods.class))
    {
        getWorld().addObject(new BigExplosion(), getX(),getY());
        lives--;
        setLocation(53,374);
        
    }
}

}

