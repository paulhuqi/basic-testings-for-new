package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileReader {
    
    public static void main(String[] args) {
        readFileByLines();
    }
    
    private static void readFileByLines() {
        File file = new File("C:\\test\\test.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new java.io.FileReader(file));
            String record = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while (true) {
                record = reader.readLine();
                // 显示行号
                if (record != null) {
                    System.out.println("consumed line: " + record);
                }
                line++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
