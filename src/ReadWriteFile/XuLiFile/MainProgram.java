package ReadWriteFile.XuLiFile;

import java.io.BufferedReader;
import java.io.IOException;

public class MainProgram {
    public static void main(String[] args) {
        CustomFileProcessor fileProcessor = new CustomFileProcessor();
        String path = "D:\\Java_Basic\\src\\ReadWriteFile\\XuLiFile\\data.txt";

        BufferedReaderProcessor processor = new BufferedReaderProcessor() {
            @Override
            public String process(BufferedReader br) {
                String ans = "";
                while (true) {
                    String tmp;
                    try {
                        tmp = br.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    if (tmp == null) {
                        break;
                    }
                    ans += tmp + "\n";
                }
                return ans;
            }
        };

        String fileContent = fileProcessor.processFile(path, processor);
        System.out.println(fileContent);
    }
}
