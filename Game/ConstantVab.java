package Game;

import java.awt.*;

public interface ConstantVab {
    static final double half = 0.5555;
    static final int GAME_WIDTH= 1000;
    static final int GAME_HEIGHT= (int)(GAME_WIDTH * ((float)half)); /* using casting conversion by converting double to float */
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH =25;
    static final int PADDLE_HEIGHT =100;
}
