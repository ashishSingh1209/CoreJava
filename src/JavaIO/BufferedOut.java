package JavaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOut {

    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        bout.write(b);
         bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
