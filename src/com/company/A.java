package com.company;

abstract public class A {
    abstract void name(String s);
}
class B extends A{
    @Override
    void name(String s) {
        System.out.println("In B: "+s);
    }
}
class C extends A{
    @Override
    void name(String s) {
        System.out.println("In C: "+s);
    }
}
class Test{
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        b.name("Hey");
        c.name("Hii");
    }
}

