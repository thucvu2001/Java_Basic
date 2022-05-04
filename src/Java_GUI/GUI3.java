package Java_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI3 {
    public static void main(String[] args) {
        // tao cac nhan
        JLabel nhap1 = new JLabel("Nhap a: ");
        JLabel nhap2 = new JLabel("Nhap b: ");
        JLabel Result = new JLabel("Ket Qua: ");
        nhap1.setBounds(30, 40, 50, 50);
        nhap2.setBounds(30, 80, 50, 50);
        Result.setBounds(160, 250, 60, 50);

        // tao cac button
        JButton cong = new JButton("+");
        JButton tru = new JButton("-");
        JButton nhan = new JButton("*");
        JButton chia = new JButton("/");
        cong.setBounds(30, 150, 50, 50);
        tru.setBounds(30, 210, 50, 50);
        nhan.setBounds(30, 270, 50, 50);
        chia.setBounds(30, 330, 50, 50);

        // tao cac TextField de nhap va xuat ket qua
        JTextField Nhapso1 = new JTextField();
        JTextField Nhapso2 = new JTextField();
        JTextField ketQua = new JTextField("");
        Nhapso1.setText("Nhap so thu nhat vao day");
        Nhapso2.setText("Nhap so thu hai vao day");
        Nhapso1.setBounds(90, 50, 200, 30);
        Nhapso2.setBounds(90, 90, 200, 30);
        ketQua.setBounds(240, 260, 200, 30);

        // tao event cho button
        cong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long so1 = Long.parseLong(Nhapso1.getText());
                long so2 = Long.parseLong(Nhapso2.getText());
                ketQua.setText((so1 + so2) + "");
            }
        });
        tru.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long so1 = Long.parseLong(Nhapso1.getText());
                long so2 = Long.parseLong(Nhapso2.getText());
                long hieu = so1 - so2;
                ketQua.setText("" + hieu);
            }
        });
        nhan.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long so1 = Long.parseLong(Nhapso1.getText());
                long so2 = Long.parseLong(Nhapso2.getText());
                long tich = so1 * so2;
                ketQua.setText("" + tich);
            }
        });
        chia.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long so1 = Long.parseLong(Nhapso1.getText());
                long so2 = Long.parseLong(Nhapso2.getText());
                if (so2 == 0) {
                    ketQua.setText("Error: Divide by zero");
                } else {
                    double thuong = (double) so1 / so2;
                    ketQua.setText(String.format("%.3f", thuong));
                }
            }
        });

        // tao 1 khung va them cac thanh phan, de hien thi tat ca
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("TINH TOAN 2 SO");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(nhap1);
        frame.add(nhap2);
        frame.add(Result);
        frame.add(cong);
        frame.add(tru);
        frame.add(nhan);
        frame.add(chia);
        frame.add(Nhapso1);
        frame.add(Nhapso2);
        frame.add(ketQua);
        frame.setVisible(true);
    }
}
