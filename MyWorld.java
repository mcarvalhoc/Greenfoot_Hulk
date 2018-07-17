// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private Integer ciclo = 0;
    private Hulk hulk = null;
    private Apple apple = null;
    private Placar placar = null;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        hulk =  new  Hulk();
        addObject(hulk, 212, 189);
        adicionaApple();
        placar =  new  Placar();
        addObject(placar, 315, 40);
    }

    /**
     * 
     */
    public void contaCiclo()
    {
        ciclo = ciclo + 1;
        if (ciclo > 1000) {
            ciclo = 0;
        }
    }

    /**
     * 
     */
    public int getCiclo()
    {
        return ciclo;
    }

    /**
     * 
     */
    public void act()
    {
        contaCiclo();
    }

    /**
     * 
     */
    public void contaApple()
    {
        placar.adicionaPonto();
    }

    /**
     * 
     */
    public void adicionaApple()
    {
        addObject( new  Apple(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
}
