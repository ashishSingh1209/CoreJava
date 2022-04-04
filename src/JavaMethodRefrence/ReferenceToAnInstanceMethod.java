package JavaMethodRefrence;
interface Rtim{
    void hi();
}

class RtimClass{
    public void hii(){
        System.out.println("Hiii Dude");
    }
}

public class ReferenceToAnInstanceMethod {
    public static void main(String[] args) {
         RtimClass rtimClass = new RtimClass();
         Rtim rtim = rtimClass::hii;
         rtim.hi();
    }
}
