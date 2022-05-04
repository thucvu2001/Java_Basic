package Java_GUI;

import javax.swing.*;
import java.awt.*;

public class GUI9 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 200, 200);
        panel.setBackground(Color.GREEN);

        JLabel lbl1 = new JLabel("username");
        JLabel lbl2 = new JLabel("password");
        lbl1.setBounds(50, 50, 100, 30);
        lbl2.setBounds(50, 80, 100, 30);
        panel.setLayout(null);
        panel.add(lbl1);
        panel.add(lbl2);

        JFrame frame = new JFrame("JPanel Example");
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setLocationRelativeTo(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
        //36:20
    }
}
