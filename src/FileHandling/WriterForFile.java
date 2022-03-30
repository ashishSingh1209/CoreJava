package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriterForFile {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("FileOperation.txt");
        write(f);

    }

    static void write(FileWriter f) throws IOException {
        String s = "A named location used to store related information is referred to as a File.";
        f.write(s);
        f.close();
    }
}
