package ReadWriteFile.XuLiFile;

import java.io.BufferedReader;
import java.io.FileReader;

@FunctionalInterface
interface BufferedReaderProcessor {
    String process(BufferedReader br);
    default void sayHello(){
        System.out.println("Hello");
    }
}

public class CustomFileProcessor {
    public String processFile(String path, BufferedReaderProcessor processor) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return processor.process(br);
        } catch (Exception e) {
            return null;
        }
    }
}
