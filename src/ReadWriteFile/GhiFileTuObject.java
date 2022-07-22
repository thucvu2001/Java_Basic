package ReadWriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class GhiFileTuObject {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen van a", 20, 5.5);
        Student student2 = new Student("Nguyen van b", 21, 6.5);
        Student student3 = new Student("Nguyen van c", 22, 7.5);
        Student student4 = new Student("Nguyen van d", 23, 8.5);
        Student student5 = new Student("Nguyen van e", 24, 9.5);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        try {
            FileWriter fw = new FileWriter("data1.txt" /*,true*/);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Student student : list) {
                bw.write(student.toString());
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (Exception e) {

        }
    }
}
