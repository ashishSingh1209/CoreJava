package JavaMethodRefrence;

import java.util.function.BiFunction;


//ContainingClass::staticMethodName

class WithVaribaleInte {
    static int jj(int a, int b) {
        return a + b;
    }
}

public class WithVariable {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bf = WithVaribaleInte::jj;
        int reslt = bf.apply(12, 34);
        System.out.println(reslt);
    }
}
