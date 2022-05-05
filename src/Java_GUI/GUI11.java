package Java_GUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Java_GUI.HocSinh;

import javax.swing.*;

public class GUI11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<HocSinh> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            list.add(new HocSinh(ma, hoTen, lop, gpa));
        }

        //JTable table = new JTable(Objectp[][] row, Object[] columns)
        Object[] column = {"MSV", "Ho Ten", "Lop", "GPA"}; // hang
        Object[][] row = new Object[n][4];
        for (int i = 0; i < n; i++) {
            row[i][0] = list.get(i).getMaSinhVien();
            row[i][1] = list.get(i).getHoTen();
            row[i][2] = list.get(i).getLop();
            row[i][3] = list.get(i).getGpa();
        }

        JTable table = new JTable(row, column);
        JFrame frame = new JFrame("JTable Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }
}
