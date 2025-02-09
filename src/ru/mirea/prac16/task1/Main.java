package ru.mirea.prac16.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    int attempts = 0;
    JButton button = new JButton("Guess");
    JTextField field = new JTextField(50);
    JTextArea area = new JTextArea();
    Font font = new Font("Times new roman", Font.BOLD, 50);
    public Main() {
        JFrame frame = new JFrame("Guess the number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(field, BorderLayout.SOUTH);
        frame.add(area, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
        area.setFont(font);
        area.setText("Enter the number here");
        field.setFont(font);
        field.setText("You didn't write anything");
        button.setFont(font);
        int target = (int) (Math.random() * 20);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int x = Integer.parseInt(area.getText().trim());
                    attempts++;
                    if(attempts >= 3) {
                        JOptionPane.showMessageDialog(null, "You're loser. The right number is "+target, "Loser!",
                                JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    if (x < target) {
                        field.setText("The number is smaller than target");
                    } else if (x > target) {
                        field.setText("The number is bigger than target");
                    } else if(x == target) {
                        JOptionPane.showMessageDialog(null, "You're winner!", "Winner!",
                                JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Can't parse number!", "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setSize(750,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
