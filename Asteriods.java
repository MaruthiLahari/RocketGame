import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteriods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteriods extends Actor
{
    /**
     * Act - do whatever the Asteriods wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public  int currentWidth;
   public int currentHeight;
   public int givenWidth;
   public  int givenHeight;
   public GreenfootImage img;
   /* to get missile current x and current y*/
   private World world;
 private int currentX;
 private int currentY;
 /* */
 private int countWidth;
   public Asteriods()
   {
       
    }
    public Asteriods(int givenWidth, int givenHeight, int choice)
    {
        this.givenWidth=givenWidth;
        this.givenHeight=givenHeight;
        configure();
        
        if(choice==1)
        {
            changeIncSize();
        }
        else
        {
            changeDeccSize();
        }
    }
    
    public void act() 
    {
        // Add your action code here.
        move(2);
        bounceback();
        hitbyMissile();
        
    } 
    /* to get missile current x and current y*/
    public void updateConfigure()
    {
       world=getWorld();
       currentX=getX();
       currentY=getY();
    }
    public void bounceback()
    {
         if(isAtEdge())

    {

        int randomDegree=Greenfoot.getRandomNumber(180);

        turn(randomDegree);

    }
    }
    public void configure()
    {
        img=getImage();
        currentWidth=img.getWidth();
        currentHeight=img.getHeight();
        
        
        
    }
    public void changeIncSize()
    {
        
        img.scale(currentWidth*this.givenWidth, currentHeight*this.givenHeight);
       
       }
    public void changeDeccSize()
    {
        
        img.scale(currentWidth/this.givenWidth, currentHeight/this.givenHeight);
         }   
         
        /* only method to destroy asteriod when missile touches asteriod and two small asteriod should appear*/
        public void hitbyMissile()
        {
            
            if(isTouching(Missile1.class))
            {
                /* removing missile when touches astriods*/
                removeTouching(Missile1.class);
                Space.rocket.score++;
                getWorld().addObject(new SmallExplosion(), getX(), getY());
                if(getImage().getWidth()<=58)
                {
                getWorld().removeObject(this);
            }
            else
            {
            
              
               divideAsteriod(new Asteriods());
               divideAsteriod(new Asteriods());
               getWorld().removeObject(this);
               }
              }
            }
            public void divideAsteriod(Asteriods a)
            {
             getWorld().addObject(a,getX(),getY());
             int rn=Greenfoot.getRandomNumber(360);
             a.setRotation(rn);
            }
            
        }
    
         
         
         