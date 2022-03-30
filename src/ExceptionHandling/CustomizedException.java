package ExceptionHandling;

public class CustomizedException extends RuntimeException {
    CustomizedException(String str) {
        super(str);
    }
}

class CustomizedException2 extends RuntimeException {
    CustomizedException2(String str) {
        super(str);
    }
}
