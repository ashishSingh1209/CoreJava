package FileHandling;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("FileOperation1.txt");
        delete(f);
    }

    static void delete(File f) throws IOException {
        if (f.delete()) {
            System.out.println("File " + f.getName() + " deleted.");
        } else {
            System.err.println("file does not exist");

            int i=System.in.read();//returns ASCII code of 1st character
            System.out.println((char)i);//will print the character

        }
    }


}
