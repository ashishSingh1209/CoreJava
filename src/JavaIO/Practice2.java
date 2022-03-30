package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("abc.txt");
        String s = "ashish";
        byte b [] = s.getBytes();
        wrt(f,b);
    }
    public static void wrt(FileOutputStream fileOutputStream, byte[] b) throws IOException {
        fileOutputStream.write(b,1,3);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
