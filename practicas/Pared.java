import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Pared here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pared extends World {
    /**
     * Constructor for objects of class Pared.
     *
     */
    public Pared()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 640, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLUE);
        background.fill();
        addObject(new Reloj(), 512, 320);
    }
}
