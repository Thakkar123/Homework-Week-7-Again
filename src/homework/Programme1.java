package homework;
//Write a java program that tells us that Input number is odd or even?
//        HINT: use ternary operator (? :)

import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {
        System.out.println(" please enter the number");
        Scanner p = new Scanner(System.in);
        int number=p.nextInt();
        p.close();
        String result = (number%2==0)?"Even":"Odd";
        System.out.println("The number "+ number+ " is "+result+ " number");
    }
}
