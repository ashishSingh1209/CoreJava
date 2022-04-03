package Collections.List;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SerializationAndDeserialization {

    public static void writing(FileOutputStream fileOutputStream, ArrayList<Integer> arrayList) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(arrayList);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static void reading(FileInputStream fileInputStream) throws IOException, ClassNotFoundException {
        ArrayList<Integer> a;
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        a = (ArrayList<Integer>) objectInputStream.readObject();
        for (Integer integer : a) {
            System.out.println(integer);
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("ArrayList.txt");

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
       writing(fileOutputStream, a);
        FileInputStream fileInputStream = new FileInputStream("ArrayList.txt");

        reading(fileInputStream);

    }
}
