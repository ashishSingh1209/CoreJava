package SerializationAndDeserialization;

import java.io.Serializable;

public class Employee implements Serializable{

    //If you don't want to serialize any data member of a class, you can mark it as transient.  Return Zero when
    //we call from the deserialization class or ObjectInputStream object;
    transient public int salary;
    public String name;
    public String add;
}
