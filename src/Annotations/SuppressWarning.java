package Annotations;
import java.util.ArrayList;


/*
Java Annotation is a tag that represents the metadata i.e. attached with class, interface,
methods or fields to indicate some additional information which can be used by java compiler and JVM.*/
public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        ArrayList list=new ArrayList();
        list.add("sonoo");
        list.add("vimal");
        list.add("ratan");

        for(Object obj:list)
            System.out.println(obj);

    }
}
