package ncu.sw.gameUtility;

import javafx.scene.image.Image;

/**
 * Created by Arson on 2016/11/1.
 */
public class Obstacle extends GameObject{

    public Obstacle(double x,double y) {
        super(x,y,20,20);
        setAttribute(1);
    }
}