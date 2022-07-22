package ReadWriteFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFileAndAddToListStudent {
    public static List<Student> readFromFile() {
        List<Student> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("data1.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(";");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark = Double.parseDouble(txt[2]);
                Student student = new Student(name, age, mark);
                list.add(student);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> students = readFromFile();
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
