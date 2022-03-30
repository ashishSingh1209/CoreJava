package JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputString {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("fileOutPutString.txt");
        FileInputStream fileInputStream1 = new FileInputStream("fileOutPutString.txt");
        FileInputStream fileInputStream2 = new FileInputStream("fileOutPutString.txt");
        readingFile(fileInputStream);
        readingWholeFile(fileInputStream);
        practice(fileInputStream2);

    }

    public static void readingFile(FileInputStream fis) throws IOException {

        System.out.println((char) fis.read());
        System.out.println(fis.read()); // returns ascii value of the first character



    }

    public static void readingWholeFile(FileInputStream fis) throws IOException {

       // fis.reset();
        int i;
        while((i=fis.read())!= -1){
            System.out.print((char)i);
        }
        fis.close();
    }
    public static void practice(FileInputStream fis) throws IOException {
        byte[] b = fis.readAllBytes();
        System.out.println(Arrays.toString(b));
        System.out.println(fis.markSupported());
    }

}
