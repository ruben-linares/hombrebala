import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends World
{
    private Fondo3 img4,img5;
    private Fondo3 imgW, imgZ;
    private Barra imgM;
    private Indice imgI;
    public  Cañon cañon;
    private Bala bala = new Bala();
    private Barra barra;
    private int X0, Y0, out, t, g=10;
    private int px = 10, py =10;
    protected boolean jugar = true;
    private int band =1;
    public Counter counterP;
    private int nivel = 1, pun =0;
    private int velocidad = 15,p = 0;
    public int pF3 = 0;
    
     /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel3(int puntFin2)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1,false); 
          comenzar2();
          pF3=puntFin2;
        
    }
    
    public void act()
    {
      if(Greenfoot.isKeyDown("SPACE") &&  band ==1)
        {
                
            imgW = new Fondo3();
                addObject( imgW, getWidth()/2, getHeight()/2 );
                imgZ = new Fondo3();
                addObject( imgZ, getWidth()/2, getHeight()/2 );
                regPun();
                band=0;
                                    
         }
         
        if(band == 0)
          {
          
            lanzamiento();
            imgW.mueve_Fondo2();
            imgZ.mueve_Fondo2();
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
          pF3+=bala.damePuntaje() * p;
          Greenfoot.delay(500);
          Greenfoot.setWorld(new Final(pF3));
          
        }
          
    }
    
        public void comenzar2() //Comienza el nivel 2
    {
        jugar = false;
          
        
         //img2 = new Fondo2();
        //addObject( img0, getWidth()/2, getHeight()/2 );
        counterP = new Counter();
         img5 = new Fondo3();
         addObject( img5, getWidth()/2, getHeight()/2 );
    
        //bala = new Bala();
        //addObject( bala, 110,419 );
        
        cañon = new Cañon();
        addObject( cañon, 100,419 );
        
        imgM = new Barra();
        addObject(imgM, 850, 475);
        
        imgI = new Indice();
        addObject(imgI, 850, 475);
        //band=1;
        ///lanzamiento();
        
    }
    
        public void lanzamiento()
    {
            addObject(bala, X0-100 ,Y0+30); 
            bala.Nivel = 3;
            bala.Mov=true;
    }
    public void regPun()
   {
       p = imgI.detPun();
       counterP.setValue(bala.damePuntaje());
       addObject(counterP,50,50); 
   }
   
      public int puntajeFinal2()
   {
    
     return pF3;
      
   }
}


