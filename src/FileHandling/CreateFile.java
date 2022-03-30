package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("FileOperation.txt");
        createFile(f);

    }

    static void createFile(File f) throws IOException {
       if(f.createNewFile()) System.out.println("File "+ f.getName()+ " created successfully");
       else System.out.println("File already exist in the directory");


    }
}
