import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Manecilla para indicar la hora, los minutos o los segundos.
 *
 * @author Juan Germán Castañeda Echevarría
 * @version 1.0
 */
public class Manecilla extends Actor {
    private final int _limite;
    private int _valor;

    public Manecilla(int limite) {
        this(limite, 0);
    }

    public Manecilla(int limite, int valor) {
        _limite = limite;
        _valor = valor;
    }

    /**
     * Incrementa en 1 su valor.
     * @return true si dio una vuelta completa.
     */
    public boolean incrementa()
    {
        int rot = getRotation() + (360/_limite);
        boolean dioVuelta = rot >= 360;

        if (dioVuelta) {
            rot = 0;
        }

        setRotation(rot);

        return dioVuelta;
    }
}
