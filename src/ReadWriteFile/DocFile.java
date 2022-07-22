package ReadWriteFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class DocFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data1.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while (true) {
                line = br.readLine(); // đọc từng dòng
                if (line == null) { // nếu dòng hiện tại là null
                    break; // thì dừng chương trình
                }
                System.out.println(line);
            }
        } catch (Exception e) {

        }
    }
}
