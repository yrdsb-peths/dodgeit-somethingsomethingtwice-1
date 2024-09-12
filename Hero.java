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
    boolean gameOver = false;
    
    public void act()
    {
        if (!gameOver && Greenfoot.mousePressed(null))
            atTop = !atTop;
        
        if (atTop)
            setLocation(100, 100);
        else
            setLocation(100, 300);
    }
    
    public void startGameOver() {
        gameOver = true;
    }
}
