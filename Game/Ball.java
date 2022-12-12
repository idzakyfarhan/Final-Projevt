package Game;

import java.awt.*;
import java.util.*;


public class Ball extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;


    Ball(int x, int y, int width, int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXdirection(randomXDirection*initialSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYdirection(randomYDirection*initialSpeed);

    }

    public void setXdirection(int randomXDirection){
        xVelocity = randomXDirection;
    }

    public void setYdirection(int randomYDirection){
        yVelocity = randomYDirection;
    }

    public void move(){
        x += xVelocity;
        y += yVelocity;

    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y, height, width);

    }




}
