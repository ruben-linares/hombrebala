import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Final here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final extends World
{
    public Counter counterF;
    private mi_mundo N1;
    private Nivel2 N2;
    private Nivel3 N3;
    int puntosFinales;
    //int F1=N1.puntajeFinal();
    //int F2=N2.puntajeFinal();
    //int F3=N3.puntajeFinal();
    
    
    /**
     * Constructor for objects of class Final.
     * 
     */
    public Final(int puntFin3)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000, 500, 1,false); 
        counterF = new Counter();
        puntosFinales = puntFin3;
    }
    
    public void act()
    {
       //puntosFinales = N1.puntajeFinal1()+N2.puntajeFinal2()+N3.puntajeFinal2();
       counterF.setValue(puntosFinales);
       addObject(counterF,500,250);
       //showText(puntosFinales.
       
    }
    
}
