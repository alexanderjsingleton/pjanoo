import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
     private boolean isDown;
     private String key;
     private String sound;
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile)
    {
        key = keyName;
        sound = soundFile;
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
    /**
     * Play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound(sound);
    }
}

