package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutString {
    public static void main(String[] args) throws IOException {
      FileOutputStream fileOutputStream = new FileOutputStream("fileOutPutString.txt");
      String s = "Welcome to FileOutPut.";
      byte b[] = s.getBytes(); //Use for string
      int n = 65;
      creatingfile(fileOutputStream,b,n);

    }

    public static void creatingfile(FileOutputStream fos, byte[] b, int n) throws IOException {
        fos.write(b);
        fos.write(n); //Write ASCII value to the file
        fos.close();
        System.out.println("file Created");
    }
}
