package Java_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

// JTextField: tao cua so trong frame va co the nhap van ban vao trong do
public class GUI2 {
    public static void main(String[] args) {
        JTextField jtf = new JTextField(); // co the them noi dung vao dau ()
        jtf.setText("JAVA_GUI"); // noi dung ban dau, co the thay doi
        jtf.setBounds(100, 100, 300, 30);

        JLabel jbl = new JLabel("Nhap so: "); // nhan~
        jbl.setBounds(60, 100, 100, 30);

        JButton btn = new JButton("Click");
        btn.setBounds(100, 150, 100, 30);
        btn.addActionListener(new AbstractAction() { // moi lan an button se thuc hien cau lenh ben trong
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf.setText("Ban vua nhan vao button");
            }
        });

        JFrame frame = new JFrame("JTextField Example");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tat cua so se ket thuc chuong trinh
        frame.setLocationRelativeTo(frame); // chay ra trung tam
        frame.add(jbl);
        frame.add(btn);
        frame.add(jtf);
        frame.setVisible(true);
    }
}
