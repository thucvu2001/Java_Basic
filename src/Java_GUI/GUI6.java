package Java_GUI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import java.util.TreeSet;

public class GUI6 {
    public static void main(String[] args) {
        JTextArea jta = new JTextArea();
        jta.setBounds(100, 100, 300, 300);
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);

        JButton btn = new JButton("Count");
        btn.setBounds(100, 450, 80, 30);

        JLabel jbl = new JLabel("so luong dong: ");
        JLabel jbl2 = new JLabel("so luong tu: ");
        jbl.setBounds(280, 450, 100, 30);
        jbl2.setBounds(280, 490, 100, 30);

        JTextField jtf = new JTextField();
        jtf.setBounds(400, 490, 50, 30);
        JTextField jtf2 = new JTextField();
        jtf2.setBounds(400, 450, 50, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = jta.getLineCount();
                String tmp = jta.getText();
                String[] arr = tmp.split("\\s+");
                Set<String> se = new TreeSet<>();
                for (int i = 0; i < arr.length; i++) {
                    se.add(arr[i]);
                }
                jtf.setText("" + se.size());
                jtf2.setText("" + n);
            }
        });

        JFrame frame = new JFrame("JTextArea Example");
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(jta);
        frame.add(jbl);
        frame.add(jbl2);
        frame.add(btn);
        frame.add(jtf);
        frame.add(jtf2);
        frame.setVisible(true);
    }
}
