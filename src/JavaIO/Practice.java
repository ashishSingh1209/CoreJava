package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
    public static void main(String[] args) throws IOException, FileNotFoundException{
//        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
//        fileOutputStream.write(67);
//        fileOutputStream.flush();
//        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        int b =0;
        int n  = fileInputStream.available();
        for(int i =0;i<n;i++){
            b = fileInputStream.read();
            System.out.print ((char)b);
        }



    }
}
