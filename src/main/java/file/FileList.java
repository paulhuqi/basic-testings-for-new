package file;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class FileList {
    
    public static void main(String[] args) {
        BlockingQueue<File> queue = new LinkedBlockingDeque<>(2);
        File file = new File("C:\\test");
        fileScan(queue, file);
        File f = null;
        while ((f = queue.poll()) != null) {
            System.out.println("file: " + f.getAbsolutePath());
        }
    }
    
    private void fileList() {
        File file = new File("C:\\test");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println("file: " + f.getAbsolutePath());
        }
    }
    
    private static void fileScan(BlockingQueue<File> queue, File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f :
                        files) {
                    if (f.isDirectory()) {
                        fileScan(queue, f);
                    } else {
                        try {
                            queue.put(f);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else {
            return;
        }
    }
}
