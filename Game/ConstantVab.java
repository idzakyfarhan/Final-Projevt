package Game;

import java.awt.*;


public interface ConstantVab { //interface
    static int plusMethod(int x, int y) {
        return x * y;
    }

    static int plusMethod(int x, int y,int z) {
        return x + y + z;
    }

    int myNum1 = plusMethod(5, 5);
    int myNum2 = plusMethod(99,1,0);


    static final double half = 0.5555;
    static final int GAME_WIDTH= 1000;
    static final int GAME_HEIGHT= (int)(GAME_WIDTH * ((float)half)); /* using casting conversion by converting double to float */
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
    static final int BALL_DIAMETER = myNum1;
    static final int PADDLE_WIDTH =25;
    static final int PADDLE_HEIGHT = myNum2;
}
