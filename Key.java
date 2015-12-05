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
        // if (the piano key is down and the keyboard key is down) {
           // change the image to show the "down" image;
           // remember that the piano key is down now;
        // }
        if ( !isDown && Greenfoot.isKeyDown("g") ) {
            setImage("white-key-down.png");
            isDown = true;
        }
        if ( isDown && !Greenfoot.isKeyDown("g") ) {
            setImage("white-key.png");
            isDown = false;
        }
    }
    private boolean isDown;
}

