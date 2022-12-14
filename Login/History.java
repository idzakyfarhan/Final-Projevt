package Login;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class History extends JFrame {
    JFrame frame = new JFrame();
    JLabel historyLabel = new JLabel();
    JTextArea userHistory = new JTextArea();

    public History() {
        frame.add(historyLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        userHistory.setBounds(140,100,200,35);
        userHistory.setFont(new Font(null,Font.PLAIN,25));

//        historyLabel.setBounds(1,1,250,10);
//        historyLabel.setText("Helo");

        try {
            File data = new File ("user.txt");
            Scanner dataScanner = new Scanner(data);
            int y = 1;
            while (dataScanner.hasNextLine()) {
                String[] keyValue = dataScanner.nextLine().split(":");
                historyLabel.setBounds(1,y,200,20);
                historyLabel.setText(
                        "Username: " + keyValue[0] + " Password: " + keyValue[1]
                );
                y+=2;
            }

            dataScanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}



