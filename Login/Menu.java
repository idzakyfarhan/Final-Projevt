package Login;

import Game.PongGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Component implements ActionListener {

    JFrame frame = new JFrame();

    JLabel welcomeLabel = new JLabel("Hello! ");
    JButton playButton = new JButton("Ping Pong");
    JButton historyButton = new JButton("User ID and Pass");
    JLabel historyLabel = new JLabel();
    JTextArea userHistory = new JTextArea();



    Menu(String userID){

        welcomeLabel.setBounds(140,100,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hello " + userID + "!");

        playButton.setBounds(150,150,100,25);
        playButton.setFocusable(true);
        playButton.setVisible(true);
        playButton.addActionListener(this);

        historyButton.setBounds(130,200,150,25);
        historyButton.setFocusable(true);
        historyButton.setVisible(true);
        historyButton.addActionListener(this);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(playButton);
        frame.add(historyButton);
        frame.setLocationRelativeTo(null);

    }

/*overriding*/
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==playButton) {
            PongGame pongGame = new PongGame();
            playerIns myPlayer1 = new playerIns();
            playerIns2 myPlayer2 = new playerIns2();
            //polymorphism
            myPlayer1.printing();
            myPlayer2.printing();
        }

        if(e.getSource()==historyButton) {
            History history1 = new History();

        }


    }
}
