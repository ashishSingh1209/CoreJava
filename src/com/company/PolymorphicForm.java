package com.company;

class A1 {
    public void a(){
        System.out.println("In A1");
    }
}
class B1 extends A1{
    @Override
    public void a() {
        System.out.println("In B1");
    }
}

public class PolymorphicForm {
    public static void main(String[] args) {
        A1 a =  new B1(); //ClassCastException
        a.a();
    }
}
