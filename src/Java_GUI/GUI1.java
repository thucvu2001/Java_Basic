package Java_GUI;

import javax.swing.*;

public class GUI1 {
    public static void main(String[] args) {
        JButton btn = new JButton();
        btn.setText("Login");
        btn.setBounds(50, 50, 100, 30);

        //JFrame
        JFrame frame = new JFrame(); // frame la mot khung cua so
        frame.setTitle("Welcome to JAVA GUI");
        frame.setSize(500, 500);
        frame.add(btn); // Then button vao trong frame
        frame.setLayout(null);
        frame.setLocationRelativeTo(frame); // chay cua so se hien o chinh giua man hinh
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sau khi tat thi chuong trinh ket thuc
        frame.setVisible(true); // hien thi frame

    }
}
