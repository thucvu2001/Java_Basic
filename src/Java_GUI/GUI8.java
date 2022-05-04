package Java_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI8 {
    public static boolean thuanNghich(String s) {
        StringBuilder sb = new StringBuilder(s);
        String t = (sb.reverse()).toString();
        return t.equals(s);
    }

    public static void main(String[] args) {
        JTextArea text = new JTextArea("");
        text.setBounds(50, 50, 300, 300);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);

        JLabel lbl = new JLabel();
        lbl.setBounds(150, 360, 100, 30);

        JButton btn = new JButton("Count");
        btn.setBounds(50, 360, 80, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = text.getText();
                String[] word = data.split("\\s+");
                int cnt = 0;
                for(String x : word){
                    if(thuanNghich(x)){
                        cnt++;
                    }
                }
                lbl.setText("" + cnt);
            }
        });

        JFrame frame = new JFrame("JTextArera Example: dem so tu thuan nghich");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(text);
        frame.add(btn);
        frame.add(lbl);
        frame.setVisible(true);
    }
}
