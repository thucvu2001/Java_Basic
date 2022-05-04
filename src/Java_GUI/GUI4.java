package Java_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI4 {
    public static boolean prime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        JTextField jtf = new JTextField("nhap so de kiem tra");
        jtf.setBounds(100, 100, 100, 30);

        JLabel ketQua = new JLabel();
        ketQua.setBounds(380, 100, 100, 30);

        JButton btn1 = new JButton("Check");
        btn1.setBounds(250, 100, 80, 30);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long x = Long.parseLong(jtf.getText());
                if (prime(x)) {
                    ketQua.setText("Prime");
                } else {
                    ketQua.setText("Not Prime");
                }
            }
        });

        JFrame frame = new JFrame();
        frame.setTitle("Kiem Tra So Nguyen To");
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(ketQua);
        frame.add(jtf);
        frame.add(btn1);
        frame.setVisible(true);
    }
}
