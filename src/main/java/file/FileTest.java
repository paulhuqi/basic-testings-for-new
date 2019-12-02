package file;

import java.io.File;
import java.io.IOException;

/**
 * description:
 * creator: Rzxuser
 * create time: 2019/11/27 16:18
 **/
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\test_data\\pic_down\\zhanzhu\\test\\source\\11010419741004251X_.jpg");
        System.out.println("file.getAbsolutePath() : " + file.getAbsolutePath());
        System.out.println("file.getName() : " + file.getName());
        System.out.println("file.getCanonicalPath() : " + file.getCanonicalPath());
        System.out.println("file.getParent() : " + file.getParent());
        System.out.println("file.getPath() : " + file.getPath());
        System.out.println("file.getAbsoluteFile().getName() : " + file.getAbsoluteFile().getName());
        System.out.println("file.getCanonicalFile() : " + file.getCanonicalFile());
        System.out.println("file.getParentFile().getName() : " + file.getParentFile().getName());
        file.getName().lastIndexOf("\\.");
        System.out.println("file size: " + file.length());
    }
}
