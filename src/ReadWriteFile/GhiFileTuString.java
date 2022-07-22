package ReadWriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class GhiFileTuString {
    public static void main(String[] args) {
        String txt = "nguyen van a";
        String[] arr = {"nguyen van a", "nguyen van b", "nguyen van c", "nguyen thi d"};
        try {
            FileWriter fw = new FileWriter("data.txt"); // nếu file data.txt có dữ liệu thì sẽ bị xoá và ghi dữ liệu mới
            FileWriter fw1 = new FileWriter("data.txt", true); // ghi thêm dữ liệu vào file ban đầu, không xoá đi
            BufferedWriter bw = new BufferedWriter(fw);

            // bw.write(txt); // ghi String txt vào file data.txt thông qua BufferedWriter fw
            for (String s : arr) {
                bw.write(s);
                bw.newLine(); // xuống dòng (tạo dòng mới) khi ghi một String khác
            }

            bw.close(); // đóng sau khi ghi
            fw.close(); // đóng sau khi ghi
        } catch (Exception e) {

        }

    }
}
