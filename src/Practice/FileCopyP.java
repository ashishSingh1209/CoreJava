package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyP {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String destination = sc.nextLine();
        FileInputStream fileInputStream = new FileInputStream(src);
        FileOutputStream fileOutputStream = new FileOutputStream(destination);
        copyFile(fileInputStream, fileOutputStream);
    }

    private static void copyFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        int bytesAvailable = fileInputStream.available();

        if (bytesAvailable != 0) {
            for (int i = 0; i < bytesAvailable; i++) {
                int bytes = fileInputStream.read();
                fileOutputStream.write(bytes);
            }
        }
    }
}
