package com.company;

import java.io.*;

public class FileHandlingInput {

    public static void main(String[] args) throws IOException {
        File f = new File("helo.txt");
       writeFile(f);
        readingFile(f);


    }

    static void readingFile(File f) throws IOException {
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String s = dis.readUTF();
        System.out.println(s);
    }

    static void writeFile(File f) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fileOutputStream);
        String s = "Hello World isdghisbdjfbsg ";
        dos.writeUTF(s);

    }


}

