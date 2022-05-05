package Java_GUI;


import javax.swing.*;

// JTable
public class GUI10 {
    public static void main(String[] args) {
        Object[] column = {"MSV", "HoTen", "Lop", "GPA"};
        Object[][] row = {
                {"123", "Nguyen Van Nam", "CNTT1", 3.5},
                {"124", "Pham Van Thuan", "DTVT1", 2.8},
                {"125", "Nguyen Dinh Vu", "CNTT2", 3.0},
                {"126", "Vu Dinh Thao", "DTVT2", 2.9},
                {"123", "Nguyen Van Nam", "CNTT1", 3.5},
                {"124", "Pham Van Thuan", "DTVT1", 2.8},
                {"125", "Nguyen Dinh Vu", "CNTT2", 3.0},
                {"126", "Vu Dinh Thao", "DTVT2", 2.9},
                {"123", "Nguyen Van Nam", "CNTT1", 3.5},
                {"124", "Pham Van Thuan", "DTVT1", 2.8},
                {"125", "Nguyen Dinh Vu", "CNTT2", 3.0},
                {"126", "Vu Dinh Thao", "DTVT2", 2.9},
                {"123", "Nguyen Van Nam", "CNTT1", 3.5},
                {"124", "Pham Van Thuan", "DTVT1", 2.8},
                {"125", "Nguyen Dinh Vu", "CNTT2", 3.0},
                {"126", "Vu Dinh Thao", "DTVT2", 2.9},
                {"123", "Nguyen Van Nam", "CNTT1", 3.5},
                {"124", "Pham Van Thuan", "DTVT1", 2.8},
                {"125", "Nguyen Dinh Vu", "CNTT2", 3.0},
                {"126", "Vu Dinh Thao", "DTVT2", 2.9},
                {"123", "Nguyen Van Nam", "CNTT1", 3.5},
                {"124", "Pham Van Thuan", "DTVT1", 2.8},
                {"125", "Nguyen Dinh Vu", "CNTT2", 3.0},
                {"126", "Vu Dinh Thao", "DTVT2", 2.9},
                {"123", "Nguyen Van Nam", "CNTT1", 3.5},
                {"124", "Pham Van Thuan", "DTVT1", 2.8},
                {"125", "Nguyen Dinh Vu", "CNTT2", 3.0},
                {"126", "Vu Dinh Thao", "DTVT2", 2.9}
        };
        JTable table = new JTable(row, column);

        JFrame frame = new JFrame("JTable Example");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(new JScrollPane(table)); // co tac dung giup table co the cuon len xuong, va hien thi du ten cot
        frame.setVisible(true);
    }
}
