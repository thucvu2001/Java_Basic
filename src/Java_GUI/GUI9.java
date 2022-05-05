package Java_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Scanner;

import Java_GUI.Account;

public class GUI9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Account> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            String username = sc.nextLine();
            String password = sc.nextLine();
            String position = sc.nextLine();
            arr.add(new Account(hoTen, username, password, position));
        }
        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 400, 400);
        panel.setBackground(Color.gray);

        JLabel lbl1 = new JLabel("Username");
        JLabel lbl2 = new JLabel("Password");
        lbl1.setBounds(50, 80, 100, 30);
        lbl2.setBounds(50, 130, 100, 30);
        panel.setLayout(null);
        panel.add(lbl1);
        panel.add(lbl2);

        JLabel lbl3 = new JLabel();
        JLabel lbl4 = new JLabel();
        lbl3.setBounds(100, 250, 250, 30);
        lbl4.setBounds(130, 300, 200, 30);
        panel.add(lbl3);
        panel.add(lbl4);

        JTextField text1 = new JTextField();
        text1.setBounds(150, 80, 100, 30);
        JPasswordField text2 = new JPasswordField();
        text2.setBounds(150, 130, 100, 30);

        panel.add(text1);
        panel.add(text2);

        JButton btnLogin = new JButton("Login");
        JButton btnCancel = new JButton("Cancel");
        btnLogin.setBounds(90, 180, 100, 30);
        btnCancel.setBounds(220, 180, 100, 30);
        btnLogin.setBackground(Color.BLUE);
        btnCancel.setBackground(Color.red);
        panel.add(btnLogin);
        panel.add(btnCancel);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = text1.getText();
                String pass = new String(text2.getPassword());
                boolean ok = false;
                int pos = 0;
                for (int i = 0; i < n; i++) {
                    if (arr.get(i).checkLogin(user, pass)) {
                        pos = i;
                        ok = true;
                        break;
                    }
                }
                if (ok) {
                    lbl3.setText("Welcome!");
                    lbl4.setText("Xin chao " + arr.get(pos).getHoTen());
                } else {
                    lbl3.setText("Tai khoan khong ton tai ! Vui long thu lai !");
                    lbl4.setText("");
                }
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text2.setText("");
                lbl3.setText("GoodBye!");
                lbl4.setText("");
            }
        });

        JFrame frame = new JFrame("JPanel Example");
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setLocationRelativeTo(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
