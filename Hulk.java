// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Hulk extends Actor
{
    private Integer imagem = 1;

    /**
     * 
     */
    public Hulk()
    {
    }

    /**
     * Act - do whatever the Hulk wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* Movimento Hulk.*/
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 1, getY());
            caminhaParaDireita();
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 1, getY());
            caminhaParaEsquerda();
        }
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 1);
            caminhaParaCima();
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 1);
            caminhaParaBaixo();
        }
        /* Hulk  come maçâ.*/
        if (isTouching(Apple.class)) {
            getWorldOfType(MyWorld.class).contaApple();
            getWorldOfType(MyWorld.class).adicionaApple();
            removeTouching(Apple.class);
        }
    }

    /**
     * 
     */
    public void atualizaImagem()
    {
        float resultado = 0;
        resultado = getWorldOfType(MyWorld.class).getCiclo() % 8;
        if (resultado == 0) {
            imagem = imagem + 1;
        }
    }

    /**
     * 
     */
    public void caminhaParaBaixo()
    {
        if (imagem >= 1) {
            if (imagem <= 4) {
                setImage("hulk/down_0" + imagem + ".png");
                atualizaImagem();
            }
        }
        if (imagem > 4) {
            imagem = 1;
        }
    }

    /**
     * 
     */
    public void caminhaParaCima()
    {
        if (imagem >= 1) {
            if (imagem <= 4) {
                setImage("hulk/up_0" + imagem + ".png");
                atualizaImagem();
            }
        }
        if (imagem > 4) {
            imagem = 1;
        }
    }

    /**
     * 
     */
    public void caminhaParaEsquerda()
    {
        if (imagem >= 1) {
            if (imagem <= 4) {
                setImage("hulk/left_0" + imagem + ".png");
                atualizaImagem();
            }
        }
        if (imagem > 4) {
            imagem = 1;
        }
    }

    /**
     * 
     */
    public void caminhaParaDireita()
    {
        if (imagem >= 1) {
            if (imagem <= 4) {
                setImage("hulk/right_0" + imagem + ".png");
                atualizaImagem();
            }
        }
        if (imagem > 4) {
            imagem = 1;
        }
    }
}
