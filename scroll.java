import greenfoot.*;

/**
 * Write a description of class scroll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scroll extends Actor
{
    /**
     * Act - do whatever the scroll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void mueve_Fondo()
    {
        if(getX() < -getImage().getWidth()/15){
           setLocation(getX() + getWorld().getWidth(), getY() );
        }
        setLocation( getX()-5, getY());
    }
    
    public void mueve_Fondo2()
    {
        if(getX() < -getImage().getWidth()/15){
           setLocation(getX() + getWorld().getWidth(), getY() );
        }
        setLocation( getX()-5, getY());
    }
        
}
