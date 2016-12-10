import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Regresar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Regresar extends Menu
{
    public Regresar(mi_mundo m)
    {
       super(m);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {         
          super.bienvenida();
        }
    }    
}
