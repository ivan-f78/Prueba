import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Reloj
 *
 * @author Juan Germán Castañeda
 * @version 1.0
 */
public class Reloj extends Actor {

    private Manecilla _horas;
    
    private Manecilla _minutos;

    public void addedToWorld(World world) {
        _horas = new Manecilla(10);
        world.addObject(_horas, getX(), getY());
        
        _minutos = new Manecilla(120);
        world.addObject(_minutos, getX(), getY());
    }

    /**
     * Mueve las manecillas
     */
    public void act()
    {
        _horas .incrementa();
        
        _minutos .incrementa();
    }
}
