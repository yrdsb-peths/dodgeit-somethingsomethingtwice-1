import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Collectible object
 * 
 * @author Ethan
 * @version 12 September, 2024
 */
public class Strawberry extends Actor
{
    int border = getImage().getWidth() / 2;
    
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        
        move(-3);
        if (getX() < -border) {
            SadFace face = new SadFace();
            world.addObject(face, 300, 200);
            
            List<Hero> heroes = world.getObjects(Hero.class);
            for (Hero hero : heroes)
                hero.startGameOver();
                
            world.removeObject(this);
        } else if (isTouching(Hero.class)) {
            world.incrementScore();
            resetStrawberry();
        }
    }
    
    public void resetStrawberry() {
        int x = Greenfoot.getRandomNumber(2);
        if (x == 0)
            setLocation(600 + border, 100);
        else
            setLocation(600 + border, 300);
    }
}
