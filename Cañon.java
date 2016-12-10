import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cañon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cañon extends Actor
{
    private int x,y;
    /**
     * Act - do whatever the cañon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if(Greenfoot.isKeyDown("UP"))
         {
             if(getRotation()>270 || getRotation()==0)
             turn(-2);         
         }
         if(Greenfoot.isKeyDown("DOWN"))
         {
             if(getRotation()>270 || getRotation()>0)
             turn(2);
         }
    }
    
    public int dimeX()
    {
        int xr;        
        xr = getRotation();        
        return(xr);        
    }
    
    public int dimeY()
    {
        int yr;
        yr = getRotation();
        return(yr);
    }
}
