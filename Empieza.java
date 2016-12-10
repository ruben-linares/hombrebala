import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Empieza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empieza extends Menu
{
   public Empieza(mi_mundo m)
    {
       super(m);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {         
          super.comenzar();
          mun.jugar=true;
        }
    }    
}
