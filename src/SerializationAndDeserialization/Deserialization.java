package SerializationAndDeserialization;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        Employee employee = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("Serialiazation.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Name of the Employee: "+employee.name);
            System.out.println("Address of the Employee: "+employee.add);
            System.out.println("Salary of the Employee: "+employee.salary);
        }

    }
}
