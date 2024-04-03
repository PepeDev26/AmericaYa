/**
 * America ya :D!! TikTok Trend in Java
 *
 * @Author: PepeDev26
 * @Version; 2024.04
 */
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("AMERICA YA :D!! ");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new JButton
        JButton button = new JButton("AMERICA YA :D!!");
        frame.getContentPane().add(button);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a Timer that fires every 500 milliseconds
                new Timer(500, new ActionListener() {
                    private int counter = 0;

                    public void actionPerformed(ActionEvent e) {
                        if (counter < 20) {
                            // Create a new JFrame
                            JFrame newFrame = new JFrame("HELLO :D!! ");
                            newFrame.setSize(300, 200);
                            newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                            // Create a new JButton
                            JButton newButton = new JButton("HELLO :D!!");
                            newFrame.getContentPane().add(newButton);

                            // Center the window
                            newFrame.setLocationRelativeTo(null);

                            // Make the window visible
                            newFrame.setVisible(true);

                            counter++;
                        } else {
                            // Stop the Timer
                            ((Timer) e.getSource()).stop();
                        }
                    }
                }).start();
            }
        });

        // Center the main window
        frame.setLocationRelativeTo(null);

        // Make the main window visible
        frame.setVisible(true);
    }
}