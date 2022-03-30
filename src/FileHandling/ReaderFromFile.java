package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("FileOperation.txt");
        read(f);

    }
    static void read(File f) throws FileNotFoundException {
        Scanner sc  = new Scanner(f);
        while (sc.hasNextLine()){
            String s  = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    }
}
