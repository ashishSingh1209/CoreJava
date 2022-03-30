package SerializationAndDeserialization;

import java.io.*;

public class Serialization{
    public static void main(String[] args) {
        try {
            Employee emp = new Employee();
            emp.add = "Aligarh";
            emp.name = "Ashish";
            emp.salary = 1000;
            FileOutputStream fileOutputStream = new FileOutputStream("Serialiazation.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(emp);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
