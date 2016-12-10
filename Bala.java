import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
   public Boolean Mov;
   public int Nivel;
   private Fondo img0 =new Fondo(), img1;
   private scroll scrollex = new scroll();
   int x=100,y=419,band = 0,band2= 0,bandF = 0;
   //mi_mundo m;
   int puntaje = 0;
      
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
       
        int g=10,t=1,angulo,velocidad=0,inicial=0;
        
        
        if(Mov)
        {
            if(Nivel == 1)
               puntaje+=1;
            if(Nivel == 2)
               puntaje+=3;
            if(Nivel == 3)
               puntaje+=5;   
               
            if(band==0)
            {
                //x = 100;
                //y = 419;
                x = (x+1); //Arriba
                y = ((y-1) - ((1/2)*g)); //Arriba  
            }
           else {int y =getY();}
            if(getY()<= 0 || band==1)
            {
                if(band2 ==0)///Se mueve en linea recta de x
                {
                    x = (x+5);
                    band2 =1;
                }
                x = (x+1) * t; //Caida libre 
                y = ((y+1 * (t)) - ((1/2)*(g)*(t)*(t))); //Caida libre
                //y = getY()+g;
                //img0.mueve_Fondo();
                band=1;
            }
            setLocation((int)x,(int)y);
            
            if(y == 419)
            {
               //Greenfoot.stop();
               bandF = 1;
                          
            }
                  
        }
          
    }
    public void setX(int x)
    {
        this.x=x;
        
    }
    
    public void setY(int y)
    {
        this.y=y;
        
    }
   
    public int dameBand()
    {
      return bandF;
    }
    
    public int damePuntaje()
    {
        return puntaje;
    }
    
}
