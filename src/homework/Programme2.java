package homework;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        System.out.println("Please enter the year here");
        int year=s.nextInt();
        Programme2 leapyear = new Programme2();
        leapyear.isItLeapYear(year);
        s.close();
    }
    public static void isItLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println(year+ " is a leap year");
            return;
        }else
            System.out.println(year+ " is not a leap yeat");
        }
    }