package Game;

import java.awt.*;
import java.awt.event.*;


class Paddle extends Rectangle{ //inheritance

    int id;
    int yVelocity;
    int speed = 10;


    Paddle(int x,int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
    }

    public void keyPressed(KeyEvent e){
        switch (id) {
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W) {
                    setYdirection(-speed);
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_S) {
                    setYdirection(speed);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_UP) {
                    setYdirection(-speed);
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYdirection(speed);
                    move();
                }
                break;
        }

    }

    public void keyReleased(KeyEvent e){
        switch (id) {
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W) {
                    setYdirection(0);
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_S) {
                    setYdirection(0);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_UP) {
                    setYdirection(0);
                    move();
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYdirection(0);
                    move();
                }
                break;
        }


    }

    public void setYdirection(int ydirection){ //encapsulation
        yVelocity = ydirection;

    }

    public void move() {
        y= y + yVelocity;

    }

    public void draw(Graphics g){
        if(id==1)
            g .setColor(Color.red);
        else
            g.setColor(Color.blue);
        g.fillRect(x,y,width,height);

    }

}
