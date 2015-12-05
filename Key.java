import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Create a new key.
     */
    public Key()
    {
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if ( Greenfoot.isKeyDown("g") ) {
            setImage("white-key-down.png");
            isDown = true;
        }
        else{
            setImage("white-key.png");
            isDown = false;
        }
    }
}

