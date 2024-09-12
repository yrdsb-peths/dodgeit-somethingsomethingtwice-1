import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Wombat character. The character you play as.
 * 
 * @author Ethan
 * @version 11 September, 2024
 */
public class Hero extends Actor
{
    boolean atTop = true;
    
    public void act()
    {
        if (Greenfoot.mousePressed(null))
            atTop = !atTop;
        
        if (atTop)
            setLocation(100, 100);
        else
            setLocation(100, 300);
    }
}
