package Java_GUI;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI7 {
    public static void main(String[] args) {
        JCheckBox checkBox1 = new JCheckBox("JAVA");
        JCheckBox checkBox2 = new JCheckBox("C++");
        checkBox1.setBounds(30, 100, 100, 30);
        checkBox2.setBounds(30, 150, 100, 30);

        JLabel jbl1 = new JLabel();
        jbl1.setBounds(30, 250, 100, 30);

        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != 0) {
                    jbl1.setText("Java");
                } else {
                    jbl1.setText("");
                }
            }
        });

        checkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != 0) {
                    jbl1.setText("C++");
                } else {
                    jbl1.setText("");
                }
            }
        });

        JFrame frame = new JFrame("JCheckBox Example");
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(jbl1);
        frame.setVisible(true);
    }
}
