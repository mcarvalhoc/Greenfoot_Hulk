// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Mosca extends Actor
{
    private Integer contador = 0;

    /**
     * 
     */
    public Mosca()
    {
    }

    /**
     * Act - do whatever the Mosca wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        contador = contador - 1;
        setLocation(getX() + 2, getY());
        if (getX() >= 590) {
            getWorld().addObject( new  Mosca(), 25, Greenfoot.getRandomNumber(400));
            saiMosca();
        }
    }

    /**
     * 
     */
    public void saiMosca()
    {
        getWorld().removeObject(this);
    }
}
