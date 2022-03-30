package FileHandling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File f = new File("FileOperation.txt");
        fileInfo(f);
    }

    static void fileInfo(File f) {
        if (f.exists()) {
            System.out.println("Name of the file " + f.getName());
            System.out.println("Path of the file " + f.getAbsolutePath());
            System.out.println("Is file readable? " + f.canRead());
            System.out.println("Is file writable? " + f.canWrite());
            System.out.println("Length of the file " + f.length());
        }
    }
}
