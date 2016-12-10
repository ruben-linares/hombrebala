import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
       protected mi_mundo mun;

    public Menu(mi_mundo m) 
    {
        mun=m;
    }
    
    public void bienvenida()
    {
       mun.inicio();
    }
    
    public void comenzar()
    {
       mun.comenzar();
    }
    
    public void ayuda()
    {
       mun.ayuda();
    }
}
