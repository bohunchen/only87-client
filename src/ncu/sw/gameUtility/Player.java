package ncu.sw.gameUtility;

import javafx.scene.image.Image;

/**
 * Created by Arson on 2016/11/1.
 */
public class Player extends GameObject{

    private String identity;
    public Player(double x,double y,String id){
        super(x,y,20,20);
        identity = id;
        setAttribute(0);
    }
}
