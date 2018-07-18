// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Placar extends Actor
{
    private Integer contador = 0;

    /**
     * 
     */
    public Placar()
    {
    }

    /**
     * Act - do whatever the Placar wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText(String.valueOf(contador), 300, 25);
        finalizaJogoVencedor();
        finalizaJogoPerdedor();
    }

    /**
     * 
     */
    public void adicionaPontoApple()
    {
        contador = contador + 5;
    }

    /**
     * 
     */
    public void adicionaPontoRocha()
    {
        contador = contador + 1;
    }

    /**
     * 
     */
    public void adicionaPontoCereja()
    {
        contador = contador - 5;
    }

    /**
     * 
     */
    public void adicionaPontoMosca()
    {
        contador = contador - 1;
    }

    /**
     * 
     */
    public void finalizaJogoVencedor()
    {
        if (contador == 100) {
            getWorld().showText("Você Venceu", 300, 200);
            Greenfoot.stop();
        }
    }

    /**
     * 
     */
    public void finalizaJogoPerdedor()
    {
        if (contador <= -1) {
            getWorld().showText("Você Perdeu", 300, 200);
            Greenfoot.stop();
        }
    }
}
