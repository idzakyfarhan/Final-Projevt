package Login;

import Game.GameFrame;
import Game.PongGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends Component implements ActionListener {

    JFrame frame = new JFrame();

    JLabel welcomeLabel = new JLabel("Hello! ");
    JButton playButton = new JButton("Ping Pong");

    WelcomePage(String userID){

        welcomeLabel.setBounds(150,100,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hello " + userID);

        playButton.setBounds(150,150,100,25);
        playButton.setFocusable(true);
        playButton.setVisible(true);
        playButton.addActionListener(this);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(playButton);
        frame.setLocationRelativeTo(null);


//        PongGame pongGame = new PongGame();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==playButton) {
            PongGame pongGame = new PongGame();
        }





    }
}
