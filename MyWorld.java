import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main game world.
 * 
 * @author Ethan
 * @version 11 September, 2024
 */
public class MyWorld extends World
{
    int score = 0;
    Label label = new Label(0, 30);
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Strawberry strawberry = new Strawberry();
        addObject(strawberry, -100, -100);
        strawberry.resetStrawberry();
        
        addObject(label, 300, 30);
    }
    
    public void incrementScore() {
        label.setValue(++score);
    }
}
