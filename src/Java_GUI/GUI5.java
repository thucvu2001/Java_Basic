package Java_GUI;

import javax.swing.*;

import Java_GUI.Account;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

// tao o dang nhap username password
public class GUI5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Account> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String username = sc.nextLine();
            String password = sc.nextLine();
            String position = sc.nextLine();
            arr.add(new Account(ten, username, password, position));
        }
        JLabel lbl2 = new JLabel("Username:");
        JLabel lbl1 = new JLabel("Password:");
        JLabel lbl3 = new JLabel();
        JLabel lbl4 = new JLabel();

        lbl1.setBounds(30, 100, 100, 30);
        lbl2.setBounds(30, 70, 100, 30);
        lbl3.setBounds(300, 150, 150, 30);
        lbl4.setBounds(150, 200, 150, 30);

        JTextField username = new JTextField();
        username.setBounds(130, 70, 150, 30);

        JPasswordField password1 = new JPasswordField();
        password1.setBounds(130, 100, 150, 30);

        JButton btn = new JButton("Login");
        btn.setBounds(150, 150, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = username.getText();
                String pass = new String(password1.getPassword());
                boolean ok = false;
                int pos = 0;
                for(int i = 0; i < n; i++){
                    if(arr.get(i).checkLogin(user, pass)){
                        ok = true;
                        pos = i;
                        break;
                    }
                }
                if(ok){
                    lbl3.setText("Welcome !");
                    lbl4.setText("Xin chao " + arr.get(pos).getHoTen());

                } else {
                    lbl3.setText("Account does not exist !");
                    lbl4.setText("");
                }
            }
        });

        JFrame frame = new JFrame("PasswordField Example");
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);
        frame.add(username);
        frame.add(password1);
        frame.add(btn);
        frame.setVisible(true);
        // 2:03:30
    }
}
