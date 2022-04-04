package JavaMethodRefrence;

interface ContructorInter {
    Messgage getMassage(String msg);
}

class Messgage {
    Messgage(String str) {
        System.out.println("Sending... " + str);
    }
}

public class ContructorResference {
    public static void main(String[] args) {
        ContructorInter contructorInter = Messgage::new;
        contructorInter.getMassage("Hii");
    }
}
