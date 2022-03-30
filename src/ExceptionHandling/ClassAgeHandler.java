package ExceptionHandling;

import java.util.Scanner;

public class ClassAgeHandler {
    public static void main(String args[]) throws CustomizedException{
        Scanner sc  = new Scanner(System.in);
        if(sc.nextInt()<18){
            throw new CustomizedException("Age of the person is below 18");
        }else throw new CustomizedException2("Age of the person is above 18, and your eligible for voting");
    }
}
