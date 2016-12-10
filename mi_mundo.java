import greenfoot.*;
import java.util.*;
/**
 * Write a description of class mi_mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mi_mundo extends World
{
    private Fondo img0, img1;
    private Fondo imgA, imgB;
    private Fondo2 img2,img3;
    private Fondo2 imgX, imgY;
    private Barra imgM;
    private Indice imgI;
    public  Cañon cañon;
    public Counter counterP;
    public CounterDistance counterD;
    private Bala bala = new Bala();
    private Barra barra;
    private int X0, Y0, out, t, g=10;
    private int px = 10, py =10;
    protected boolean jugar = true;
    private int band =1;
    private int nivel = 1;
    private int velocidad = 15, p = 0;
    public int pF1 = 0;
        
    /**
     * Constructor for objects of class mi_mundo.
     * Atrapar Gaso te dara 5 seg mas de vuelo (t)
     * x= Vox * t
     * y = Voy * t - 1/2gt2
     */
    public mi_mundo() 
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1, false); 
        this.inicio();
       
    }
    
    public void act()
    {
        
        
        if(Greenfoot.isKeyDown("SPACE") &&  band ==1)
         {
              {
                imgA = new Fondo();
                addObject( imgA, getWidth()/2, getHeight()/2 );
                imgB = new Fondo();
                addObject( imgB, getWidth()/2, getHeight()/2 );
                regPun();
                band=0;
              }                  
          }
    
         if(band == 0)
         {
            lanzamiento();
            imgA.mueve_Fondo();
            imgB.mueve_Fondo();
            regPun();
            
         }
         
         if(bala.dameBand()==1)
        {
          removeObject(bala);
          
          if(p == 2)
            showText("Tus puntos se multiplican X2", 500, 250);
          else
          {
             if(p == 5)
               showText("Tus puntos se multiplican X5", 500, 250);
             else
               showText("Tus puntos se multiplican X10", 500, 250);
          }
          pF1=(bala.damePuntaje()) * p;
          //Greenfoot.stop();
          Greenfoot.delay(500);
          Greenfoot.setWorld(new Nivel2(pF1));
          
          
        }
        
        
    }
    
     
    public void comenzar() //Comienza el nivel 1
    {
        jugar = false;
        showText("Nivel 1", 900,50);
                
        // img0 = new Fondo();
        //addObject( img0, getWidth()/2, getHeight()/2 );
        
         img1 = new Fondo();
         addObject( img1, getWidth()/2, getHeight()/2 );
    
        counterP = new Counter();
        
        //bala = new Bala();
        //addObject( bala, 110,419 );
        
        cañon = new Cañon();
        addObject( cañon, 100,419 );
        
        imgM = new Barra();
        addObject(imgM, 850, 475);
        
        imgI = new Indice();
        addObject(imgI, 850, 475);
        
        ///lanzamiento();
        
    }
     
    public void lanzamiento()
    {
            addObject(bala, X0-100 ,Y0+30); 
            bala.Nivel = 1;
            bala.Mov=true;
            
            
                        
    }
    
    public void inicio()
    {
       removeObjects(getObjects(null));
       Empieza bjugar = new Empieza(this);
       Ayuda bayuda = new Ayuda(this);
       setBackground("inicio.gif");
       addObject(bjugar,264,317);
       addObject(bayuda,714,317);
    }
    
    public void ayuda()
    {
       removeObjects(getObjects(null));
       AyudaTx ayudaTx = new AyudaTx();
       addObject(ayudaTx,getWidth()/2,getHeight()/2);
       Regresar regresar = new Regresar(this);
       addObject(regresar,50,440);
    }
   
   
   public void regPun()
   {
       p = imgI.detPun();
       counterP.setValue(bala.damePuntaje());
       addObject(counterP,50,50);
       
       
                      //pm1 = p;
   }
    
      public int puntajeFinal1()
   {
    
      return pF1;
      
   }


}

 /*  switch(nivel)
            {
               case 1:
               imgA = new Fondo();
               addObject( imgA, getWidth()/2, getHeight()/2 );
               imgB = new Fondo();
               addObject( imgB, getWidth()/2, getHeight()/2 );
               band= 0;
               break;
            
               case 2:
               imgX = new Fondo2();
               addObject( imgX, getWidth()/2, getHeight()/2 );
               imgY = new Fondo2();
               addObject( imgY, getWidth()/2, getHeight()/2 );
               band= 0;
               break;                     
               } 
 */