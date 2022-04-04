package JavaMethodRefrence;
interface Test{
    String helloWorld();
}

public class StaticMethodRefrence {
    static String hell(){
        return "Hello World";
    }
    public static void main(String[] args) {
        Test t = StaticMethodRefrence::hell;
        System.out.println(t.helloWorld());
    }
}
