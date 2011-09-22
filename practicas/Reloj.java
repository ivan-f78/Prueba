import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Reloj
 *
 * @author Juan Germán Castañeda
 * @version 1.0
 */
public class Reloj extends Actor {

    private Manecilla _horas;

    public void addedToWorld(World world) {
        _horas = new Manecilla(12);
        world.addObject(_horas, getX(), getY());
    }

    /**
     * Mueve las manecillas
     */
    public void act()
    {
    }
}
