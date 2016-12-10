import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
/**
 * Write a description of class Indice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Indice extends Actor
{
  //  int x = obtX(int x);
    int bandI=0; //Bandera para el indice

   int inicio=700;
   int fin = 1000;
   int x=850;
   int band=0;
   int ptos = 0;
   int bind =1;
    /**
     * Act - do whatever the Indice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(bandI==0)
        {
            move(5);
        }
        if(bandI==1)
        {
            move(-5);
        }
        if(getX() == fin )
        {
         bandI=1;
        }
        if(getX() == inicio)
        {
         bandI=0;
        }         
    }

   public int detPun()
   {
                  
            switch(bind)
            {
               case 1:
                        if(getX() <= 800)
                            ptos = 2;
                        if(getX() < 900 && getX() > 800)
                            ptos = 10;
                        if(getX() >= 900 && getX() <= 1000)
                            ptos = 5;
                        bind = 2;
                        break;
               case 2:
                        if(getX() <= 800)
                            ptos += 2;
                        if(getX() < 900 && getX() > 800)
                            ptos += 10;
                        if(getX() >= 900 && getX() <= 1000)
                            ptos += 5;
                        bind = 3;
                        break;
               case 3:  
                        if(getX() <= 800)
                            ptos += 2;
                        if(getX() < 900 && getX() > 800)
                            ptos += 10;
                        if(getX() >= 900 && getX() <= 1000)
                            ptos += 5;
                        bind = 1;
               break;
               
               }
              
            return ptos;
           }
}