package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String dstn = sc.nextLine();
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dstn);
        copyFile(fos, fis);

    }

    public static void copyFile(FileOutputStream fos, FileInputStream fis) throws IOException {
        int numberOfBytes = fis.available();
        for (int i = 0; i < numberOfBytes; i++) {
            int n = fis.read();
            fos.write(n);
        }
        fos.flush();
        fos.close();
        fis.close();
        System.out.println("File copied successfully.");

    }
}
