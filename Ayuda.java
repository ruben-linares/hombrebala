import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends Menu
{
    public Ayuda(mi_mundo m)
    {
       super(m);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {         
          super.ayuda();
        }
    }    
}
